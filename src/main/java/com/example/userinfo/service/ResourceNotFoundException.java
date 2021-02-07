package com.example.userinfo.service;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends Throwable {
    public ResourceNotFoundException(String s, Throwable notFound) {
        super(s, notFound);
    }
}
