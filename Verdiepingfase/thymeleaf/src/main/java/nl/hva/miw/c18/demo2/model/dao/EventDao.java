package nl.hva.miw.c18.demo2.model.dao;

    import nl.hva.miw.c18.demo2.model.Event;
    import org.springframework.data.repository.CrudRepository;

public interface EventDao extends CrudRepository<Event, Integer> {
}
