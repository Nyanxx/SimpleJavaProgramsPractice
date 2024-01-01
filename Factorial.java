// Create a program that calculates the factorial of a number using a loop.

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        long num;
        long factorial = 1;

        // take only positive value
        do {
            System.out.print("Enter number: ");
            num = scan.nextInt();
        } while (num < 0);

        // factorial logic
        while (num != 0 ){
            factorial = factorial * num;
            num--;
        }

        System.out.println("Factorial is " + factorial);

    }
}
