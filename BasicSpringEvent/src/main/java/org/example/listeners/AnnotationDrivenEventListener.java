package org.example.listeners;

import org.example.entity.Account;
import org.example.events.AccountCreatedEvent;
import org.example.events.GenericSpringEvent;
import org.springframework.context.event.ContextStartedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class AnnotationDrivenEventListener {
    @EventListener
    public void handleContextStart(ContextStartedEvent cse) {
        System.out.println("Handling context started event.");
    }

    @EventListener
    public void handleAccountCreate(AccountCreatedEvent event) {
        System.out.println("Handling account create event " + event.getAccount().getId());
    }

    @EventListener(condition = "#event.success")
    public void handleSuccessful(GenericSpringEvent<Account> event) {
        System.out.println("Handling generic event success.");
    }

    @EventListener(condition = "#event.failure")
    public void handleFailure(GenericSpringEvent<Account> event) {
        System.out.println("Handling generic event failure");
    }
}
