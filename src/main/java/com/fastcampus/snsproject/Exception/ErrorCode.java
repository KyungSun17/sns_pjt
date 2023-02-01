package com.fastcampus.snsproject.Exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;
@AllArgsConstructor
@Getter
public enum ErrorCode {

    DUPLICATED_USER_NAME(HttpStatus.CONFLICT, "User name is duplicated"),
    INTERNAL_SERVER_ERROR(HttpStatus.INTERNAL_SERVER_ERROR, "internal server error"),
    INVALID_PASSWORD(HttpStatus.UNAUTHORIZED, "password is invalid"),
    USER_NOT_FOUND(HttpStatus.NOT_FOUND, "user not founded");


    private HttpStatus status;
    private String message;
}
