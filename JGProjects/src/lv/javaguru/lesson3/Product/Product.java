package lv.javaguru.lesson3.Product;

public class Product {
    private String name;
    private double regularPrice;
    private int discount;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRegularPrice() {
        return regularPrice;
    }

    public void setRegularPrice(double regularPrice) {
        this.regularPrice = regularPrice;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    double calculateActualPrice() {
        return regularPrice - (regularPrice * (double) discount / 100);
    }

    public void printInformation() {
        System.out.println("Product : name = " + getName() + ", regular price = " + getRegularPrice() + " EUR, discount = " + getDiscount() + "%, actual price = " + calculateActualPrice() + " EUR.");
    }


    public void greeting() {
        System.out.println("Hello, I'm your product!");
        System.out.println("===========");
    }


}
