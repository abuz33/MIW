package model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Order {
    private Customer customer;
    private ArrayList<Orderline> orderlines;
    private int totalOrderPrice;
    private LocalDate datum;

    public Order(Customer customer, ArrayList<Orderline> orderlines) {
        this.customer = customer;
        this.orderlines = orderlines;
        this.datum = LocalDate.now();
    }

    public Order(Customer customer, ArrayList<Orderline> orderlines, LocalDate datum) {
        this.customer = customer;
        this.orderlines = orderlines;
        this.datum = datum;
    }

    public void setTotalOrderPrice(int totalOrderPrice) {
        int totalPrice = 0;
        for (Orderline orderline : orderlines) {
            totalPrice += orderline.getTotalPrice();
        }
        this.totalOrderPrice = totalPrice;
    }

    public void addOrderline(Orderline orderline) {
        this.orderlines.add(orderline);
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public ArrayList<Orderline> getOrderlines() {
        return orderlines;
    }

    public void setOrderlines(ArrayList<Orderline> orderlines) {
        this.orderlines = orderlines;
    }

    public int getTotalOrderPrice() {
        return totalOrderPrice;
    }

    public LocalDate getDatum() {
        return datum;
    }

    public void setDatum(LocalDate datum) {
        this.datum = datum;
    }
}
