// Create a program to generate and print a random number between 1 and 50.

import java.util.Random;

public class Random1To50 {
    public static void main(String[] args) {

        Random random = new Random();
        System.out.println(random.nextInt(50)+1);

    }

}
