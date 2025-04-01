package org.jmc.mydomain;

import java.util.Arrays;

public class Main {
    public static int diffLargestAndSmallest(int[] arrayInts) {
        if (arrayInts.length == 1) {
            return arrayInts[0];
        } else {
            int largest = arrayInts[0];
            int smallest = arrayInts[0];
            for (int i = 0; i < arrayInts.length; i++) {
                if (largest < arrayInts[i]) {
                    largest = arrayInts[i];
                }
                if (smallest > arrayInts[i]) {
                    smallest = arrayInts[i];
                }
            }

            return largest - smallest;
        }
    }

    public static void printSmallestAndSecondSmallest(int[] arrayInts) {
        if (arrayInts.length == 1) {
            System.out.println(arrayInts[0]);
        } else {
            int smallest = Integer.MAX_VALUE;
            int smallestSecond = Integer.MAX_VALUE;
            for (int i = 0; i < arrayInts.length; i++) {
                if (arrayInts[i] < smallest) {
                    smallestSecond = smallest;
                    smallest = arrayInts[i];
                } else if (arrayInts[i] < smallestSecond && arrayInts[i] != smallest) {
                    smallestSecond = arrayInts[i];
                }

            }

            System.out.println("smallest = " + smallest);
            System.out.println("smallestSecond = " + smallestSecond);
        }
    }

    public static double calculateMathExpression(double x, double y) {
        return Math.pow(x, 2) + Math.pow(((4 * y) / 5) - x, 2);
    }

    public static void main(String[] args) {

        int[] arrayInts = {10, 2, 30, 4, 5};

        System.out.println("Array: " + Arrays.toString(arrayInts));
        System.out.println("---------------------");
        System.out.println(diffLargestAndSmallest(arrayInts));

        System.out.println("---------------------");
        printSmallestAndSecondSmallest(arrayInts);

        System.out.println("---------------------");
        System.out.println(calculateMathExpression(2,2));

    }
}