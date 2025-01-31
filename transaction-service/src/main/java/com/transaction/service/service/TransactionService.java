package com.transaction.service.service;

import com.transaction.service.dto.TransactionDto;
import com.transaction.service.util.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public interface TransactionService {

    public ResponseEntity<Response> getTransactionById(String id);

    public ResponseEntity<Response> createTransaction(TransactionDto transactionDto);

    public ResponseEntity<Response> rollBackTransaction(String id);

}
