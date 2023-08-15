package com.laman.paydaytradesystem.exception;

import com.laman.paydaytradesystem.model.constants.Messages;

public class UsernameNotFoundException extends RuntimeException{

    public UsernameNotFoundException() {

        super(Messages.USERNAME_NOT_FOUND);
    }
}
