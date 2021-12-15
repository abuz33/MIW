package nl.hva.springdatarepo.repositories;

import nl.hva.springdatarepo.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface UserRepository extends CrudRepository<User, Long> {

    User findByVoornaam(@Param("vnaam") String voornaam);

    User findByVoornaamAndAchternaam(String voornaam, String achternaam);

    User findByVoornaamOrAchternaam(String voornaam, String achternaam);
}
