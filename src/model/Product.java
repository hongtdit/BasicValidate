package model;

public class Product {
    private int id;

    private String productName;

    private double high;

    public Product(int id, String productName, double high) {
        this.id = id;
        this.productName = productName;
        this.high = high;
    }

    public Product() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getHigh() {
        return high;
    }

    public void setHigh(double high) {
        this.high = high;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", productName='" + productName + '\'' +
                ", high=" + high +
                '}';
    }
}
