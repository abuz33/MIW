package nl.hva.miw.springrest.users;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;

/**
 * UserRepository Simulation
 */
@Service
class UserRepository {

    private static final int USER_COUNT = 20;
    private static final String[] firstNames = { "Eva", "Karel", "Willem", "Marie", "Saskia", "Annet", "Sergio", "Michel", "Ria" };
    private static final String[] lastNames = { "Jansen", "Pietersen", "Willemsen", "Smit", "De Jong", "De Vies", "Bakker", "Bos" };

    private List<User> userList;

    UserRepository() {
        this.userList = new ArrayList<>();
        generateRandomUsers(USER_COUNT);
    }

    private void generateRandomUsers(int n) {
        Random rng = new Random();
        for(int index = 0; index < n; index++){
            userList.add(new User(firstNames[rng.nextInt(firstNames.length)], lastNames[rng.nextInt(lastNames.length)]));
        }
    }

    List<User> list() {
        return userList;
    }

    Optional<User> findById(long id) {
        return userList.stream().filter(it -> it.getId() == id ).findFirst();
    }

    void create(User user) {
        userList.add(user);
    }

    /**
     * just update, this is replace
     * @param user
     */
    void update(User user) {
        userList.set((int)user.getId(), user);
    }

    void delete(User user) {
        userList.remove(user);
    }
}
