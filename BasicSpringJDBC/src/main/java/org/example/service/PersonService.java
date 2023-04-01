package org.example.service;

import org.example.entity.Person;

import java.util.List;

public interface PersonService {
    List<Person> getPersons();
    Person getPerson(Integer ID);
    void createPerson(Person person);
    void updatePerson(Person person);
    void deletePerson(Integer ID);
}
