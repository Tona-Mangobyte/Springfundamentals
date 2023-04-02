package org.example.events;

import org.example.entity.Account;
import org.springframework.context.ApplicationEvent;

public class AccountCreatedEvent extends ApplicationEvent {
    private Account account;

    public AccountCreatedEvent(Object source, Account account) {
        super(source);
        this.account = account;
    }

    public Account getAccount() {
        return account;
    }
}
