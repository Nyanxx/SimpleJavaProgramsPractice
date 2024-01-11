// Implement a function to check if a number is prime.

import com.slip.GetInput;

public class FuncPrime {
    public static void main(String[] args) {


        while (true) {

            int num = GetInput.getIntegerNumber("Enter number to check if it's Prime Number or Not: ");
            if(isPrime(num)){
                System.out.println( num + " is a prime number");
            }else {
                System.out.println( num + " is not a prime number");
            }
        }

    }

    static boolean isPrime(int num){

        if (num <= 1) return false;
        for (int i = 2; i < Math.sqrt(num+10) ; i++) {
            if (num % i == 0){
                return false;
            }
        }
        return true;
    }
}
