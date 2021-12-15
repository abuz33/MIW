package nl.hva.springdatarepo;

import nl.hva.springdatarepo.models.User;
import nl.hva.springdatarepo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.Optional;

/**
 * CommandlineRunner interface bevat methode run
 * run start het the IoC container
 * run kunnen we als main geladen met een context beschouwen
 */
@SpringBootApplication
//@EnableJpaRepositories
public class SpringdatarepoApplication implements CommandLineRunner {

    @Autowired
    UserRepository userRepo;

    public static void main(String[] args) {
        SpringApplication.run(SpringdatarepoApplication.class, args);

    }


    @Override
    public void run(String... args) throws Exception {
        System.out.println("------------USERS---------------\n\n");
        // print wat er in de database user tabel zit
        // gebruikmakend van een datarepository
        for (User user: userRepo.findAll()) {
            System.out.println(user);
        }
        // 2 bestaat. 5 niet
        Optional<User> opt1= userRepo.findById(2L);
        System.out.println("User 2 is: " + (opt1.isPresent() == true ? opt1.get(): "null"));

        Optional<User> opt2= userRepo.findById(5L);
        System.out.println("User 5 is: " + (opt2.isPresent() == true ? opt2.get(): "null"));

        // zoek nu met voornaam
        User joop = userRepo.findByVoornaam("Joop");
        System.out.println("Met voornaam: " + joop);

        User joopBekend = userRepo.findByVoornaamAndAchternaam("Joop", "Zoetemelk");
        System.out.println("Met voornaam EN achternaam: " + joopBekend);

        User joopOnBekend = userRepo.findByVoornaamAndAchternaam("Joop", "De Hoop");
        System.out.println("Met voornaam EN achternaam: " + joopOnBekend);

        User joopHalfBekend = userRepo.findByVoornaamOrAchternaam("Joop", "De Hoop");
        System.out.println("Met voornaam OF achternaam: " + joopHalfBekend);


        System.out.println("\n\n------------END USERS---------------");
    }
}
