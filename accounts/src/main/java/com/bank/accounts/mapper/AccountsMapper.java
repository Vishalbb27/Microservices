package com.bank.accounts.mapper;

import com.bank.accounts.dto.AccountsDto;
import com.bank.accounts.entity.Accounts;

public class AccountsMapper {
    public static AccountsDto mapToAccountsDto(Accounts accounts,AccountsDto accountsDto){
        accountsDto.setAccountsNumber(accounts.getAccountNumber());
        accountsDto.setAccountType(accounts.getAccountType());
        accountsDto.setBranchAddress(accounts.getBranchAddress());
        return accountsDto;
    }

    public static Accounts mapToAccounts(AccountsDto accountsDto,Accounts accounts){
        accounts.setAccountNumber(accountsDto.getAccountsNumber());
        accounts.setAccountType(accountsDto.getAccountType());
        accounts.setBranchAddress(accountsDto.getBranchAddress());
        return accounts;
    }


}
