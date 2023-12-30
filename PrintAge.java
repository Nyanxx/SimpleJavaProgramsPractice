// Develop a program that uses a variable to store your age and then prints it.

import java.util.Scanner;

public class PrintAge {

    public static void main(String[] args) {

        System.out.print("Enter your age: ");
        Scanner scan = new Scanner(System.in);
        int age = scan.nextInt();

        System.out.print("You entered " + age + " as your age!");
    }
}
