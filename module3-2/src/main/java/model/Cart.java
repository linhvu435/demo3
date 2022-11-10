package model;

public class Cart {
    private Product product;
    private int amount;
    private double totalPrice;

    public Cart() {
    }

    public Cart(Product product, int amount, double totalPrice) {
        this.product = product;
        this.amount = amount;
        this.totalPrice = totalPrice;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
}