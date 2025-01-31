package com.customer.service.domain;

import com.customer.service.enums.AccountType;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Account {

    @Id
    private String accountId;
    private String accountNumber;
    private AccountType accountType;
    private String accountStatus;
    private double balance;

    @ManyToOne(fetch = FetchType.LAZY, targetEntity = Customer.class)
    @JoinColumn(name = "account_id")
    Customer customers;

}
