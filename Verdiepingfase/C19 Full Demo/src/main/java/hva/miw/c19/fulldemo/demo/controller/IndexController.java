// Created by huub
// Creation date 2020-05-18

package hva.miw.c19.fulldemo.demo.controller;

import hva.miw.c19.fulldemo.demo.backingbeans.CreatePersonBackingBean;
import hva.miw.c19.fulldemo.demo.model.Event;
import hva.miw.c19.fulldemo.demo.model.Person;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {

  public IndexController() {
    super();
  }

  @GetMapping("/")
  public ModelAndView startHandler() {
    ModelAndView mav = new ModelAndView("index");
    return mav;
  }

  @GetMapping("/search_person")
  public ModelAndView searchPersonHandler() {
    ModelAndView mav = new ModelAndView("search_person");
    return mav;
  }

  @GetMapping("/create_person")
  public ModelAndView createPersonHandler() {
    Person person = new Person();
    Event dummyEvent = new Event(0, "Dummy event");
    person.setName("Persoon zonder naam");
    person.setBirth(dummyEvent);
    person.setDeath(dummyEvent);
    CreatePersonBackingBean bb = CreatePersonBackingBean.createBean(person);
    ModelAndView mav = new ModelAndView("create_person");
    mav.addObject("person", bb);
    return mav;
  }
}
