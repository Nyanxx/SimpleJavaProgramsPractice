// Develop a program to calculate the average of numbers in an array.

public class AvgArray {
    public static void main(String[] args) {

        int[] arr = {11, 11, 22, 22, 10};
        int sum = 0;
        double avg;

        for (int num :
                arr) {
            sum += num;
        }
        avg = (double) sum / arr.length;
        System.out.println(avg);



    }
}
