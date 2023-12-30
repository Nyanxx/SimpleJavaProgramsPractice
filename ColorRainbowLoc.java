// Write a program that asks for color  in rainbow and prints the position of its with switch case.

import java.util.Scanner;

public class ColorRainbowLoc {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter any color name in rainbow to know its location:  ");
        String color = scan.next().toLowerCase();

        switch (color) {

            case "red" -> System.out.println("Pos: 1");
            case "orange" -> System.out.println("Pos: 2");
            case "yellow" -> System.out.println("Pos: 3");
            case "green" -> System.out.println("Pos: 4");
            case "blue" -> System.out.println("Pos: 5");
            case "indigo" -> System.out.println("Pos: 6");
            case "violet" -> System.out.println("Pos: 7");
            default -> System.out.println("Check the Spelling / Color Doesn't Exist in Rainbow");

        }

    }

}
