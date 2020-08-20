package com.kalemakk.Dao;

import com.kalemakk.Model.Person;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface PersonDao {
    int insertPerson(UUID id, Person person);
    default int insertPerson(Person person){
        UUID personId = UUID.randomUUID();
        return insertPerson(personId,person);
    }
    default String Hello(){
        return "Hello there";
    }
    List<Person> getAllPeople();
    int deletePersonById(UUID id);
    int updatePerson(UUID id, Person person);
//    Person getPersonById(UUID id);
    Optional<Person> getPersonById(UUID id);
}
