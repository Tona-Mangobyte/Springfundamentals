package org.example;

import org.example.config.AppConfig;
import org.example.entity.Person;
import org.example.service.PersonService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PersonTest {
    private PersonService personService = null;
    @Before
    public void setUp() {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        personService = ctx.getBean("personService", PersonService.class);
    }

    @Test
    public void testCreatePerson() {
        Person person = new Person(1, "Tona", "Chheun");
        personService.createPerson(person);
        person = personService.getPerson(1);
        Assert.assertEquals("Tona", person.getFIRST_NAME());
    }

    @Test
    public void testUpdatePerson() {
        Person person = new Person(1, "Tona #2", "Chheun");
        personService.updatePerson(person);
        person = personService.getPerson(1);
        Assert.assertEquals("Tona #2", person.getFIRST_NAME());
    }

    @Test
    public void testRemovePerson() {
        personService.deletePerson(1);
        // Person person = personService.getPerson(1);
        // System.out.println(person);
    }
}
