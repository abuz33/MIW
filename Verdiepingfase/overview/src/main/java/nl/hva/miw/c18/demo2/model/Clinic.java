// Created by huub
// Creation date 2020-02-25

package nl.hva.miw.c18.demo2.model;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import java.time.LocalDate;

@Entity
public final class Clinic extends Event {

  @ManyToOne
  private ClubMember trainer;

  public Clinic() {
    super();
  }

  public Clinic(String name, LocalDate date) {
    super(name, date);
    this.trainer = null;
  }

  public ClubMember getTrainer() {
    return trainer;
  }

  public void setTrainer(ClubMember trainer) {
    this.trainer = trainer;
  }
}
