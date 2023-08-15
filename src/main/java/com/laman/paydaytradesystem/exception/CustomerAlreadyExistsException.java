package com.laman.paydaytradesystem.exception;

import com.laman.paydaytradesystem.model.constants.Messages;

public class CustomerAlreadyExistsException extends RuntimeException {

    public CustomerAlreadyExistsException() {

        super(Messages.CUSTOMER_ALREADY_EXISTS);
    }
}
