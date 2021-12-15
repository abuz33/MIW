// Created by huub
// Creation date 2020-02-27

package nl.hva.miw.c18.demo2.controller;

import nl.hva.miw.c18.demo2.model.ClubMember;
import nl.hva.miw.c18.demo2.model.dao.ClubMemberDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@Controller
public class MemberlistController {

  @Autowired
  private ClubMemberDao clubMemberDao;

  public MemberlistController() {
    super();
  }

  @GetMapping("menu")
  public String backToMenuHandler() {
    return "main_menu";
  }

  @GetMapping("edit_member")
  public String editMemberHandler(@RequestParam int id, Model model) {
    Optional<ClubMember> memberToEditOption = clubMemberDao.findById(id);
    ClubMember memberToEdit;
    if (memberToEditOption.isPresent()) {
      memberToEdit = memberToEditOption.get();
    } else {
      memberToEdit = null;
    }
    model.addAttribute("member", memberToEdit);
    return "edit_member_form";
  }
}
