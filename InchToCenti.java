// Create a program to convert inches to centimeters.

import java.util.Scanner;

public abstract class InchToCenti {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Inches: ");
        System.out.println(scan.nextFloat() * 2.54f + " Centimeters");

    }

}
