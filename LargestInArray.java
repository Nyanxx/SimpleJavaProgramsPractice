public class LargestInArray {

    public static void main(String[] args) {

        int[] arr = {-544, -877, -4444, -563633, -554};
        int largestNumber = Integer.MIN_VALUE;
//        int largestNumber = 0;


        for (int j : arr) {
            if (j > largestNumber)
                largestNumber = j;
        }
        System.out.println(largestNumber);





    }
}
