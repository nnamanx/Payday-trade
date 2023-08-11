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

    // A "Transaction" entity represents an individual action or event involving the buying or selling of a financial asset.
    // Transactions capture the details of the trade, including the asset being traded, the quantity, the price,
    // the date and time, and any associated fees or costs.

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    String id;
    String type; //BUY or SELL
    LocalDateTime timestamp;
    Double quantity;
    Double targetPrice;
    Double filledPrice;     // The filledPrice attribute represents the price at which a trade was executed or "filled."
    Boolean isFilled;

    @ManyToOne
    Customer customer;

    @ManyToOne
    Stock stock;
}
