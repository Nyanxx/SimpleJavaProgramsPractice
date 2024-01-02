// Write a program to reverse an array.

public class ReverseArray {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3422, 4, 5};
        int[] revArr = new int[arr.length];

        int count = 0;
        for (int i = arr.length-1; i >= 0  ; i--) {
            revArr[count] = arr[i];
            count++;
        }

        for (int n : revArr) {
            System.out.print(" " + n);
        }

        // todo; improve this program


    }
}
