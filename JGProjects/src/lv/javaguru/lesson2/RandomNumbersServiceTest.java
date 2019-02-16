package lv.javaguru.lesson2;

import java.util.Random;



public class RandomNumbersServiceTest {
    public static void main(String[] args) {
        Random randomGenerator = new Random();

        int firstRandomNumber = randomGenerator.nextInt(10);
        int secondRandomNumber = randomGenerator.nextInt(10);
        int thirdRandomNumber = randomGenerator.nextInt(10);

        int finalResult = firstRandomNumber + secondRandomNumber + thirdRandomNumber;

        System.out.println("Random Number Generator Test v1");
        System.out.println("Random numbers are: " + firstRandomNumber + " " + secondRandomNumber + " " + thirdRandomNumber + ".");
        System.out.println("Sum of all the numbers: " + finalResult + ".");
        System.out.println("Job is done :)");
    }

}
