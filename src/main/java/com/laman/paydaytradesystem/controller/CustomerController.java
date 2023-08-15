package com.laman.paydaytradesystem.controller;

import com.laman.paydaytradesystem.model.constants.Messages;
import com.laman.paydaytradesystem.model.dto.request.CustomerRequestDto;
import com.laman.paydaytradesystem.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequiredArgsConstructor
@RequestMapping("/payday/v1/customers")
public class CustomerController {

    private final CustomerService customerService;

    @PostMapping("/register")
    public ResponseEntity<String> registerUser(@RequestBody CustomerRequestDto customerRequestDto) {
        
        customerService.registerCustomer(customerRequestDto.getFullName(), customerRequestDto.getEmail(), customerRequestDto.getPassword());
        return ResponseEntity.ok(Messages.CUSTOMER_REGISTERED_SUCCESSFULLY);
    }

    @GetMapping("/activate")
    public ResponseEntity<String> activateUser(@RequestParam Long userId, @RequestParam String code) {

        customerService.activateUser(userId, code);
        return ResponseEntity.ok(Messages.CUSTOMER_ACTIVATED_SUCCESSFULLY);
    }
}
