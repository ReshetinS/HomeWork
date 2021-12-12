public class HomeWork1 {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }
    static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
    static void checkSumSign() {
        int a = 10;
        int b = 3;
        System.out.println("Sum is " +(a + b >= 0? "positive" : "negative"));
    }
    static void printColor() {
        int value = -5;
            if (value <= 0) {
                System.out.println("Red");
            }
            if (value > 0 && value <= 100) {
                System.out.println("Yellow");
            }
            if (value > 100) {
                System.out.println("Green");
            }
    }       
    static void compareNumbers() {
        int a = 13;
        int b = 7;
        System.out.println(a >= b? "a >= b" : "a < b");
    }    
}
