/*
*
*@Java 1. HomeWork7
*@author Reshetin Aleksandr
*@version 30.12.2021
*
*/
import java.util.Arrays;
import java.util.Scanner;

class HomeWork7 {
    public static void main(String[] args) {

        Cat[] cats = {
                new Cat("Alise", 200), new Cat("Barsic", 180), new Cat("Felix", 220)
        };
        int x;
        System.out.println("Give the cats food:");
        Scanner scan = new Scanner(System.in);
        x = scan.nextInt();
        Plate plate = new Plate(600, x);
        System.out.println(plate);

        for (Cat cat : cats) {
            cat.eat(plate);
            System.out.println(cat);
        }

        System.out.println(plate);
        int y;
        System.out.println("How much feed to add? Input:");
        Scanner scan2 = new Scanner(System.in);
        y = scan2.nextInt();
        plate.add(y);
        System.out.println(plate);

        for (Cat cat : cats) {
            cat.setFullness(false);
            cat.eat(plate);
            System.out.println(cat);
        }
        System.out.println(plate);
    }
}

class Cat {
    private String name;
    private int appetite;
    private boolean fullness;

    Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        fullness = false;
    }

    void setFullness(boolean status) {
        fullness = status;
    }

    void eat(Plate plate) {
        if (!fullness) {
            fullness = plate.decreaseFood(appetite);
        }
    }

    @Override
    public String toString() {
        String full;
        if (fullness == true) {
          full = "are full";
        } else {
          full = "are hungry";
        }
        return "Cat " + name + ", with appetite " +
                appetite + " gr " + full;
    }
}

class Plate {
    private int volume;
    private int food;

    Plate(int volume, int food) {
        this.volume = volume;
        this.food = food;
    }

    boolean decreaseFood(int portion) {
        if (food < portion) {
            return false;
        }
        food -= portion;
        return true;
    }

    void add(int food) {
        if (this.food + food <= volume) {
            this.food += food;
        }
    }

    @Override
    public String toString() {
        return "plate: " + food;
    }
}
