package nl.hva.miw.c18.demo2.model.dao;

import nl.hva.miw.c18.demo2.model.Party;
import org.springframework.data.repository.CrudRepository;

public interface PartyDao extends CrudRepository<Party, Integer> {
}
