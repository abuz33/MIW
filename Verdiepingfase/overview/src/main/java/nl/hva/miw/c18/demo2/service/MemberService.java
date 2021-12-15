// Created by huub
// Creation date 2020-03-02

package nl.hva.miw.c18.demo2.service;

import nl.hva.miw.c18.demo2.model.ClubMember;
import nl.hva.miw.c18.demo2.model.dao.ClubMemberDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

@Service
public class MemberService {

  @Autowired
  private ClubMemberDao memberDao;

  public MemberService() {
    super();
  }

  public List findAllMembers() {
    Iterable<ClubMember> allMembersIter = memberDao.findAll();
    Iterator<ClubMember> iter = allMembersIter.iterator();
    List<ClubMember> allMembers = new ArrayList<>();
    while (iter.hasNext()) {
      allMembers.add(iter.next());
    }
    return allMembers;
  }

  public ClubMember findMember(String name) {
    Optional<ClubMember> memberOption = memberDao.findByFirstname(name);
    if ( memberOption.isPresent()) {
      return memberOption.get();
    } else {
      return null;
    }
  }
}
