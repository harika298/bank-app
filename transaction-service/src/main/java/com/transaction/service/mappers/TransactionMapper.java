package com.transaction.service.mappers;

import com.transaction.service.domain.Transaction;
import com.transaction.service.dto.TransactionDto;

public class TransactionMapper {

    public static TransactionDto transactionToTransactionDto(Transaction transaction) {
        TransactionDto transactionDto = new TransactionDto();
        transactionDto.setId(transaction.getId());
        transactionDto.setDate(transaction.getDate());
        transactionDto.setAmount(transaction.getAmount());
        transactionDto.setType(transaction.getType());
        transactionDto.setStatus(transaction.getStatus());
        transactionDto.setDescription(transaction.getDescription());
        return transactionDto;
    }

    public static Transaction transactionDtoToTransaction(TransactionDto transactionDto) {
        Transaction transaction = new Transaction();
        transaction.setId(transactionDto.getId());
        transaction.setDate(transactionDto.getDate());
        transaction.setAmount(transactionDto.getAmount());
        transaction.setType(transactionDto.getType());
        transaction.setStatus(transactionDto.getStatus());
        transaction.setDescription(transactionDto.getDescription());
        return transaction;
    }
    }