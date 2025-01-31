package com.transaction.service.util;

import lombok.Builder;
import lombok.Data;
import org.springframework.http.HttpStatus;


@Data
@Builder
public class Response {

    private HttpStatus status;
    private String body;
    private String exception;
}
