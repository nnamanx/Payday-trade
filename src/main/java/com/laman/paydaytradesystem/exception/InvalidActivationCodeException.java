package com.laman.paydaytradesystem.exception;

import com.laman.paydaytradesystem.model.constants.Messages;

public class InvalidActivationCodeException extends RuntimeException {

    public InvalidActivationCodeException() {

        super(Messages.INVALID_ACTIVATION_CODE);
    }
}
