//    Write a program that takes your name as input and prints a greeting.

import java.util.Scanner;

public class GreetThem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // taking name form user
        System.out.print("What is your name? - ");
        String name = sc.next();
        System.out.println("Hello! " + name +".How are you?");
    }

}
