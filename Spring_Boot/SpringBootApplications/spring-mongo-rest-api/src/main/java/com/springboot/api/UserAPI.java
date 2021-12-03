package com.springboot.api;

import com.springboot.entity.User;
import com.springboot.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserAPI {
    @Autowired
    private IUserRepository userRepository;

    @PostConstruct
    public void init() {
        User user = new User();
        user.setFirstName("Abuzer");
        user.setLastName("Alaca");

        userRepository.save(user);
    }

    @PostMapping
    public ResponseEntity<User> addUser(@RequestBody User user) {
        return ResponseEntity.ok(userRepository.save(user));
    }

    @GetMapping
    public ResponseEntity<List<User>> findAllUser() {
        return ResponseEntity.ok(userRepository.findAll());
    }
}
