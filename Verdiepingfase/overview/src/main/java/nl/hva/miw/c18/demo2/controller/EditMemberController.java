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
public class EditMemberController {

  @Autowired
  ClubMemberDao clubMemberDao;

  public EditMemberController() {
    super();
  }

  @PostMapping("edit_member")
  public String editMemberHandler(@ModelAttribute ClubMember member, Model model) {
    clubMemberDao.save(member);
    Iterable<ClubMember> allMembers = clubMemberDao.findAll();
    model.addAttribute("memberlist_attribute", allMembers);
    return "memberlist_template";
  }
}
