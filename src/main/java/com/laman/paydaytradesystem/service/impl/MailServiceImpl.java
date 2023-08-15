package com.laman.paydaytradesystem.service.impl;

import com.laman.paydaytradesystem.service.MailService;
import lombok.RequiredArgsConstructor;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MailServiceImpl implements MailService {

    private final JavaMailSender javaMailSender;

    @Override
    public void sendActivationEmail(String toEmail, String activationLink) {

        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(toEmail);
        message.setSubject("Activate Your Account");
        message.setText("Click the following link to activate your account:\n" + activationLink);

        javaMailSender.send(message);
    }
}
