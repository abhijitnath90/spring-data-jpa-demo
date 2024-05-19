package com.nath.abhijit.springdatajpademo.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
public class Account {

    private String accountId;
    private String accountName;
    private Long accountBalance;

}
