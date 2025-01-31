package com.account.service.serviceImpl;


import com.account.service.domain.Account;
import com.account.service.dto.AccountDto;
import com.account.service.mappers.AccountMapper;
import com.account.service.repository.AccountRepo;
import com.account.service.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.account.service.util.Response;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    AccountRepo accountRepo;

    @Override
    public ResponseEntity<Response> createAccount(AccountDto accountDto) {
       Account accountEntity = accountRepo.save(AccountMapper.AccountDtoToAccount(accountDto));
       return ResponseEntity.ok(Response.builder()
               .status(HttpStatus.OK)
               .body(AccountMapper.AccountToAccountDto(accountEntity).toString())
               .exception("null")
               .build());
    }

    @Override
    public ResponseEntity<Response> updateAccount(AccountDto accountDto) {
        Account accountEntity = accountRepo.save(AccountMapper.AccountDtoToAccount(accountDto));
        return ResponseEntity.ok(Response.builder()
                .status(HttpStatus.OK)
                .body(AccountMapper.AccountToAccountDto(accountEntity).toString())
                .exception("null")
                .build());
    }

    @Override
    public ResponseEntity<Response> deleteAccount(String accountId) {
        accountRepo.deleteById(accountId);
        return ResponseEntity.ok(Response.builder()
                .status(HttpStatus.OK)
                .body("true")
                .exception("null")
                .build());
    }
}
