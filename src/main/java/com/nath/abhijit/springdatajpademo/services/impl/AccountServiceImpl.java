package com.nath.abhijit.springdatajpademo.services.impl;

import com.nath.abhijit.springdatajpademo.entities.Account;
import com.nath.abhijit.springdatajpademo.repository.AccountRepository;
import com.nath.abhijit.springdatajpademo.services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    AccountRepository accountRepository;
    @Override
    public List<Account> getAccountGreaterThanMinBalanceAndLessThanMaxBalance(String accountId, Long minBalance, Long maxBalance) {
        return accountRepository.findByAccountIdAndAccountBalanceGreaterThanAndAccountBalanceLessThan(accountId, minBalance, maxBalance);
    }

}
