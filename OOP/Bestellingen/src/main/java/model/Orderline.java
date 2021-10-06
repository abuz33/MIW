package model;

public class Orderline {
    private int numberOrdered;
    private Product product;
    private double totalPrice;

    public Orderline(int numberOrdered, Product product) {
        this.numberOrdered = numberOrdered;
        this.product = product;
        setTotalPrice();
    }

    public int getNumberOrdered() {
        return numberOrdered;
    }

    public void setNumberOrdered(int numberOrdered) {
        this.numberOrdered = numberOrdered;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public void setTotalPrice() {
        this.totalPrice = numberOrdered * product.getPrice();
    }

    public double getTotalPrice() {
        return totalPrice;
    }

}
