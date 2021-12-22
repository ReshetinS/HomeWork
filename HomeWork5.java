/*
*
*@Java 1. HomeWork5
*@author Reshetin Aleksandr
*@version 21.12.2021
*
*/

class HomeWork5 {
    public static void main(String[] args) {
        Persons[] persArray = new Persons[5];
        System.out.println("HomeWork5 part number 1. Just output persons with info.");
        System.out.println();
        persArray[0] = new Persons("Ivanov Petr Ivanovich", "Engineer", "petr@mail.ru", "+7(999)999-66-99", 3000, 49);
        System.out.println(persArray[0]);
        persArray[1] = new Persons("Ivanov Boris Ivanovich", "Engineer", "boris@seznam.cz", "+7(999)895-34-36", 3000, 48);
        System.out.println(persArray[1]);
        persArray[2] = new Persons("Petrov Nikolay Dmitrievich", "Helper", "petr@mail.ru", "8(800)555-35-35", 5000, 29);
        System.out.println(persArray[2]);
        persArray[3] = new Persons("Romashkin Danil Olegovich", "Disigner", "romashka7@gmail.com", "+7(999)555-35-35", 6000, 39);
        System.out.println(persArray[3]);
        persArray[4] = new Persons("Filatova Maria Vladimirovna", "HR-manager", "hr@global.ru", "+7(999)555-35-35", 1000, 25);
        System.out.println(persArray[4]);

        System.out.println();
        System.out.println("HomeWork5 part number 2. Output person with age more than 40.");
        System.out.println();
        for (int i = 0; i < 5; i++) {
            if (persArray[i].getAge() >= 40) {
                  System.out.println(persArray[i]);
            }
        }
    }
}

class Persons {
    private String fullName;
    private String proffesion;
    private String email;
    private String telephone;
    private int salary;
    private int age;

    Persons(String fullName, String proffesion, String email, String telephone, int salary, int age) {
        this.fullName = fullName;
        this.proffesion = proffesion;
        this.email = email;
        this.telephone = telephone;
        this.salary = salary;
        this.age = age;
    }

    Persons() {

    }

    public int getAge () {
        return age;
    }

    public String toString() {
        return fullName + ", " + proffesion + ", " + email + ", " + telephone + ", " + salary + ", " + age;
    }
}
