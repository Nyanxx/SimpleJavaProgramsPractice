// Create a program that calculates the factorial of a number using a loop.

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("Factorial is " + getFactorial(getOnlyPositiveNum()));
    }

    // factorial function
    private static long getFactorial(long num){
        long factorial = 1;
        while (num != 0 ){
            factorial = factorial * num;
            num--;
        }
        return factorial;
    }

    // only positive value function
    private static long getOnlyPositiveNum(){
        // take only positive value
        Scanner scan = new Scanner(System.in);
        long num;
        do {
            System.out.print("Enter Number: ");
            num = scan.nextInt();
            if(num < 0) System.out.println("only positive number allowed!!!");;
        } while (num < 0);
        return num;
    }
}
