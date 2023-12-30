// Implement a program to determine if a number is divisible by both 2 and 3.

import java.util.Scanner;

public class DivisibleBy2_3 {

    public static void main(String[] args) {

        System.out.print("Enter a number: ");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        System.out.println(((num%2 + num%3) == 0) ? "Is Divisible by 2 & 3 both": "Is Not Divisible by 2 & 3 both");
//        System.out.println(((num%2 == 0) && (num%3 == 0)) ? "Is Divisible by 2 & 3 both": "Is Not Divisible by 2 & 3 both");

    }
}
