// Develop a program that replaces all occurrences of a specific character in a string.


import java.util.Scanner;

public class ReplaceCharOccurrence {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String str = scan.nextLine();

        // replacing spaces with underscore

        // by replace() method of Sting Class
        String newStr = str.replace(" ", "_");
        System.out.println("1. " + newStr);

        // crude way
        String locStr = "";
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) != ' '){
                 locStr += str.charAt(i);
            } else {
                locStr += '_';
            }
        }
        System.out.println("2. " + locStr);



    }
}
