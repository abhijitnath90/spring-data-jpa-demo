package com.nath.abhijit.springdatajpademo.services.impl;

import com.nath.abhijit.springdatajpademo.entities.AccountAudit;
import com.nath.abhijit.springdatajpademo.repository.AccountAuditRepository;
import com.nath.abhijit.springdatajpademo.services.AccountAuditService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class AccountAuditServiceImpl implements AccountAuditService {

    @Autowired
    private AccountAuditRepository accountAuditRepository;

    @Override
    public List<AccountAudit> getAuditLogs(String accountId, Date fromDate, Date toDate) {
       return accountAuditRepository.findByAccountIdAndLastUpdateDateGreaterThanAndLastUpdateDateLessThan(accountId, new java.sql.Date(fromDate.getTime()), new java.sql.Date(toDate.getTime()));
    }
    
}
