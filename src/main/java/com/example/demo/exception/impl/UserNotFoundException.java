package com.example.demo.exception.impl;

import com.example.demo.exception.AbsctractException;
import org.springframework.http.HttpStatus;

public class UserNotFoundException extends AbsctractException {

    @Override
    public int getStatusCode() {
        return HttpStatus.INTERNAL_SERVER_ERROR.value();
    }

    @Override
    public String getMessage() {
        return "존재하지 않는 사용자입니다.";
    }
}