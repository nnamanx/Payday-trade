package com.laman.paydaytradesystem.service;

public interface MailService
{

    void sendActivationEmail(String toEmail, String activationLink);
}
