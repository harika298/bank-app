package com.account.service.service;

import com.account.service.dto.AccountDto;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.account.service.util.Response;

@Service
public interface AccountService {

    public ResponseEntity<Response> createAccount(AccountDto accountDto);

    public ResponseEntity<Response> updateAccount(AccountDto accountDto);

    public ResponseEntity<Response> deleteAccount(String accountId);
}
