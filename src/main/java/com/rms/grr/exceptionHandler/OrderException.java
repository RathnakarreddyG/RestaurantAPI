package com.rms.grr.exceptionHandler;

public class OrderException extends RuntimeException{

    public OrderException(String message) {
        super(message);
    }
}
