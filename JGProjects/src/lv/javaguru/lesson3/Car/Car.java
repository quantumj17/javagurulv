package lv.javaguru.lesson3.Car;

public class Car {
    private String color;
    private String manufacturer;
    private int year;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void greeting() {
        System.out.println("Hello, I'm your car!");
        System.out.println("===========");
    }

}
