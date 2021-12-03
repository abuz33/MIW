package hva.miw.c19.fulldemo.demo.model.repository;

import hva.miw.c19.fulldemo.demo.model.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends CrudRepository<Person, Integer> {
}
