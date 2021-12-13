package com.example.springinitializer;


import com.example.springinitializer.model.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/voorbeeld")
public class VoorbeeldController {
    List<String> list = new ArrayList<>();
    ArrayList<User> users = new ArrayList(
            Arrays.asList(
                    new User("Jan", "Jansen", 11),
                    new User("Piet", "Pieters", 23),
                    new User("Klaas", "Klasen", 24)
            )
    );

    @PostConstruct
    public void init() {
        list.add("Abuzer");
        list.add("John");
        list.add("Jon");
    }

    @GetMapping("/user")
    public String getAllUsers() {
        StringBuilder html = new StringBuilder("<ul>");
        for (User u : users) {
            html.append("<li>").append(u.getFirstName()).append(" ").append(u.getLastName()).append(" ").append(u.getAge());
        }
        return html.toString();
    }

    @GetMapping
    public List<String> hallo(@RequestParam(required = false) String name) {
        if (name == null) throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        list.add(name);
        return list;
    }

    @GetMapping("/bla")
    public String bla() {
        return "bla";
    }

    @GetMapping("/search")
    public boolean getName() {
        return true;
    }

    @GetMapping("/search/{name}")
    public ResponseEntity<Boolean> getName(@PathVariable String name) {
        return ResponseEntity.ok(list.contains(name));
    }
}
