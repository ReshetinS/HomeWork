/*
*
*@Java 1. HomeWork4
*@author Reshetin Aleksandr
*@version 17.12.2021
*
*/

import java.util.Scanner;
import java.util.Random;

class TicTacToe {

    final char SIGN_X = 215; // параметру SING_X задается неизменяемый символ "x"
    final char SIGN_O = 'o'; // параметру SING_О задается неизменяемый символ "о"
    final char SIGN_EMPTY = 183; // параметру SING_EMPTY задается неизменяемый символ "."
    char[][] table;
    Scanner sc;
    Random random;

    public static void main(String[] args) {
        new TicTacToe().game();
    }

    TicTacToe (){ //метод который выполняется первым
        table = new char[3][3];// двумерный массив 3*3
        sc = new Scanner(System.in);
        random = new Random();
    }

    void game() { 
        initTable();
        printTable();
        while (true) {
            turnHuman();
            if (isWin(SIGN_X)) {
                System.out.println("CONGRATULATION! WIN!");
                break;
            }
            if (isTableFull()) {
                System.out.println("SORRY, DRAW..");
                break;
            }
            turnAi();
            printTable();
            if (isWin(SIGN_O)) {
                System.out.println("SORRY, YOU FOOL!");
                break;
            }
            if (isTableFull()) {
                System.out.println("SORRY, DRAW..");
                break;
            }
            printTable();
        }
    }

    void initTable() {
        for (int y = 0; y < table.length; y++) {
            for (int x = 0; x < table.length; x++) {
                table[y][x] = SIGN_EMPTY;
            }
        }
    }

    void printTable() {
        System.out.println(" -----------");
        for (int y = 0; y < table.length; y++) {
            for (int x = 0; x < table.length; x++) {
                if (x == 0) {
                    System.out.print("| " + table[y][x] + " |");
                }
                if (x > 0) {
                    System.out.print(" " + table[y][x] + " |");
                }
            }
            System.out.println();
            System.out.println(" -----------");
        }
    }

    void turnHuman() {
        int x, y;
        do {
            System.out.print("Enter x, y [1..3]: ");
            x = sc.nextInt() - 1;
            y = sc.nextInt() -1;
            } while (!isCellValid(x, y));
        table[y][x] = SIGN_X;
    }

    void turnAi() {
        int x, y;
        do {
            x = random.nextInt(3);
            y = random.nextInt(3);
        } while (!isCellValid(x, y));
        table[y][x] = SIGN_O;
    }

    boolean isCellValid(int x, int y) {
        if (x < 0 || y < 0 || x > 2 || y > 2) {
            return false;
        }
        return table[y][x] == SIGN_EMPTY;
    }

    boolean isWin(char ch) {
        //
        if (table[0][0] == ch && table[0][1] == ch && table[0][2] == ch) return true;
        if (table[1][0] == ch && table[1][1] == ch && table[1][2] == ch) return true;
        if (table[2][0] == ch && table[2][1] == ch && table[2][2] == ch) return true;
        //
        if (table[0][0] == ch && table[1][0] == ch && table[2][0] == ch) return true;
        if (table[0][1] == ch && table[1][1] == ch && table[2][1] == ch) return true;
        if (table[0][2] == ch && table[1][2] == ch && table[2][2] == ch) return true;
        //
        if (table[0][0] == ch && table[1][1] == ch && table[2][2] == ch) return true;
        if (table[2][0] == ch && table[1][1] == ch && table[0][2] == ch) return true;
        //
        return false;
    }

    boolean isTableFull() {
        for (int y = 0; y < table.length; y++) {
            for (int x = 0; x < table.length; x++) {
                if (table[y][x] == SIGN_EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }
}
