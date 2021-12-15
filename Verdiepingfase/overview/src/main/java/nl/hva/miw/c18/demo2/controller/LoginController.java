// Created by huub
// Creation date 2020-03-03

package nl.hva.miw.c18.demo2.controller;

import nl.hva.miw.c18.demo2.model.ClubMember;
import nl.hva.miw.c18.demo2.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("member")
public class LoginController {

  @Autowired
  private MemberService memberService;

  public LoginController() {
    super();
  }

  @PostMapping("member_login")
  public String loginHandler(
      @RequestParam(name="member_name") String name,
      @RequestParam(name="member_password") String password,
      Model model) {
    String nextPage = "";
    ClubMember member = memberService.findMember(name);
    if (member != null) {
      if (member.getPassword().equals(password)) {
        model.addAttribute("member", member);
        if (member.isBoardMember()) {
          nextPage = "main_menu";
        } else {
          nextPage = "member_page";
        }
      } else {
        nextPage = "login";
      }
    } else {
      nextPage = "index";
    }
    return nextPage;
  }
}
