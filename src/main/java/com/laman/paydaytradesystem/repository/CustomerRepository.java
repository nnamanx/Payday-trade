package com.laman.paydaytradesystem.repository;

import com.laman.paydaytradesystem.model.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
    // custom query methods
}
