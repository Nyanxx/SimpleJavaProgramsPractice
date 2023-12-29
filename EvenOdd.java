// Make a program that reads a whole number and prints whether it's even or odd.

import java.util.Scanner;

public class EvenOdd {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int num = sc.nextInt();

        if(num%2==0) {
            System.out.println(num + " is a even number.");
        }
        else {
            System.out.println(num + " is a odd number.");
        }
    }
}
