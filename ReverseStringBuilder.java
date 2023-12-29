// Implement a program that takes a sentence as input and prints it backward with the help of StringBuilder

import java.util.Scanner;

public class ReverseStringBuilder {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        StringBuilder string_obj = new StringBuilder();

        string_obj.append(read.nextLine());
        string_obj.reverse();

        System.out.println(string_obj);

    }
}
