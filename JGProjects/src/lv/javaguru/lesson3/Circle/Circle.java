package lv.javaguru.lesson3.Circle;

public class Circle {
    double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        System.out.println("Setting radius...");
        this.radius = radius;
    }

    double calculateArea() {
        System.out.println("Calculating...");
        return 3.14 * radius * radius;
    }

    public void greeting() {
        System.out.println("Hello, I calculate circle square!");
        System.out.println("===========");
    }
}