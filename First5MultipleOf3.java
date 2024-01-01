// Implement a program to print the first 5 multiples of 3.

public class First5MultipleOf3 {
    public static void main(String[] args) {

        int head = 1;
        int flag = 0;
        int tillNum = 5;

        do {
            if (head % 3 == 0) {
                System.out.println(head);
                flag++;
            }
            head++;
        } while (flag != tillNum);

    }
}
