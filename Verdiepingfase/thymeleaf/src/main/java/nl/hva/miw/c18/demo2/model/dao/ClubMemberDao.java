package nl.hva.miw.c18.demo2.model.dao;

import nl.hva.miw.c18.demo2.model.ClubMember;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClubMemberDao extends CrudRepository<ClubMember, Integer> {

  public Iterable<ClubMember> findByLevel(int level);

  public List<ClubMember> findByLevelAndLastname(int level, String lastName);

  public ClubMember findTop1ByCompetitionPlayerIsTrueAndFirstnameOrderByLastname(String firstName);
}
