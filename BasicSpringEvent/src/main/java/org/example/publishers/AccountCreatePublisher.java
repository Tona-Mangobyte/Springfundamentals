package org.example.publishers;

import org.example.entity.Account;
import org.example.events.AccountCreatedEvent;
import org.example.events.GenericSpringEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class AccountCreatePublisher {

    @Autowired
    private ApplicationEventPublisher publisher;

    public void executeEvent(final Account account) {
        publisher.publishEvent(new AccountCreatedEvent(this, account));
        publisher.publishEvent(new GenericSpringEvent<>(this, account, true));
    }
}
