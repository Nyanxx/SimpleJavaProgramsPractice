// Write a program that accepts your age and prints a message based on whether you are a teenager or Adult or else.

import java.util.Scanner;

public class AgeGroup {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        byte age;
        while(true){
            age = read.nextByte();
            if(age>0){
                break;
            }
        }

            if (age <= 3){
                System.out.println("Age Group: Baby");
            } else if (age <= 12) {
                System.out.println("Age Group: Child");
            } else if (age <= 19) {
                System.out.println("Age Group: Teenager");
            } else if (age <= 59) {
                System.out.println("Age Group: Adult");
            } else {
                System.out.println("Age Group: Senior");
            }



    }
}
