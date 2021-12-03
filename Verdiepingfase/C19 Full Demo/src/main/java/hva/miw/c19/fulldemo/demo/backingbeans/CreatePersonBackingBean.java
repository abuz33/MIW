// Created by huub
// Creation date 2020-05-19

package hva.miw.c19.fulldemo.demo.backingbeans;

import hva.miw.c19.fulldemo.demo.model.Event;
import hva.miw.c19.fulldemo.demo.model.Person;

public class CreatePersonBackingBean {

  private String name;
  private int yearOfBirth;
  private int yearOfDeath;

  public CreatePersonBackingBean() {
    super();
  }

  public CreatePersonBackingBean(String name, int yearOfBirth, int yearOfDeath) {
    this.name = name;
    this.yearOfBirth = yearOfBirth;
    this.yearOfDeath = yearOfDeath;
  }

  public Person person() {
    Event birth = new Event(yearOfBirth, "Birth of " + name);
    Event death = new Event(yearOfDeath, "Death of " + name);
    Person person = new Person(name, birth, death);
    return person;
  }

  static public CreatePersonBackingBean createBean(Person person) {
    CreatePersonBackingBean bb =
        new CreatePersonBackingBean(person.getName(),
            person.getBirth().getDate().getYear(),
            person.getDeath().getDate().getYear());
    return bb;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getYearOfBirth() {
    return yearOfBirth;
  }

  public void setYearOfBirth(int yearOfBirth) {
    this.yearOfBirth = yearOfBirth;
  }

  public int getYearOfDeath() {
    return yearOfDeath;
  }

  public void setYearOfDeath(int yearOfDeath) {
    this.yearOfDeath = yearOfDeath;
  }
}
