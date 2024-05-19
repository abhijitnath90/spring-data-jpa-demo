package com.nath.abhijit.springdatajpademo.services;

import com.nath.abhijit.springdatajpademo.entities.AccountAudit;

import java.util.Date;
import java.util.List;

public interface AccountAuditService {

    public List<AccountAudit> getAuditLogs(String accountId, Date fromDate, Date toDate);
}
