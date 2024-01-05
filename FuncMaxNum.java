// Create a function to find the maximum of two numbers.

import java.util.Scanner;

public class FuncMaxNum {
    static int maxNum(int num1, int num2){
//        return num1 > num2 ? num1: num2;
        return Math.max(num1, num2);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        System.out.println(maxNum(num1, num2));
    }

}
