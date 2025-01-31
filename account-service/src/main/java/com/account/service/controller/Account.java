package com.account.service.controller;

import com.account.service.dto.AccountDto;
import com.account.service.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;
import com.account.service.util.Response;

@RestController
public class Account {

    @Autowired
    AccountService accountService;

    @PostMapping(path = "/createAccount", consumes = "application/json")
    public ResponseEntity<Response> createAccount(AccountDto accountDto) {
        return accountService.createAccount(accountDto);
    }

    @PutMapping(path = "/updateAccount", produces = "application/json")
    public ResponseEntity<Response> updateAccount(AccountDto accountDto) {
        return accountService.updateAccount(accountDto);
    }

    @DeleteMapping(path = "/deleteAccount")
    public ResponseEntity<Response> deleteAccount(String accountId) {
        return accountService.deleteAccount(accountId);
    }
}
