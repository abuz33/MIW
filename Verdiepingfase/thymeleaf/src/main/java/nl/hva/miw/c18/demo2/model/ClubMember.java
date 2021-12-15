// Created by huub
// Creation date 2020-02-23

package nl.hva.miw.c18.demo2.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public final class ClubMember {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  int memberId;

  private String firstname;
  private String lastname;
  private int level;
  private boolean competitionPlayer;

  @OneToMany(mappedBy = "trainer")
  private List<Clinic> clinics;

  public ClubMember() {
    super();
  }

  public ClubMember(String firstname, String lastname, int level, boolean competitionPlayer) {
    super();
    memberId = 0;
    this.clinics = new ArrayList<>();
    this.firstname = firstname;
    this.lastname = lastname;
    this.level = level;
    this.competitionPlayer = competitionPlayer;
  }

  public String getFirstname() {
    return firstname;
  }

  public void setFirstname(String firstName) {
    this.firstname = firstName;
  }

  public String getLastname() {
    return lastname;
  }

  public void setLastname(String lastName) {
    this.lastname = lastName;
  }

  public int getLevel() {
    return level;
  }

  public void setLevel(int level) {
    this.level = level;
  }

  public boolean isCompetitionPlayer() {
    return competitionPlayer;
  }

  public void setCompetitionPlayer(boolean competitionPlayer) {
    this.competitionPlayer = competitionPlayer;
  }

  public void addClinic(Clinic clinic) {
    clinics.add(clinic);
  }
}
