// Created by huub
// Creation date 2020-02-27

package nl.hva.miw.c18.demo2.controller;

import nl.hva.miw.c18.demo2.model.ClubMember;
import nl.hva.miw.c18.demo2.model.dao.ClubMemberDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class NewMemberController {

  @Autowired
  ClubMemberDao clubMemberDao;

  public NewMemberController() {
    super();
  }

  @PostMapping("add_member")
  public String addMemberHandler(@ModelAttribute ClubMember newMember, Model model) {
    clubMemberDao.save(newMember);
    Iterable<ClubMember> allMembers = clubMemberDao.findAll();
    model.addAttribute("memberlist", allMembers);
    return "memberlist_template";
  }
}
