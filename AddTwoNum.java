// Create a program to take two numbers as input and display their sum.

import java.util.Scanner;

public class AddTwoNum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Number: ");
        int num1 = sc.nextInt();

        System.out.println("Enter Second Number: ");
        int num2 = sc.nextInt();

        System.out.println("Addition is: " + (num1+num2));
        
    }
}
