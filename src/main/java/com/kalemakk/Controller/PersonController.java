package com.kalemakk.Controller;

import com.kalemakk.Model.Person;
import com.kalemakk.Services.PersonService;
import io.micrometer.core.lang.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;


import java.awt.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/person")

public class PersonController {
    @Autowired
    private final PersonService personService;
    public PersonController(PersonService personService) {
        this.personService = personService;
    }
    @PostMapping
    public void addPerson(@Validated @NonNull @RequestBody Person person){
        personService.addPerson(person);
    }
    @GetMapping(value = "/all")
    public List<Person> getAllPeople() {
        return this.personService.getAllPeople();
    }
    @DeleteMapping(value = "/{id}")
    public int deletePersonById(@PathVariable("id") UUID id) {
        return this.personService.deletePersonById(id);
    }
    @GetMapping(path = "/{id}")
    public Person getPersonById(@PathVariable("id") UUID id){
        return this.personService.getPersonById(id).orElse(null);
    }
    @PutMapping(path = "/{id}")
    public int updatePerson(@PathVariable("id") UUID id,@Validated @NonNull @RequestBody Person person){
        return this.personService.updatePerson(id,person);
    }
}
