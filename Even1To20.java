// Write a program that prints the even numbers between 1 and 20.

public class Even1To20 {

    public static void main(String[] args) {

        // for loop
        for (int i = 1; i < 21; i++) {
            if(i%2==0){
                System.out.println(i);
            }
        }
    }
}
