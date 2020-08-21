package com.kalemakk.Dao;

import com.kalemakk.Model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository("postgres")
public class PostgresDb implements PersonDao {
    private final JdbcTemplate jdbcTemplate;
    @Autowired
    public PostgresDb(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public int insertPerson(UUID id, Person person) {
        return 0;
    }

    @Override
    public List<Person> getAllPeople() {
        final String sql ="SELECT id, name FROM person";
        return jdbcTemplate.query(sql, (resultSet, i) -> {
            return new Person(UUID.fromString(resultSet.getString("id")),resultSet.getString("name"));
        } );
    }

    @Override
    public int deletePersonById(UUID id) {
        final String sql ="DELETE id, name FROM person WHERE id = ?";
//        Person person = jdbcTemplate.queryForObject(sql, new Object[]{id});
        return 0;
    }

    @Override
    public int updatePerson(UUID id, Person person) {
        return 0;
    }

    @Override
    public Optional<Person> getPersonById(UUID id) {
        final String sql ="SELECT id, name FROM person WHERE id = ?";
        Person person = jdbcTemplate.queryForObject(sql, new Object[]{id},(resultSet, i) -> {
            return new Person(UUID.fromString(resultSet.getString("id")),resultSet.getString("name"));
        } );
        return Optional.ofNullable(person);
    }
}
