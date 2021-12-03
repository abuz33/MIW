// Created by huub
// Creation date 2020-05-19

package hva.miw.c19.fulldemo.demo.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Event {

  @Id
  @GeneratedValue
  private int id;

  private LocalDate date;
  private String description;

  public Event() {
    super();
  }

  public Event(LocalDate date, String description) {
    this.date = date;
    this.description = description;
  }

  public Event(int year, String description) {
    this.description = description;
    this.date = LocalDate.of(year, 1, 1);
  }

  public void setId(int id) {
    this.id = id;
  }

  public int getId() {
    return this.id;
  }

  public LocalDate getDate() {
    return date;
  }

  public void setDate(LocalDate date) {
    this.date = date;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }
}
