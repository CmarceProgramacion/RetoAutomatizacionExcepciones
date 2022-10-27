package com.aliexpress.exceptions;

public class ExceptionIsNotVisible extends AssertionError {

    public ExceptionIsNotVisible(String message, Throwable cause) {
        super(message, cause);
    }

}
