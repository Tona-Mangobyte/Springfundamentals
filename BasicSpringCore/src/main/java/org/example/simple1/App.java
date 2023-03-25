package org.example.simple1;

import org.example.simple1.SimpleConfig;
import org.example.simple1.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
// @ComponentScan(basePackages = { "org.example" })
public class App 
{

    public static void main( String[] args )
    {
        UserService userService;
        ApplicationContext context;
        // context = new ClassPathXmlApplicationContext("simple.xml");
        // Hello hello = (Hello) context.getBean("hello");
        // Hello hello = context.getBean("hello", Hello.class);
        // hello.sayHello();
        /*userService = context.getBean("userService", UserService.class);
        userService.sayHello();
        System.out.println("XML Config: Count beans: "+ context.getBeanDefinitionCount());
        for (String name :
                context.getBeanDefinitionNames()) {
            System.out.println(name);
        }*/

        context = new AnnotationConfigApplicationContext(SimpleConfig.class);
        userService = context.getBean("userService", UserService.class);
        userService.sayHello();

        System.out.println("Annotation Config Count beans: "+ context.getBeanDefinitionCount());
        for (String name :
                context.getBeanDefinitionNames()) {
            System.out.println(name);
        }
    }
}
