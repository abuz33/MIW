package nl.hva.miw.springrest.users;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement // needed for XML parsing and output
class User {

    // Used to simulate an auto increment
    private static long USER_COUNTER = 0;

    private long id;
    private String firstName;
    private String lastName;

    public User(String firstName, String lastName) {
        this();
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public User() {
        this.id = ++USER_COUNTER;
    }

    public long getId() {
        return id;
    }

    /*
     * Getters are used to produce JSON
     */
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setId(long id) {
        this.id = id;
    }
}
