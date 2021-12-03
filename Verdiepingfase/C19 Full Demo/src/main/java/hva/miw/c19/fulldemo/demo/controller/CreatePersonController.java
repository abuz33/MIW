// Created by huub
// Creation date 2020-05-19

package hva.miw.c19.fulldemo.demo.controller;

import hva.miw.c19.fulldemo.demo.backingbeans.CreatePersonBackingBean;
import hva.miw.c19.fulldemo.demo.model.Person;
import hva.miw.c19.fulldemo.demo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CreatePersonController {

  @Autowired
  private PersonService personService;

  public CreatePersonController() {
    super();
  }

  @PostMapping("/create_person")
  public ModelAndView createPersonHandler(@ModelAttribute CreatePersonBackingBean bb) {
    ModelAndView mav = new ModelAndView("person_details");
    Person person = bb.person();
    personService.savePerson(person);
    mav.addObject("name", person.getName());
    mav.addObject("birth", person.getBirth().getDate().getYear());
    mav.addObject("death", person.getDeath().getDate().getYear());
    return mav;
  }
}
