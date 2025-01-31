package com.transaction.service.serviceImpl;

import com.transaction.service.domain.Transaction;
import com.transaction.service.dto.TransactionDto;
import com.transaction.service.mappers.TransactionMapper;
import com.transaction.service.repository.TransactionRepo;
import com.transaction.service.service.TransactionService;
import com.transaction.service.util.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TransactionServiceImpl implements TransactionService {

    @Autowired
    TransactionRepo transactionRepo;

    @Override
    public ResponseEntity<Response> getTransactionById(String id) {
        Optional<Transaction> transaction = transactionRepo.findById(id);
        return ResponseEntity.ok(Response.builder()
                .status(HttpStatus.OK)
                .body(TransactionMapper.transactionToTransactionDto(transaction.get()).toString())
                .exception("null")
                .build());
    }

    @Override
    public ResponseEntity<Response> createTransaction(TransactionDto transactionDto) {
        Transaction transaction = transactionRepo.save(TransactionMapper.transactionDtoToTransaction(transactionDto));
        return ResponseEntity.ok(Response.builder()
                .status(HttpStatus.OK)
                .body(TransactionMapper.transactionToTransactionDto(transaction).toString())
                .exception("null")
                .build());
    }

    @Override
    public ResponseEntity<Response> rollBackTransaction(String id) {
        transactionRepo.deleteById(id);
        return ResponseEntity.ok(Response.builder()
                .status(HttpStatus.OK)
                .body("true")
                .exception("null")
                .build());
    }
}
