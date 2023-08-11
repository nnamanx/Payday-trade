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

    // OrderStock entities store information about open orders that have not yet been executed.
    // In a trading platform, users can place various types of orders,
    // such as market orders (execute immediately at the current market price)
    // or limit orders (execute when the price reaches a specific limit).
    // OrderStock entities help manage and track user requests for trading.

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String type; //BUY or SELL
    String stockSymbol;      // bro, what will this do?
    Double targetPrice;
    Integer quantity;            // transaction
    Boolean isFilled;

    //many orders belong to one customer
    @ManyToOne(fetch = FetchType.LAZY)
    Customer customer;

//    @OneToMany                     needed?
//    List<Stock> stocks;
}
