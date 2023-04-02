package org.example;

import org.example.config.AppConfig;
import org.example.entity.Account;
import org.example.services.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.math.BigDecimal;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        ConfigurableApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        ctx.start();
        AccountService accountService = ctx.getBean("accountService", AccountService.class);
        accountService.createAccount(new Account(1L, BigDecimal.valueOf(150.0)));
        ctx.stop();
    }
}
