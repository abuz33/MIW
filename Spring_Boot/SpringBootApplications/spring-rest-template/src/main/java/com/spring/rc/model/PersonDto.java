/**
 * Created by abuzer.alaca on 27/12/2021
 **/


package com.spring.rc.model;

import java.util.List;

public class PersonDto {

    private Long id;
    private String firstName;
    private String lastName;
    private List<String> address;

    public PersonDto(Long id, String firstName, String lastName, List<String> address) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<String> getAddress() {
        return address;
    }

    public void setAddress(List<String> address) {
        this.address = address;
    }
}
