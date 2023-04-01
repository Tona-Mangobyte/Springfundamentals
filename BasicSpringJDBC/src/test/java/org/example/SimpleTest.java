package org.example;

import org.example.config.AppConfig;
import org.example.entity.Person;
import org.example.service.PersonService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = AppConfig.class)
public class SimpleTest {

    @Autowired
    private PersonService personService;

    @Test
    public void testInjectService() {
        Assert.assertNotNull(personService);
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
    }
}
