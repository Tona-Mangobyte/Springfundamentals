package org.example.repository;

import org.example.entity.Person;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends CrudRepository<Person, Integer> {
    @Query("select * from person where FIRST_NAME = :FIRST_NAME")
    Person findByFirstName(@Param("FIRST_NAME") String firstName);
}
