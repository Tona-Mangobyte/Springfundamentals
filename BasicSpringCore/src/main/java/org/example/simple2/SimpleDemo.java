package org.example.simple2;

import org.example.simple2.SimpleConfig;
import org.example.simple2.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class SimpleDemo
{

    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(SimpleConfig.class);
        UserService userService = context.getBean("userService", UserService.class);
        userService.sayHello();

        System.out.println("Annotation Config Count beans: "+ context.getBeanDefinitionCount());
        for (String name :
                context.getBeanDefinitionNames()) {
            System.out.println(name);
        }
    }
}
