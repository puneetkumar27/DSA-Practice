// Write a Java program to find maximum and minimum elements in an array.

package Basic.Day3_Arrays;

import java.util.Scanner;

public class MaxMinArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int maximum = arr[0];
        int minimum = arr[0];

        for (int i = 1; i < n; i++) {

            if (arr[i] > maximum) {
                maximum = arr[i];
            }

            if (arr[i] < minimum) {
                minimum = arr[i];
            }
        }

        System.out.println("Maximum = " + maximum);
        System.out.println("Minimum = " + minimum);

        sc.close();
    }
}