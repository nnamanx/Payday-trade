package com.laman.paydaytradesystem.service.impl;

import com.laman.paydaytradesystem.exception.CustomerAlreadyActivatedException;
import com.laman.paydaytradesystem.exception.CustomerAlreadyExistsException;
import com.laman.paydaytradesystem.exception.CustomerNotFoundException;
import com.laman.paydaytradesystem.exception.InvalidActivationCodeException;
import com.laman.paydaytradesystem.model.entity.Customer;
import com.laman.paydaytradesystem.model.entity.OrderStock;
import com.laman.paydaytradesystem.repository.CustomerRepository;
import com.laman.paydaytradesystem.service.CustomerService;
import com.laman.paydaytradesystem.service.MailService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;
    private final MailService mailService;

    @Override
    public void executeOrderAndUpdateBalance(OrderStock order, Double currentPrice) {

    }

    @Override
    public Customer registerCustomer(String username, String email, String password) {

        // Check if the user already exists with the provided email
        if (customerRepository.findByEmail(email).isEnabled()) {
            throw new CustomerAlreadyExistsException();
        }

        // Create a new user entity and save it to the database
        Customer newCustomer = Customer.builder()
                .fullName(username)
                .email(email)
                .password(password)
                .build();

        newCustomer.setActivationCode(generateActivationCode());
        customerRepository.save(newCustomer);

        // Send activation email
        String activationLink = generateActivationLink(newCustomer.getId(), newCustomer.getActivationCode());
        mailService.sendActivationEmail(newCustomer.getEmail(), activationLink);

        return newCustomer;
    }
    
//    public void checkIfCustomerExistsByEmail(String email) {
//        Customer customer = customerRepository.findByEmail(email);
//
//        if (customer != null) {
//            System.out.println("Customer with email " + email + " exists.");
//            // Perform further operations with the customer
//        } else {
//            System.out.println("Customer with email " + email + " does not exist.");
//            // Handle accordingly
//        }
//    }

    @Override
    public String generateActivationCode() {

        return UUID.randomUUID().toString();
    }


    @Override
    public String generateActivationLink(Long userId, String activationCode) {

        return "http://yourapp.com/activate?userId=" + userId + "&code=" + activationCode;
    }


    @Override
    public void activateUser(Long userId, String activationCode) {

        Customer customer = customerRepository.findById(userId)
                .orElseThrow(() -> new CustomerNotFoundException());

        if (customer.isEnabled()) {  //isActive?
            throw new CustomerAlreadyActivatedException();
        }

        if (!customer.getActivationCode().equals(activationCode)) {
            throw new InvalidActivationCodeException();
        }

        customer.setIsActive(true);
        customerRepository.save(customer);
    }
}
