package com.leetcode.statics.util;

public class Util {

    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (arr.length - 1 != i) {
                System.out.print(", ");
            }
        }

        System.out.println();
    }

    public static void printArr(char[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (arr.length - 1 != i) {
                System.out.print(", ");
            }
        }

        System.out.println();
    }

    public static String getPrintedArr(int[] arr) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < arr.length; i++) {
            result.append(arr[i]);
            if (arr.length - 1 != i) {
                result.append(", ");
            }
        }

        return result.toString();
    }

    public static void printPoints(int[][] points) {
        for (int i = 0; i < points.length; i++) {
            System.out.println(points[i][0] + ", " + points[i][1]);
        }
    }

    public static void printArr(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
                if(j != arr[i].length - 1) System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void printArr(char[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
                if(j != arr[i].length - 1) System.out.print(" ");
            }
            System.out.println();
        }
    }
}
