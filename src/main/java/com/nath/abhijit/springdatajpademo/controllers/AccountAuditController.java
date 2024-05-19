package com.nath.abhijit.springdatajpademo.controllers;

import com.nath.abhijit.springdatajpademo.entities.AccountAudit;
import com.nath.abhijit.springdatajpademo.services.AccountAuditService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/accountauditlogs")
public class AccountAuditController {

    @Autowired
    private AccountAuditService accountAuditService;


    @GetMapping("/{accountid}")
    public ResponseEntity<List<AccountAudit>> getAuditLogs(@PathVariable(name = "accountid") String accountId,
                                                           @RequestParam(name = "fromdate") String fromDateString,
                                                           @RequestParam(name = "todate") String toDateString
                                                           ) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-mm-dd");
        Date fromDate = simpleDateFormat.parse(fromDateString);
        Date toDate = simpleDateFormat.parse(toDateString);
        List<AccountAudit> accountAuditList = accountAuditService.getAuditLogs(accountId, fromDate, toDate);
        return new ResponseEntity<List<AccountAudit>>(accountAuditList, HttpStatus.OK);
    }

}
