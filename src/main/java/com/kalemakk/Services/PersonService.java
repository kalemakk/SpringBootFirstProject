package com.kalemakk.Services;

import com.kalemakk.Dao.PersonDao;
import com.kalemakk.Model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
@Service
public class PersonService {
    private final PersonDao personDao;
    @Autowired
    public PersonService(@Qualifier("fakeData") PersonDao personDao) {
        this.personDao = personDao;
    }
    public int addPerson(Person person){
        return this.personDao.insertPerson(person);
    }
    public List<Person> getAllPeople() {
        return this.personDao.getAllPeople();
    }
    public int deletePersonById(UUID id) {
        return this.personDao.deletePersonById(id);
    }
    public Optional<Person> getPersonById(UUID id) {
        return  this.personDao.getPersonById(id);
    }
    public int updatePerson(UUID id, Person person){
        return this.personDao.updatePerson(id,person);
    }
}
