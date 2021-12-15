// Created by huub
// Creation date 2020-02-25

package nl.hva.miw.c18.demo2.model;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import java.time.LocalDate;

@Entity
public final class Party extends Event {

  private boolean noAlcohol;

  public Party() {
    super();
  }

  public Party(String name, LocalDate date, boolean noAlcohol) {
    super(name, date);
    this.noAlcohol = noAlcohol;
  }

  public boolean isNoAlcohol() {
    return noAlcohol;
  }

  public void setNoAlcohol(boolean noAlcohol) {
    this.noAlcohol = noAlcohol;
  }
}
