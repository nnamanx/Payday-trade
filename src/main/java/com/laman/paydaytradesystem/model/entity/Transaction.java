package com.laman.paydaytradesystem.model.entity;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "transaction")
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    String id;
    String type; //BUY or SELL
    LocalDateTime timestamp;
    Double quantity;
    Double targetPrice;
    Double filledPrice;
    Boolean isFilled;

    @ManyToOne
    Customer customer;

    @ManyToOne
    Stock stock;
}
