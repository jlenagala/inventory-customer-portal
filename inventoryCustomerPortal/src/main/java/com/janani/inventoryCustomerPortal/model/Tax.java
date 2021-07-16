package com.janani.inventoryCustomerPortal.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Data
@Entity
@Table(name = "tax")
@AllArgsConstructor
@NoArgsConstructor
public class Tax {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private BigDecimal taxRate;

    @Enumerated(EnumType.STRING)
    private Status taxStatus;

    @OneToMany( mappedBy = "tax" )
    @JsonIgnore//stackoverflowerror
    private List<Item> itemList;
}
