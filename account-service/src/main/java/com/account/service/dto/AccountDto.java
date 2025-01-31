package com.account.service.dto;

import lombok.Data;

@Data
public class AccountDto {
    private String accountId;
    private String accountNumber;
    private String accountType;
    private String accountStatus;
    private double balance;

}
