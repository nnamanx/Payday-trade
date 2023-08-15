package com.laman.paydaytradesystem.exception;

import com.laman.paydaytradesystem.model.constants.Messages;

public class CustomerNotFoundException extends RuntimeException{

    public CustomerNotFoundException() {

        super(Messages.CUSTOMER_NOT_FOUND);
    }
}
