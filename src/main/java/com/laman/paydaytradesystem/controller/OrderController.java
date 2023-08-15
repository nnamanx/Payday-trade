package com.laman.paydaytradesystem.controller;


import com.laman.paydaytradesystem.model.constants.Messages;
import com.laman.paydaytradesystem.model.dto.request.PlaceOrderRequestDto;
import com.laman.paydaytradesystem.model.entity.Customer;
import com.laman.paydaytradesystem.repository.CustomerRepository;
import com.laman.paydaytradesystem.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/payday/v1/orders")
public class OrderController {

    private final OrderService orderService;
    private final CustomerRepository customerRepository;

    @PostMapping("/place")
    public ResponseEntity<String> placeOrder(@RequestBody PlaceOrderRequestDto request) {
        Customer customer = getUserFromAuthentication();

        orderService.placeOrder(customer, request.getOrderType(), request.getStockSymbol(), request.getTargetPrice(), request.getQuantity());
        return ResponseEntity.ok(Messages.ORDER_PLACED_SUCCESSFULLY);
    }

    private Customer getUserFromAuthentication() {

        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (authentication.getPrincipal() instanceof UserDetails) {
            UserDetails userDetails = (UserDetails) authentication.getPrincipal();

            return customerRepository.findByEmail(userDetails.getUsername());
        }
        return null;
    }




}
