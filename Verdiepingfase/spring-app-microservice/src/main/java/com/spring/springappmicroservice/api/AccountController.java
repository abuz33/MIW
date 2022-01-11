/**
 * Created by abuzer.alaca on 31/12/2021
 **/


package com.spring.springappmicroservice.api;

import com.spring.springappmicroservice.entity.Account;
import com.spring.springappmicroservice.service.AccountService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/account")
public class AccountController implements IController<Account> {
    private final AccountService accountService;

    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @Override
    @GetMapping("/{id}")
    public ResponseEntity<Account> get(@PathVariable("id") String id) {
        return ResponseEntity.ok(accountService.get(id));
    }

    @Override
    @PostMapping("/save")
    public ResponseEntity<Account> save(@RequestBody Account account) {
        return ResponseEntity.ok(accountService.save(account));
    }

    @Override
    @PutMapping("/update")
    public ResponseEntity<Account> update(@RequestBody Account account) {
        return ResponseEntity.ok(accountService.update(account));
    }

    @Override
    @DeleteMapping("/{id}")
    public void delete( @PathVariable String id) {
        accountService.delete(id);
    }

    @Override
    @PostMapping
    public ResponseEntity<Account> pagination() {
        return ResponseEntity.ok(accountService.pagination());
    }
}
