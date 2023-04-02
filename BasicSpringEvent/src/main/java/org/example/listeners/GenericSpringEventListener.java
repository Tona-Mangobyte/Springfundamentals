package org.example.listeners;

import org.example.entity.Account;
import org.example.events.GenericSpringEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Component;

@Component
public class GenericSpringEventListener implements ApplicationListener<GenericSpringEvent<Account>> {
    @Override
    public void onApplicationEvent(@NonNull GenericSpringEvent<Account> event) {
        System.out.println("Received spring generic event - " + event.getWhat());
    }
}
