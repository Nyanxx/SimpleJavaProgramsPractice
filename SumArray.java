// Implement a program to find the sum of elements in an array.

public class SumArray {

    public static void main(String[] args) {

        int[] arr = {0, 1, 9, 5, 4};
        int sum = 0;

        // with for_i
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum);

        // sum reset
        sum = 0;
        System.out.println(sum);

        // with for_each (enhanced for loop)
        for (int n :
                arr) {
            sum += n;
        }
        System.out.println(sum);



    }

}
