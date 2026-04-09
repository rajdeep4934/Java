package com.demo;

import java.util.Scanner;

public class Test2Darrays {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][4];

        Array2DService.acceptData(arr);
        Array2DService.displayData(arr);

        int choice = 0;

        do {
            System.out.println("1.find max\n2.find min\n3.find sum\n4.row sum\n5.column sum");
            System.out.println("6.display\n7.row max\n8.column max\n9.exit");
            System.out.print("Choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1 -> {
                    int max = Array2DService.findMax(arr);
                    System.out.println("Maximum: " + max);
                }

                case 2 -> {
                    int min = Array2DService.findMin(arr);
                    System.out.println("Minimum: " + min);
                }

                case 3 -> {
                    int sum = Array2DService.findSum(arr);
                    System.out.println("Sum: " + sum);
                }

                case 4 -> {
                    int[] sumArr = Array2DService.findRowwise(arr);
                    for (int i = 0; i < sumArr.length; i++) {
                        System.out.println("Row " + i + " sum: " + sumArr[i]);
                    }
                }

                case 5 -> {
                    int[] sumArr = Array2DService.findSumColumnwise(arr);
                    for (int i = 0; i < sumArr.length; i++) {
                        System.out.println("Column " + i + " sum: " + sumArr[i]);
                    }
                }

                case 6 -> {
                    Array2DService.displayData(arr);
                }

                case 7 -> {
                    int[] maxArr = Array2DService.findRowwiseMaximum(arr);
                    for (int i = 0; i < maxArr.length; i++) {
                        System.out.println("Row " + i + " max: " + maxArr[i]);
                    }
                }

                case 8 -> {
                    int[] maxArr = Array2DService.findColumnwiseMaximum(arr);
                    for (int i = 0; i < maxArr.length; i++) {
                        System.out.println("Column " + i + " max: " + maxArr[i]);
                    }
                }

                case 9 -> {
                    sc.close();
                    System.out.println("Thank you!");
                }

                default -> {
                    System.out.println("Wrong choice");
                }
            }

        } while (choice != 9);
    }
}