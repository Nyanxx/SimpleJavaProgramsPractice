// Develop a program that checks if a given number is positive or negative.

import java.util.Scanner;

public class PositiveOrNegative {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.println("Please Enter a Number: ");
        int num = read.nextInt();

        String result = (num<0) ? "Negative" : "Positive";
        System.out.println("Number is " + result);
        }
    }