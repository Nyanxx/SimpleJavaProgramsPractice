// Implement a program to count the number of characters in a string without length() method.

import java.util.Scanner;

public class CountChar {
    public static void main(String[] args) {

        Scanner scan =  new Scanner(System.in);
        System.out.print("Enter String: ");
        String s1 = scan.nextLine();

        int count = 0;
        int spaceCount = 0;


        try {
            do {
                s1.charAt(count);
                if (s1.charAt(count) == ' ') {
                    spaceCount++;
                }
                count++;
            } while (true);
        } catch (Exception e) {
            System.out.println("Total characters in give string are: " + count);
            System.out.println("Total characters in give string without spaces are: " + (count-spaceCount));
        }



    }
}
