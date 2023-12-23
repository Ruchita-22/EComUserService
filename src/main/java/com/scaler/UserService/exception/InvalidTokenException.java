package com.scaler.UserService.exception;

public class InvalidTokenException extends RuntimeException {
    public InvalidTokenException(String tokenIsInvalid) {
        super(tokenIsInvalid);
    }
}
