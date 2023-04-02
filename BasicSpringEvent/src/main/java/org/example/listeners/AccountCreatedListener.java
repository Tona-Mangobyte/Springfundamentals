package org.example.listeners;

import org.example.events.AccountCreatedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Component;

@Component
public class AccountCreatedListener implements ApplicationListener<AccountCreatedEvent> {

    @Override
    public void onApplicationEvent(@NonNull AccountCreatedEvent event) {
        System.out.println("Received new register account[event] - " + event.getAccount().getId());
    }
}
