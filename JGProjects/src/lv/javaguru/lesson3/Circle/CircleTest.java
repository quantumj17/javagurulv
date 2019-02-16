package lv.javaguru.lesson3.Circle;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle();

        circle.greeting();
        circle.setRadius(2);
        System.out.println("Current radius is: " + circle.getRadius());
        System.out.println("This circle square value is: " + circle.calculateArea());
        System.out.println("Job's done.");

    }
}
