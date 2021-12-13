/*
*
*@Java 1. HomeWork2
*@author Reshetin Aleksandr
*@version 13.12.2021
*
*/

public class HomeWork2 {
    public static void main(String[] args) {
        System.out.println(isSumInTo10and20(10, 1));
        isPositiveNumber(-4);
        System.out.println(isNegativeNumber(3));
        isMoreString("HomeWork2", 5);
        System.out.println(isHighYear(2400));
    }

    static boolean isSumInTo10and20(int a, int b) {
        return (a + b >= 10 && a + b <=20);
        }

    static void isPositiveNumber(int num) {
        System.out.println("Number is " +(num >= 0 ? "positive" : "negative"));
    }

    static boolean isNegativeNumber(int num) {
        return (num < 0);
    }

    static void isMoreString(String a, int b) {
      for (int i = 0; i < b; i++) {
        System.out.println(a);
      }
    }

    static boolean isHighYear(int y) {
      return ((y % 4 == 0 && y % 100 != 0) || (y % 400 == 0));
    }
    }
