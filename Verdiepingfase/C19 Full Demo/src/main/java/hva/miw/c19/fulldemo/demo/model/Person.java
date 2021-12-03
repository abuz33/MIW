// Created by huub
// Creation date 2020-05-19

package hva.miw.c19.fulldemo.demo.model;

import javax.persistence.*;

@Entity
public class Person {

  @Id
  @GeneratedValue
  private int id;

  private String name;

  @OneToOne(cascade = CascadeType.ALL)
  private Event birth;

  @OneToOne(cascade = CascadeType.ALL)
  private Event death;

  public Person() {
    super();
  }

  public Person(String name, Event birth, Event death) {
    this.name = name;
    this.birth = birth;
    this.death = death;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Event getBirth() {
    return birth;
  }

  public void setBirth(Event birth) {
    this.birth = birth;
  }

  public Event getDeath() {
    return death;
  }

  public void setDeath(Event death) {
    this.death = death;
  }
}
