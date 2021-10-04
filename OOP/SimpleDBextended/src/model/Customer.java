package model;

import java.util.Objects;

public class Customer {
    private String name;
    private String country;
    private int sleutel;

    public void setSleutel(int sleutel) {
        this.sleutel = sleutel;
    }

    public Customer(String name, String country) {
        this.name = name;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", sleutel=" + sleutel +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Customer)) return false;
        Customer customer = (Customer) o;
        return Objects.equals(name, customer.name) && Objects.equals(country, customer.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, country);
    }
}
