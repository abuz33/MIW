// Created by huub
// Creation date 2020-02-27

package nl.hva.miw.c18.demo2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MemberlistController {

  public MemberlistController() {
    super();
  }

  @GetMapping("menu")
  public String backToMenuHandler() {
    return "menu";
  }
}
