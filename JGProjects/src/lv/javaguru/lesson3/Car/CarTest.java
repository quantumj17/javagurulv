package lv.javaguru.lesson3.Car;

public class CarTest {
    public static void main(String[] args) {
        Car car = new Car();

        System.out.println("Producing your car...");
        car.setColor("Red");
        car.setManufacturer("Cadillac");
        car.setYear(1967);

        System.out.println("Manufacturer: " + car.getManufacturer());
        System.out.println("Color: " + car.getColor());
        System.out.println("Year of production: " + car.getYear());
        System.out.println("Done!");

        System.out.println("You are riding on your " + car.getYear() + " year old " + car.getColor() + " " + car.getManufacturer() + "!");
    }
}
