//    Write a program that takes your name as input and prints a greeting.

import java.util.Scanner;

public class GreetThem {
    public static void main(String[] args) {

        // asking user for name with message
        String name = askName("What is your name? - ");

        // greeting user
        greetThem(name);
    }

    private static void greetThem(String name){
        String capName = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
        System.out.println("Hello " + capName +". How are you?");
    }

    private static String askName(String msg){
        Scanner sc = new Scanner(System.in);
        System.out.print(msg);
        return sc.next();
    }
}
