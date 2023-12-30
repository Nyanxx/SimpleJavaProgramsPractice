//Make a program that swaps the values of two variables.

public class SwapVarValue {

    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        int temp;

        System.out.println("Value of a is: " + a);
        System.out.println("Value of b is: " + b);

        System.out.println("Swapping Values...");

        temp = a;
        a = b;
        b = temp;

        System.out.println("After swapping value of a is: " + a);
        System.out.println("After swapping value of b is: " + b);


    }


}
