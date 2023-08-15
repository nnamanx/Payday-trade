package com.laman.paydaytradesystem.repository;

import com.laman.paydaytradesystem.model.entity.OrderStock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<OrderStock, Long> {
}
