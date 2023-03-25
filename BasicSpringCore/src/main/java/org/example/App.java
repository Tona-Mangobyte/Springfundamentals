package org.example;

import org.example.config.SimpleConfig;
import org.example.model.Hello;
import org.example.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
// @ComponentScan(basePackages = { "org.example" })
public class App 
{

    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("simple.xml");
        UserService userService = null;
        // Hello hello = (Hello) context.getBean("hello");
        // Hello hello = context.getBean("hello", Hello.class);
        // hello.sayHello();
        userService = context.getBean("userService", UserService.class);
        userService.sayHello();

        context = new AnnotationConfigApplicationContext(SimpleConfig.class);
        userService = context.getBean("userService", UserService.class);
        userService.sayHello();
    }
}
