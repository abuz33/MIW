package nl.hva.miw.c18.demo2.model.dao;

import nl.hva.miw.c18.demo2.model.Clinic;
import org.springframework.data.repository.CrudRepository;

public interface ClinicDao extends CrudRepository<Clinic, Integer> {
}
