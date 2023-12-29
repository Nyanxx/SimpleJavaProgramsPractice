//Create a program that checks if a user-inputted number is between 1 and 100 (inclusive).

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class Between1To100 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        byte num;

        System.out.println("Enter number between 1 and 100: ");
        while (true) {
            num = scan.nextByte();
            if(num > 0 && num <= 100){
                System.out.println("Inputted number is between 1 and 100");
                return;
            } else {
                System.out.println("Inputted number should be between 1 and 100!");
            }
        }

    }
}
