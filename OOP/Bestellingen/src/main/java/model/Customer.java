package model;

public class Customer {
    private int customerId;
    private String customerName;
    private String city;

    public Customer(int customerId, String customerName, String city) {
        this.customerName = customerName;
        this.city = city;
        this.customerId = customerId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return String.format("Customer ID is %s, \nCustomer name is %s, \nCustomer lives in %s.\n", customerId, customerName, city);
    }
}
