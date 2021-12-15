package nl.hva.springdatarepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.Optional;

/**
 * CommandlineRunner interface bevat methode run
 * run start het the IoC container
 * run kunnen we als main geladen met een context beschouwen
 */
@SpringBootApplication
public class SpringdatarepoApplication implements CommandLineRunner {

//    @Autowired
//    UserRepository userRepo;

    public static void main(String[] args) {
        SpringApplication.run(SpringdatarepoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
    }
}
