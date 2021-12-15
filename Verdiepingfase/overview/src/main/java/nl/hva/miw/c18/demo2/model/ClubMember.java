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
  private int memberId;

  private String firstname;
  private String lastname;

  private String password;
  private int level;
  private boolean competitionPlayer;
  private boolean boardMember;

  @OneToMany(mappedBy = "trainer")
  private List<Clinic> clinics;

  public ClubMember() {
    super();
  }

  public ClubMember(String firstname, String lastname, String password, int level, boolean competitionPlayer, boolean boardMember) {
    super();
    memberId = 0;
    this.clinics = new ArrayList<>();
    this.firstname = firstname;
    this.lastname = lastname;
    this.password = password;
    this.level = level;
    this.competitionPlayer = competitionPlayer;
    this.boardMember = boardMember;
  }

  public int getMemberId() {
    return memberId;
  }

  public void setMemberId(int memberId) {
    this.memberId = memberId;
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

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public boolean isBoardMember() {
    return boardMember;
  }

  public void setBoardMember(boolean boardMember) {
    this.boardMember = boardMember;
  }
}
