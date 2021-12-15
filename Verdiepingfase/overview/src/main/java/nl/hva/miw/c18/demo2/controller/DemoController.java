// Created by huub
// Creation date 2020-02-23

package nl.hva.miw.c18.demo2.controller;

import nl.hva.miw.c18.demo2.service.DatabaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {

  @Autowired
  private DatabaseService databaseService;

  public DemoController() {
    super();
  }

  @GetMapping("fill_database")
  public String fillDatabaseHandler() {
    databaseService.fillDatabase();
    return "database_demo";
  }

  @GetMapping("database_demo")
  public String databaseDemoHandler() {
    return "database_demo";
  }

  @GetMapping("get_database")
  public String getDatabaseHandler() {
    databaseService.getAllMembers();
    return "database_demo";
  }

  @GetMapping("get_members_level_2")
  public String getMembersLevel2() {
    databaseService.getMembersByLevel(2);
    return "database_demo";
  }
}
