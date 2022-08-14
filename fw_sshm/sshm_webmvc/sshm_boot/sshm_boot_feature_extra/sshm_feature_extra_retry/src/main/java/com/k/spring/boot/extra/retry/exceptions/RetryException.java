package com.k.spring.boot.extra.retry.exceptions;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class RetryException extends RuntimeException {
    private String code;
    private String message;
}