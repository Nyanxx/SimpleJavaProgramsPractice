//Create a program that checks if a word is a palindrome.

import java.util.Scanner;

public class WordPalindrome {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter any word: ");
        String s1 = scan.next();
        StringBuilder revStr = new StringBuilder();

        for (int i = s1.length()-1 ; i >= 0; i--) {
            revStr.append(s1.charAt(i));
        }

        if(s1.contentEquals(revStr)){
            System.out.println(s1 + " is palindrome");
        } else {
            System.out.println(s1 + " is not a palindrome");
        }


    }
}
