package com.springboot.api;


import com.springboot.entity.Person;
import com.springboot.repository.PersonRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.Calendar;
import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/person")
public class PersonController {
    @Autowired
    PersonRepo personRepo;

    @PostConstruct
    public void init() {
        Person person1 = new Person();
        person1.setName("AA");
        person1.setLastName("NN");
        person1.setAddress("Echternachlaan 234");
        person1.setDateOfBirth(Calendar.getInstance().getTime());
        person1.setId("00001");


        Person person2 = new Person();
        person2.setName("Abuzer");
        person2.setLastName("Alaca");
        person2.setAddress("Echternachlaan 236");
        person2.setDateOfBirth(Calendar.getInstance().getTime());
        person2.setId("00002");

        addPerson(person1);
        addPerson(person2);
    }

    @GetMapping
    public ResponseEntity<Iterable<Person>> getAll(){
        return ResponseEntity.ok(personRepo.findAll());
    }
    @PostMapping
    public ResponseEntity<Person> addPerson(Person p) {
        return ResponseEntity.ok(personRepo.save(p));
    }

    @GetMapping("/{search}")
    public List<Person> getPerson(@PathVariable String search) {
        return personRepo.findByNameOrLastNameLike(search, search);
    }
}
