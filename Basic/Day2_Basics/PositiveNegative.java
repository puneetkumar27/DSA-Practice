//Write a Java program to check whether a number is positive, negative, or zero.
package Basic.Day2_Basics;

import java.util.Scanner;

public class PositiveNegative {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (n > 0) {
            System.out.println("Positive Number");
        } else if (n < 0) {
            System.out.println("Negative Number");
        } else {
            System.out.println("Zero");
        }

        sc.close();
    }
}