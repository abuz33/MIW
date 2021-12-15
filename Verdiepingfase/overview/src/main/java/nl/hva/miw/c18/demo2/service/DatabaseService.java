// Created by huub
// Creation date 2020-02-23

package nl.hva.miw.c18.demo2.service;

import nl.hva.miw.c18.demo2.model.Clinic;
import nl.hva.miw.c18.demo2.model.ClubMember;
import nl.hva.miw.c18.demo2.model.dao.ClinicDao;
import nl.hva.miw.c18.demo2.model.dao.ClubMemberDao;
import nl.hva.miw.c18.demo2.model.dao.EventDao;
import nl.hva.miw.c18.demo2.model.dao.PartyDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class DatabaseService {

  @Autowired
  private EventService eventService;

  @Autowired
  private ClubMemberDao clubMemberDao;

  @Autowired
  private ClinicDao clinicDao;

  @Autowired
  private PartyDao partyDao;

  public DatabaseService() {
    super();
  }

  public void fillDatabase() {

    ClubMember charles = new ClubMember("Charles", "de Gaulle", "geheim", 4, true, false);
    ClubMember georges = new ClubMember("Georges", "Pompidou", "welkom123", 2, false, false);
    ClubMember valéry = new ClubMember("Valéry", "Giscard d'Estaing", "x", 3, false, false);
    ClubMember françois = new ClubMember("François", "Mitterrand", "geheim", 5, true, false);
    ClubMember jacques = new ClubMember("Jacques", "Chirac", "geheim", 2, true, true);
    ClubMember nicolas = new ClubMember("Nicolas", "Sarkozy", "geheim", 4, false, true);
    ClubMember emmanuel = new ClubMember("Emmanuel", "Macron", "geheim", 4, true, false);

    clubMemberDao.save(charles);
    clubMemberDao.save(georges);
    clubMemberDao.save(valéry);
    clubMemberDao.save(françois);
    clubMemberDao.save(jacques);
    clubMemberDao.save(nicolas);
    clubMemberDao.save(emmanuel);

    LocalDate date1 = LocalDate.of(2019, 12, 22);
    Clinic mikken = new Clinic("Beter mikken", date1);

    LocalDate date2 = LocalDate.of(2020, 2, 23);
    Clinic gooien = new Clinic("Verjaardagsballen gooien", date2);

    LocalDate date3 = LocalDate.of(2020, 3, 13);
    Clinic tactiek = new Clinic("Tactische momenten", date3);

    clinicDao.save(mikken);
    clinicDao.save(gooien);
    clinicDao.save(tactiek);

    eventService.linkTrainerAndClinic(georges, mikken);
    eventService.linkTrainerAndClinic(jacques, gooien);
    eventService.linkTrainerAndClinic(georges, tactiek);

    clubMemberDao.save(charles);
    clubMemberDao.save(georges);
    clubMemberDao.save(valéry);
    clubMemberDao.save(françois);
    clubMemberDao.save(jacques);
    clubMemberDao.save(nicolas);
    clubMemberDao.save(emmanuel);

    clinicDao.save(mikken);
    clinicDao.save(gooien);
    clinicDao.save(tactiek);
  }

  public void getAllMembers() {
    Iterable<ClubMember> allMembers = clubMemberDao.findAll();
    for (ClubMember member: allMembers) {
      System.out.println(member.getFirstname() + ", " + member.getLastname());
    }
  }

  public void getMembersByLevel(int level) {
    Iterable<ClubMember> allLevel2Members = clubMemberDao.findByLevel(level);
    for (ClubMember member: allLevel2Members) {
      System.out.println(member.getFirstname() + " " + member.getLastname() + ", level: " + member.getLevel());
    }
  }
}
