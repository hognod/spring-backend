package com.hognod.backend.exception;

import org.springframework.validation.BindException;
import org.springframework.validation.BindingResult;

public class ApiBindException extends BindException {
    public ApiBindException(BindingResult bindingResult) {
        super(bindingResult);
    }
}
