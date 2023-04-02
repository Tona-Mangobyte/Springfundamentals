package org.example.services;

import org.example.entity.Account;
import org.example.publishers.AccountCreatePublisher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("accountService")
public class AccountServiceImpl implements AccountService {
    private List<Account> accounts = new ArrayList<>();

    @Autowired
    private AccountCreatePublisher publisher;
    @Override
    public void createAccount(Account account) {
        accounts.add(account);
        publisher.executeEvent(account);
    }
}
