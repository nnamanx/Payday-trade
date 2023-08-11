package com.laman.paydaytradesystem.model.entity;

import com.laman.paydaytradesystem.model.enums.TokenType;
import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "token")
public class Token {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String token;

    @Enumerated(EnumType.STRING)
    TokenType tokenType;

    boolean expired;

    boolean revoked;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    Customer customer;

}

