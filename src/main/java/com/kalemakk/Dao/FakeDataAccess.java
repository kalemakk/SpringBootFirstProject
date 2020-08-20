package com.kalemakk.Dao;

import com.kalemakk.Model.Person;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
@Repository("fakeData")
public class FakeDataAccess implements PersonDao {
    List<Person> Db = new ArrayList<>();
    @Override
    public int insertPerson(UUID id, Person person) {
        Db.add(new Person(id,person.getName()));
        return 1;
    }

    @Override
    public List<Person> getAllPeople() {
        return Db;
    }

    @Override
    public int deletePersonById(UUID id) {
        Optional<Person> person = getPersonById(id);
        if (person.isEmpty()) {
            return 0;
        }else {
            Db.remove(person.get());
            return 1;
        }
    }

    @Override
    public int updatePerson(UUID id, Person person) {

        return getPersonById(id).map(p ->{
            int indexOfPersonToUpdate = Db.indexOf(p);
            if (indexOfPersonToUpdate >=0) {
                Db.set(indexOfPersonToUpdate, new Person(id,person.getName()));
                return 1;
            }
            return 0;
                }).orElse(0);
    }

    @Override
    public Optional<Person> getPersonById(UUID id) {
        return  Db.stream().filter(person -> person.getId().equals(id)).findFirst();
    }

}
