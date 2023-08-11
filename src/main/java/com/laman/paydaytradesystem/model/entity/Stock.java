package com.laman.paydaytradesystem.model.entity;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
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
    @NotNull
    String name;
    String brand;
    String info;
    @NotNull
    Double currentPrice;
    Double quantityAvailable;

    // image needed?

    // One stock can be involved in multiple transactions
    @OneToMany
    List<Transaction> transaction;
}
