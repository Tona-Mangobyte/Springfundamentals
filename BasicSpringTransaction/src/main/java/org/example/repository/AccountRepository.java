package org.example.repository;

import org.example.entity.Account;

import java.math.BigDecimal;
import java.util.List;

public interface AccountRepository {
    List<Account> getAccounts();
    Account getAccount(Long id);
    int getNumberOfAccounts();
    Long createAccount(BigDecimal balance);
    int deleteAccount(Long id);
    void updateAccount(Account account);
}