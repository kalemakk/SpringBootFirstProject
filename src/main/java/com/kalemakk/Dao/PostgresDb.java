package com.kalemakk.Dao;

import com.kalemakk.Model.Person;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class PostgresDb implements PersonDao {
    @Override
    public int insertPerson(UUID id, Person person) {
        return 0;
    }

    @Override
    public List<Person> getAllPeople() {
        return null;
    }

    @Override
    public int deletePersonById(UUID id) {
        return 0;
    }

    @Override
    public int updatePerson(UUID id, Person person) {
        return 0;
    }

    @Override
    public Optional<Person> getPersonById(UUID id) {
        return Optional.empty();
    }
}
