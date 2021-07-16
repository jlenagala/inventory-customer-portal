package com.janani.inventoryCustomerPortal.service;

import com.janani.inventoryCustomerPortal.model.Category;
import com.janani.inventoryCustomerPortal.model.Item;
import com.janani.inventoryCustomerPortal.model.Payment;
import com.janani.inventoryCustomerPortal.model.Status;
import com.janani.inventoryCustomerPortal.repository.ItemRepository;
import com.janani.inventoryCustomerPortal.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@Service
public class PaymentServiceImpl implements PaymentService {
    @Autowired
    ItemRepository itemRepository;
    @Autowired
    PaymentRepository paymentRepository;

    @Override
    @Transactional
    public Payment calculateTotalAmount(Item item, Payment payment,int qty) {
        BigDecimal itemPrice,discount, discountRate, total = null;
        String s = String.valueOf(item.getDiscount().getDiscountStatus());
        if (s.equals("ADDED")) {
            itemPrice = new BigDecimal(String.valueOf(item.getPrice()));
            discountRate = new BigDecimal(String.valueOf(item.getDiscount().getDiscountRate()));
            discount = itemPrice.multiply(discountRate);
            total = itemPrice.subtract(discount);
            item.setQuantity(item.getQuantity()-qty);
            payment.setAmount(total);
            payment.setItemId(item.getId());
            payment.setPaymentStatus(Status.ADDED);
            payment.setQuanttity(qty);
        }
        else {

            payment.setItemId(item.getId());
            payment.setPaymentStatus(Status.EXPIRED);
            payment.setQuanttity(0);

        }
        paymentRepository.save(payment);
        itemRepository.save(item);
        return payment;
    }

    @Override
    public List<Payment> getAllPayment() {
        return paymentRepository.findAll();
    }

    @Override
    public Payment getPaymentById(int id) {
        Optional<Payment> payment = paymentRepository.findById(id);
        if (payment.isPresent()) {
            return payment.get();
        } else {
            return null;
        }
    }

    @Override
    public Payment addPayment(Payment payment) {
        return paymentRepository.save(payment);
    }

    @Override
    public void deletePaymentById(int id) {
        paymentRepository.deleteById(id);
    }


    @Override
    public Payment calculateTaxedPrice(Item item, Payment payment) {
        BigDecimal subTotal, taxRate, tax, total = null;
        String s = String.valueOf(item.getDiscount().getDiscountStatus());
        if (s.equals("ADDED")) {
            subTotal = new BigDecimal(String.valueOf(item.getPrice()));
            taxRate = new BigDecimal(String.valueOf(item.getTax().getTaxRate()));
            tax = subTotal.multiply(taxRate);
            total = subTotal.add(tax);
            payment.setAmount(total);
            payment.setItemId(item.getId());
            payment.setPaymentStatus(Status.ADDED);
            payment.setQuanttity(2);
        }

        paymentRepository.save(payment);
        return payment;
    }


}