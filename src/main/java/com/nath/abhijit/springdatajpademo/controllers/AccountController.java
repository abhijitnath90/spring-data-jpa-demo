package com.nath.abhijit.springdatajpademo.controllers;

import com.nath.abhijit.springdatajpademo.entities.Account;
import com.nath.abhijit.springdatajpademo.services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @GetMapping("/{accountid}")
    public ResponseEntity<List<Account>> getAccountsGreaterThanMinimumBalanceAndLessThanMaximumBalance(@PathVariable("accountid") String accountId,
                                                                                                       @RequestParam("minbalance") Long minBalance,
                                                                                                       @RequestParam("maxbalance") Long maxBalance) {
        return new ResponseEntity<List<Account>>(accountService.getAccountGreaterThanMinBalanceAndLessThanMaxBalance(accountId, minBalance, maxBalance), HttpStatus.OK);
    }

}
