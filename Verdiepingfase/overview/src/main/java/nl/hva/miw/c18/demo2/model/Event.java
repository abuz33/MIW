// Created by huub
// Creation date 2020-02-25

package nl.hva.miw.c18.demo2.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Event {

  @Id
  @GeneratedValue
  private int eventId;

  private String name;
  private LocalDate date;

  public Event() {
    super();
  }

  public Event(String name, LocalDate date) {
    super();
    this.name = name;
    this.date = date;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public LocalDate getDate() {
    return date;
  }

  public void setDate(LocalDate date) {
    this.date = date;
  }
}
