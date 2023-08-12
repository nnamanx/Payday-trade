package com.laman.paydaytradesystem.model.entity;

import com.laman.paydaytradesystem.model.enums.Role;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "customer")
public class Customer implements UserDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String fullName;

    @Column(unique = true)
    String email; //username

    //    @Size(min = 6, message = "Password must contain at least 6 characters")
    String password; //hashed

    String phoneNumber;

    Long deposit;

    @Builder.Default
    Boolean isActive = false;   // not active when the profile first created

    @Enumerated(EnumType.STRING)
    @Builder.Default
    Role role = Role.USER;

    @OneToMany(mappedBy = "customer")
    @ToString.Exclude // bro...
    List<Token> tokens;

    @OneToMany(mappedBy = "customer", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    List<Transaction> transactions;

    @ElementCollection
//    @MapKeyColumn(name = "stock_symbol")
//    @Column(name = "stock_quantity")
    @Builder.Default
    Map<String, Integer> stocks = new HashMap<>();        //why hashmap?

    //orders?


//    User details methods

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {

        return List.of(new SimpleGrantedAuthority(role.name()));
    }

    @Override
    public String getUsername() {
        return email;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }


    //Here's how the entities map to the provided user stories:

    //Sign Up: This involves creating a user with a username, email, and password. Once activated, the user can interact with the system.
    //Sign In: Users log in using their username and password.
    //List Stocks: Stocks are listed with their symbols and current prices.
    //Deposit Cash: Users have a cash balance that they can deposit.
    //Place an Order: Users can create buy and sell orders for stocks.
    //Email Notification: Users receive an email when their BUY/SELL orders are filled.
}

