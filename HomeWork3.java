/*
*
*@Java 1. HomeWork3
*@author Reshetin Aleksandr
*@version 14.12.2021
*
*/

import java.util.Arrays;
import java.util.Scanner;

public class HomeWork3 {
    public static void main(String[] args) {
        changeNumInArr();
        longArr();
        changeMinNumInArr();
        diagonalTable (15);
        makeTable ();
    }

    static void changeNumInArr () {
        System.out.println();
        System.out.println("Exercise 1");
        System.out.println();
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0, 1};
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == 1) {
                  arr[i] = arr[i] - 1;
                }
                  else arr[i] = arr[i] + 1; {
                }
            }
    System.out.println(Arrays.toString(arr));
    }

    static void longArr () {
        System.out.println();
        System.out.println("Exercise 2");
        System.out.println();
        int[] arr2 = new int[100];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = i + 1;
        }
        System.out.println(Arrays.toString(arr2));
    }

    static void changeMinNumInArr () {
        System.out.println();
        System.out.println("Exercise 3");
        System.out.println();
        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
            for (int i = 0; i < arr3.length; i++) {
                if (arr3[i] < 6) {
                  arr3[i] = arr3[i] * 2;
                }
            }
        System.out.println(Arrays.toString(arr3));
    }

    static void diagonalTable (int q) {
        System.out.println();
        System.out.println("Exercise 4");
        System.out.println();
        int[][] table = new int[q][q];
            for (int i = 0; i < table.length; i++) {
                for (int j = 0; j < table.length; j++) {
                    if (i == j || i + j == q - 1) {
                        table[i][j] = 1;
                    System.out.print(table[i][j] + " ");
                    }
                    else {
                        table[i][j] = 0;
                    System.out.print(table[i][j] + " ");
                    }
                }
            System.out.println();
            }
    }
    static void makeTable () {
        System.out.println();
        System.out.println("Exercise 5");
        System.out.println();
        Scanner scan1 = new Scanner(System.in);
        System.out.print("Enter number (length arrays)");
        int len = scan1.nextInt();
        Scanner scan2 = new Scanner(System.in);
        System.out.print("Enter number (number in arrays)");
        int initialValue = scan2.nextInt();
        int[] arr4 = new int [len];
        for (int i = 0; i < arr4.length; i++) {
            arr4[i] = initialValue;
        }
        System.out.println(Arrays.toString(arr4));
    }
}
