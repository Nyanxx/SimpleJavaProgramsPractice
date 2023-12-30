// Implement a program that calculates the average of three test scores using variables.

import java.util.Scanner;

public class ThreeTestScoreAvg {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int first_test_score, second_test_score, third_test_score;

        System.out.println("Enter below the scores of your test out of 100: ");

        do {
            System.out.print("First Test Score: ");
            first_test_score = scan.nextInt();
        } while (first_test_score < 0 || first_test_score > 100);

        do {
            System.out.print("Second Test Score: ");
            second_test_score = scan.nextInt();
        } while (second_test_score < 0 || second_test_score > 100);

        do {
            System.out.print("Third Test Score: ");
            third_test_score = scan.nextInt();
        } while (third_test_score < 0 || third_test_score > 100);



        System.out.println("Average of your test score is: "  + (first_test_score+second_test_score+third_test_score)/3 );

    }
}
