package nl.hva.springdatarepo.repositories;

import nl.hva.springdatarepo.models.User;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import javax.transaction.Transactional;
import java.util.List;

@RepositoryRestResource
public interface UserRepository extends CrudRepository<User, Long> {

    User findByVoornaam(@Param("vnaam") String voornaam);

    User findByVoornaamAndAchternaam(String voornaam, String achternaam);

    User findByVoornaamOrAchternaam(String voornaam, String achternaam);

    @Query(value = "select * from `user`", nativeQuery = true)
    List<User> getAllUser();

    @Modifying
    @Transactional
    @Query(value = "delete from `user` where id = ?1", nativeQuery = true)
    int removeById(@Param("id") long id);

    @Query(value = "select count(u) from User u where u.achternaam = :achternaam group by u.achternaam")
    int countUser(String achternaam);
}
