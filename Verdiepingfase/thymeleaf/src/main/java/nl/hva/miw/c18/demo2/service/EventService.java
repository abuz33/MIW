// Created by huub
// Creation date 2020-02-27

package nl.hva.miw.c18.demo2.service;

import nl.hva.miw.c18.demo2.model.Clinic;
import nl.hva.miw.c18.demo2.model.ClubMember;
import org.springframework.stereotype.Service;

@Service
public class EventService {

  public EventService() {
    super();
  }

  public void linkTrainerAndClinic(ClubMember trainer, Clinic clinic) {
    trainer.addClinic(clinic);
    clinic.setTrainer(trainer);
  }
}
