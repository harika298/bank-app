package com.account.service.domain;

import com.account.service.enums.AccountType;
import lombok.Data;

import javax.persistence.*;
import java.util.Set;


@Data
@Entity
public class Account {

    @Id
    private String accountId;
    private String accountNumber;
    private AccountType accountType;
    private String accountStatus;
    private double balance;

    @OneToMany(mappedBy = "customer", fetch = FetchType.LAZY, cascade = {CascadeType.ALL},
            targetEntity = Transaction.class)
    Set<Transaction> transactions;

}
