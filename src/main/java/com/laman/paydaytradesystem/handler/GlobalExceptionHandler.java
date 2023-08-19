package com.laman.paydaytradesystem.handler;


import com.laman.paydaytradesystem.exception.CustomerAlreadyActivatedException;
import com.laman.paydaytradesystem.exception.CustomerNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> handleException(Exception ex) {
        // Create a custom error response or log the error
        String errorMessage = "An error occurred: " + ex.getMessage();
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(errorMessage);
    }


    @ExceptionHandler(CustomerNotFoundException.class)
    public ResponseEntity<String> handleCustomerNotFoundException(CustomerNotFoundException ex) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ex.getMessage());
    }

    @ExceptionHandler(CustomerAlreadyActivatedException.class)
    public ResponseEntity<String> handleCustomerAlreadyActivatedException(CustomerAlreadyActivatedException ex) {
        return ResponseEntity.badRequest().body(ex.getMessage());
    }

}

