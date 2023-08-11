package com.laman.paydaytradesystem.model.entity;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.util.List;

@Entity
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "stock")
public class Stock {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String symbol;   // e.g., AAPL for Apple
    String name;
    Double currentPrice;
    Double quantityAvailable;

    //One stock can be involved in multiple transactions
    @OneToMany
    List<Transaction> transaction;
}
