// Created by huub
// Creation date 2020-02-27

package nl.hva.miw.c18.demo2.controller;

import nl.hva.miw.c18.demo2.model.ClubMember;
import nl.hva.miw.c18.demo2.model.dao.ClubMemberDao;
import nl.hva.miw.c18.demo2.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class MainMenuController {

  @Autowired
  private MemberService memberService;

  public MainMenuController() {
    super();
  }

  @GetMapping("memberlist_request")
  public String memberlistHandler(Model model) {
    List allMembers = memberService.findAllMembers();
    model.addAttribute("memberlist_attribute", allMembers);
    return "memberlist_template";
  }

  @GetMapping("new_member")
  public String newMemberHandler(Model model) {
    ClubMember newMember = new ClubMember();
    model.addAttribute("member", newMember);
    return "new_member_form";
  }
}
