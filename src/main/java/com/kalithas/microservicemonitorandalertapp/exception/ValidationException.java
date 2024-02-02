package com.kalithas.microservicemonitorandalertapp.exception;

public class ValidationException extends RuntimeException{
    public ValidationException(String msg) {
        super(msg);
    }
}
