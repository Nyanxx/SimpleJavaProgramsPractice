// Create a program to check if a specific element is present in an array.

public class CheckElementArray {
    public static void main(String[] args) {

        int[] arr = {11, 11, 22, 22, 10};
        int checkValue = 22;

        for (int num : arr) {
            if (num == checkValue){
                System.out.println("present");
                return;
            }
        }
        System.out.println("not present");


    }
}
