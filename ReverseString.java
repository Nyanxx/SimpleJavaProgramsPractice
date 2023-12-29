// Implement a program that takes a sentence as input and prints it backward.

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a Sentence: ");
        String str = scan.nextLine();
//        String reverseStr = "";

        for (int i = str.length()-1 ; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }





    }
}
