package com.nath.abhijit.springdatajpademo.services;

import com.nath.abhijit.springdatajpademo.entities.Account;

import java.util.List;

public interface AccountService {

    public List<Account> getAccountGreaterThanMinBalanceAndLessThanMaxBalance(String accountId, Long minBalance, Long maxBalance);
}
