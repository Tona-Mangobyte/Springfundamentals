package org.example.service;

import org.example.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

@Service("personService")
public class PersonServiceImpl implements PersonService{
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<Person> getPersons() {
        return jdbcTemplate.query("SELECT * FROM person", new PersonRowMapper());
    }

    @Override
    public Person getPerson(Integer ID) {
        return jdbcTemplate.queryForObject(
                "SELECT * FROM person WHERE ID = ?", new Object[] { ID }, new PersonRowMapper());
    }

    @Override
    public void createPerson(Person person) {
        jdbcTemplate.update("INSERT INTO person(ID, FIRST_NAME, LAST_NAME) VALUES (?,?,?)",
                person.getID(),
                person.getFIRST_NAME(),
                person.getLAST_NAME());
    }

    @Override
    public void updatePerson(Person person) {
        jdbcTemplate.update("UPDATE person SET FIRST_NAME=?, LAST_NAME=? WHERE ID=?",
                person.getFIRST_NAME(),
                person.getLAST_NAME(),
                person.getID());
    }

    @Override
    public void deletePerson(Integer ID) {
        jdbcTemplate.update("DELETE FROM person WHERE ID=?", ID);
    }

    private class PersonRowMapper implements RowMapper<Person> {

        @Override
        public Person mapRow(ResultSet rs, int rowNum) throws SQLException {
            Person person = new Person();
            person.setID(rs.getInt("ID"));
            person.setFIRST_NAME(rs.getString("FIRST_NAME"));
            person.setLAST_NAME(rs.getString("LAST_NAME"));
            return person;
        }
    }
}
