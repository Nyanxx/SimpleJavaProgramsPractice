// Write a program that concatenates two strings.

import java.util.Scanner;

public class ConcatenatesString {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter First String: ");
        String s1 = scan.nextLine();
        System.out.print("Enter Second String: ");
        String s2 = scan.nextLine();

        String concatenatedString = s1 + " " + s2;
        System.out.println("The Concatenated String is : " + concatenatedString);

    }
}
