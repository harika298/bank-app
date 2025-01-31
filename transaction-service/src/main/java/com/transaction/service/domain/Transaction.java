package com.transaction.service.domain;

import com.transaction.service.enums.StatusType;
import com.transaction.service.enums.TransactionType;
import com.transaction.service.enums.TransferType;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Data
@Entity
public class Transaction {

    @Id
    private String id;
    private Date date;
    private double amount;
    private TransactionType transactionType;
    private TransferType transferType;
    private StatusType status;
    private String description;

}
