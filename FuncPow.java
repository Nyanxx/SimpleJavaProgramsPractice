// Develop a function to calculate the power of a number.

import static com.slip.GetInput.getIntegerNumber; // avoid using static imports

public class FuncPow {
    public static void main(String[] args) {
        System.out.println(givePow(getIntegerNumber("Enter Number: "),getIntegerNumber("Enter it's Power: ")));
    }

    static int givePow(int number, int power){
        int temp = 1;
        for (int i = 0; i < power; i++) {
            temp = number * power;
        }
        return temp;
    }

}
