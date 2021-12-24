/*
*
*@Java 1. HomeWork6
*@author Reshetin Aleksandr
*@version 24.12.2021
*
*/

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

class HomeWork6 {

    public static void main(String[] args) {

        int x, y;
        System.out.print("Input distance (m) run and swim for animals (answer: 155 25): ");
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        y = sc.nextInt();

        int v, w;
        Random rand =new Random();
        v = rand.nextInt(1500);
        w = rand.nextInt(50);

        Cat cat = new Cat(200, 0);
        Dog dog = new Dog(500, 10);
        Rabbit rabbit = new Rabbit(1000, 5);
        Horse horse = new Horse(2000, 500);
        IAnimal[] animals = {cat, dog, rabbit, horse};
        for (IAnimal a : animals) {
            System.out.println(a);
            System.out.println(a.run(x));
            System.out.println(a.run(v));
            System.out.println(a.swim(y));
            System.out.println(a.swim(w));
        }
        System.out.println("Summary all animals: " + Animal.sumAnimals());
    }
}

interface IAnimal {
    String run(int distance);
    String swim(int distance);
}

class Cat extends Animal {
    Cat(int runLimit, int swimLimit) {
        super(runLimit, swimLimit);
    }

    @Override
    public String swim(int distance) {
        return getClassName() + " can't swim";
    }
}

class Dog extends Animal {
    Dog(int runLimit, int swimLimit) {
        super(runLimit, swimLimit);
    }
}

class Rabbit extends Animal {
    Rabbit(int runLimit, int swimLimit) {
        super(runLimit, swimLimit);
    }
}

class Horse extends Animal {
    Horse(int runLimit, int swimLimit) {
        super(runLimit, swimLimit);
    }
}

abstract class Animal implements IAnimal {
    private int runLimit;
    private int swimLimit;
    private String className;
    private static int sumAnimals = 0;

    Animal(int runLimit, int swimLimit) {
        this.runLimit = runLimit;
        this.swimLimit = swimLimit;
        className = getClass().getSimpleName();
        sumAnimals++;
    }

    public String getClassName() {
        return className;
    }

    public static int sumAnimals() {
        return sumAnimals;
    }

    @Override
    public String run(int distance) {
        if (distance <= runLimit) {
            return className + " will run " + distance;
        } else {
            return className + " will not run " + distance;
        }
    }

    @Override
    public String swim(int distance) {
        if (distance <= swimLimit) {
            return className + " will swim " + distance;
        } else {
            return className + " will not swim " + distance;
        }
    }

    @Override
    public String toString() {
        return className + ": run limit " + runLimit + " m, swim limit " + swimLimit + "m.";
    }
}
