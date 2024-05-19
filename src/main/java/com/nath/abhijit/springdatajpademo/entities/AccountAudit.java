package com.nath.abhijit.springdatajpademo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@Entity
public class AccountAudit {

    @Id
    private String accountId;
    private String accountName;
    private Date lastUpdateDate;
}
