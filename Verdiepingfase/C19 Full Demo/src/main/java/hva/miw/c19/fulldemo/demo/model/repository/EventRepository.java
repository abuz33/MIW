// Created by huub
// Creation date 2020-05-19

package hva.miw.c19.fulldemo.demo.model.repository;

import hva.miw.c19.fulldemo.demo.model.Event;
import org.springframework.data.repository.CrudRepository;

public interface EventRepository extends CrudRepository<Event, Integer> {

}
