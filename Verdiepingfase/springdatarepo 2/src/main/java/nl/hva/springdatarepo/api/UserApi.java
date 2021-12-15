package nl.hva.springdatarepo.api;

import nl.hva.springdatarepo.models.User;
import nl.hva.springdatarepo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserApi {
    @Autowired
    private UserRepository userRepository;

    @GetMapping
    public ResponseEntity<Iterable<User>> findAll() {
        return ResponseEntity.ok(userRepository.findAll());
    }
}
