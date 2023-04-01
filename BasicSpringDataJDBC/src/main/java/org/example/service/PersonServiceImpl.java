package org.example.service;

import org.example.entity.Person;
import org.example.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.StreamSupport;

@Service
public class PersonServiceImpl implements PersonService {
    @Autowired
    private PersonRepository personRepository;

    @Override
    public List<Person> getPeople() {
        return StreamSupport.stream(personRepository.findAll().spliterator(), false)
                .toList();
    }

    @Override
    public Optional<Person> getPerson(Integer id) {
        return personRepository.findById(id);
    }

    @Override
    public Person getPersonByFirstname(String firstName) {
        return personRepository.findByFirstName(firstName);
    }

    @Override
    public Person createPerson(Person person) {
        return personRepository.save(person);
    }

    @Override
    public void deletePerson(Integer id) {
        personRepository.deleteById(id);
    }
}
