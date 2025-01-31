package com.transaction.service.controller;

import com.transaction.service.dto.TransactionDto;
import com.transaction.service.service.TransactionService;
import com.transaction.service.util.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Transaction {

    @Autowired
    TransactionService transactionService;

    @GetMapping(path ="/getTransactionById/{id}", produces = "application/json")
    public ResponseEntity<Response> getTransactionById(String id) {
        return transactionService.getTransactionById(id);
    }
    @PutMapping(path="/createTransaction", consumes = "application/json")
    public ResponseEntity<Response> createTransaction(TransactionDto transactionDto) {
        return transactionService.createTransaction(transactionDto);
    }
    @DeleteMapping(path = "/rollBackTransaction")
    public ResponseEntity<Response> rollBackTransaction(String id) {
        return transactionService.rollBackTransaction(id);
    }

}
