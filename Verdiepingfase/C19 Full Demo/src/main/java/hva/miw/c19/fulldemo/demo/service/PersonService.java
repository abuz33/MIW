// Created by huub
// Creation date 2020-05-19

package hva.miw.c19.fulldemo.demo.service;

import hva.miw.c19.fulldemo.demo.model.Person;
import hva.miw.c19.fulldemo.demo.model.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PersonService {

  @Autowired
  private PersonRepository personRepository;

  public PersonService() {
    super();
  }

  public void savePerson(Person person) {
    personRepository.save(person);
  }

  public Person findPerson(int id) {
    Optional<Person> p = personRepository.findById(id);
    if (p.isPresent()) {
      return p.get();
    } else {
      return null;
    }
  }
}
