// Create a program to take two numbers as input and display their sum.

import com.slip.GetInput;
import com.slip.MatMe;

public class AddTwoNum {
    public static void main(String[] args) {
        addNums(GetInput.getIntegerNumber(), GetInput.getIntegerNumber());
    }

    static void addNums(int a, int b) {System.out.println("Addition is: " + (a+b));}


}
