package com.transaction.service.dto;

import lombok.Data;

import java.util.Date;

@Data
public class TransactionDto {

    private String id;
    private Date date;
    private double amount;
    private String type;
    private String status;
    private String description;
}
