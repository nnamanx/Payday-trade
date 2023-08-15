package com.laman.paydaytradesystem.exception;

import com.laman.paydaytradesystem.model.constants.Messages;

public class CustomerAlreadyActivatedException extends RuntimeException {

    public CustomerAlreadyActivatedException() {

        super(Messages.CUSTOMER_ALREADY_ACTIVATED);
    }
}
