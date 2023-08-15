package com.laman.paydaytradesystem.service.impl;

import com.laman.paydaytradesystem.model.entity.OrderStock;
import com.laman.paydaytradesystem.repository.CustomerRepository;
import com.laman.paydaytradesystem.service.CustomerService;
import com.laman.paydaytradesystem.service.EmailService;
import com.laman.paydaytradesystem.service.MailService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;
    private final MailService mailService;

    @Override
    public void executeOrderAndUpdateBalance(OrderStock order, Double currentPrice) {

    }
    
//
//    public User registerUser(String username, String email, String password) {
//        // Check if the user already exists with the provided email
//        if (userRepository.findByEmail(email).isPresent()) {
//            throw new UserAlreadyExistsException("User with this email already exists");
//        }
//
//        // Create a new user entity and save it to the database
//        User newUser = new User(username, email, password);
//        newUser.setActivationCode(generateActivationCode());
//        userRepository.save(newUser);
//
//        // Send activation email
//        String activationLink = generateActivationLink(newUser.getId(), newUser.getActivationCode());
//        emailService.sendActivationEmail(newUser.getEmail(), activationLink);
//
//        return newUser;
//    }
//
//    private String generateActivationCode() {
//        return UUID.randomUUID().toString();
//    }
//
//    private String generateActivationLink(Long userId, String activationCode) {
//        // Create an activation link with userId and activationCode
//        // Example: http://yourapp.com/activate?userId=123&code=abc123
//        return "http://yourapp.com/activate?userId=" + userId + "&code=" + activationCode;
//    }
//
//    public void activateUser(Long userId, String activationCode) {
//        User user = userRepository.findById(userId)
//                .orElseThrow(() -> new UserNotFoundException("User not found"));
//
//        if (user.isActive()) {
//            throw new UserAlreadyActivatedException("User is already activated");
//        }
//
//        if (!user.getActivationCode().equals(activationCode)) {
//            throw new InvalidActivationCodeException("Invalid activation code");
//        }
//
//        user.setActive(true);
//        userRepository.save(user);
//    }
}
