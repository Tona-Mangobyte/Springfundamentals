package org.example;

import org.example.config.AppConfig;
import org.example.entity.Person;
import org.example.service.PersonService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        PersonService personService = ctx.getBean("personService", PersonService.class);
        Person person = new Person(1, "Tona", "Chheun");
        // personService.createPerson(person);
        person = personService.getPerson(1);
        System.out.println(person);
        personService.getPersons().forEach(System.out::println);
    }
}
