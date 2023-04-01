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

import java.util.List;
import java.util.stream.StreamSupport;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = AppConfig.class)
public class PersonTest {

    @Autowired
    private PersonService personService;

    @Test
    public void testGetPeople() {
        List<Person> result = personService.getPeople();
        result.forEach(System.out::println);
        Assert.assertNotNull(result);
        Assert.assertEquals(2, result.size());
    }

    @Test
    public void testFindOne() {
        Person person = personService.getPerson(1).orElse(null);
        Assert.assertEquals("Tona", person.getFIRST_NAME());
    }

    @Test
    public void testCreate() {
        Person person = new Person( "Simple", "Simple03");
        person = personService.createPerson(person);
        Assert.assertEquals("Simple", person.getFIRST_NAME());
    }

    @Test
    public void testRemove() {
        Person person = personService.getPersonByFirstname("Simple");
        personService.deletePerson(person.getID());
        Assert.assertEquals("Simple", person.getFIRST_NAME());
    }
}
