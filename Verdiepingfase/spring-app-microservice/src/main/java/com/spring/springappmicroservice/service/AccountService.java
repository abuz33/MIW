/**
 * Created by abuzer.alaca on 31/12/2021
 **/


package com.spring.springappmicroservice.service;

import com.spring.springappmicroservice.entity.Account;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;

@Service
public class AccountService {
    public Account get(String id) {
        return new Account("test");
    }

    public Account save(Account account) {
        return account;
    }

    public Account update(Account account) {
        return account;
    }

    public void delete(String id) {
    }

    public Account pagination() {
        return null;
    }
}
