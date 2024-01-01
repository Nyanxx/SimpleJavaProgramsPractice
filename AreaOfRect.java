// Write a program to calculate the area of a rectangle using length and width variables.

import java.util.Scanner;

public class AreaOfRect {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Length: ");
        int length = scan.nextInt();
        System.out.print("Enter Width: ");
        int width = scan.nextInt();

        System.out.println("Area of Rectangle is: " + (length*width));

    }
}
