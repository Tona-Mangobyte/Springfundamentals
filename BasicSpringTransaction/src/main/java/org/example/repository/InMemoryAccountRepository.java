package org.example.repository;

import org.example.entity.Account;

import java.math.BigDecimal;
import java.util.List;

public class InMemoryAccountRepository implements AccountRepository {
    @Override
    public List<Account> getAccounts() {
        return null;
    }

    @Override
    public Account getAccount(Long id) {
        return null;
    }

    @Override
    public int getNumberOfAccounts() {
        return 0;
    }

    @Override
    public Long createAccount(BigDecimal balance) {
        return null;
    }

    @Override
    public int deleteAccount(Long id) {
        return 0;
    }

    @Override
    public void updateAccount(Account account) {

    }
}
