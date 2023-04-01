package org.example.service;

import org.example.entity.Person;

import java.util.List;
import java.util.Optional;

public interface PersonService {
    List<Person> getPeople();
    Optional<Person> getPerson(Integer id);
    Person getPersonByFirstname(String firstName);
    Person createPerson(Person person);
    void deletePerson(Integer id);
}
