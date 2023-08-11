package com.laman.paydaytradesystem.model.entity;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "orderStock")
public class OrderStock {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String type; //BUY or SELL
    String stockSymbol;
    Double targetPrice;
    Boolean isFilled;

    //many orders belong to one customer
    @ManyToOne(fetch = FetchType.LAZY)
    Customer customer;
}
