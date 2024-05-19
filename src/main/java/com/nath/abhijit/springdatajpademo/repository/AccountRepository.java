package com.nath.abhijit.springdatajpademo.repository;

import com.nath.abhijit.springdatajpademo.entities.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountRepository extends JpaRepository<Account, String> {

    public List<Account> findByAccountIdAndAccountBalanceGreaterThanAndAccountBalanceLessThan(String accountId, Long minBalance, Long maxBalance);

}
