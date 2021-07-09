package com.william.app.ws.exception;

public class UserServiceException extends RuntimeException {

    private static final long serialVersionUID = -349685696557630513L;

    public UserServiceException(String message) {
        super(message);
    }
}
