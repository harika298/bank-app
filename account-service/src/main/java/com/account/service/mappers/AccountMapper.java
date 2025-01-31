package com.account.service.mappers;

import com.account.service.dto.AccountDto;
import com.account.service.enums.AccountType;

public class AccountMapper {

    public static AccountDto AccountToAccountDto(com.account.service.domain.Account account) {
        AccountDto accountDto = new AccountDto();
        accountDto.setAccountId(account.getAccountId());
        accountDto.setAccountNumber(account.getAccountNumber());
        //TODO
        accountDto.setAccountType(String.valueOf(account.getAccountType()));
        accountDto.setAccountStatus(account.getAccountStatus());
        accountDto.setBalance(account.getBalance());
        return accountDto;
    }

    public static com.account.service.domain.Account AccountDtoToAccount(AccountDto accountDto) {
        com.account.service.domain.Account account = new com.account.service.domain.Account();
        account.setAccountId(accountDto.getAccountId());
        account.setAccountNumber(accountDto.getAccountNumber());
        //TODO
        account.setAccountType(AccountType.valueOf(accountDto.getAccountType()));
        account.setAccountStatus(accountDto.getAccountStatus());
        account.setBalance(accountDto.getBalance());
        return account;
    }
}

