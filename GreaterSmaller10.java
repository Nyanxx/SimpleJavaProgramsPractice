// Create a program to check if a number is greater than, less than, or equal to 10.

import java.util.Scanner;

public class GreaterSmaller10 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a Number: ");
        int num = scan.nextInt();

        if (num > 10) {
            System.out.println(num + " is Greater Than 10");
        } else if (num < 10) {
            System.out.println(num + " is Smaller Than 10");
        } else {
            System.out.println("inputted number is equals to 10");
        }

    }
}
