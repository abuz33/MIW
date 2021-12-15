// Created by huub
// Creation date 2020-02-27

package nl.hva.miw.c18.demo2.controller;

import nl.hva.miw.c18.demo2.model.ClubMember;
import nl.hva.miw.c18.demo2.model.dao.ClubMemberDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainMenuController {

  @Autowired
  private ClubMemberDao clubMemberDao;

  public MainMenuController() {
    super();
  }

  @GetMapping("ledenlijst")
  public String ledenlijstHandler(Model model) {
    Iterable<ClubMember> allMembers = clubMemberDao.findAll();
    model.addAttribute("memberlist", allMembers);
    return "memberlist";
  }

  @GetMapping("new_member")
  public String newMemberHandler(Model model) {
    ClubMember newMember = new ClubMember();
    model.addAttribute("member", newMember);
    return "new_member_form";
  }
}
