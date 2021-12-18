import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Experimental2 {
    public static void main(String[] args) {
        changeArr (); // выводим результат
    }
    public static void changeArr () {
        Scanner scan1 = new Scanner(System.in);
        System.out.print("Введите длину массива ");
        int len = scan1.nextInt();
        Scanner scan2 = new Scanner(System.in);
        System.out.print("Введите число для для сдвига ячеек массива ");
        int initialValue = scan2.nextInt();
        int[] arr = new int[len];
        Random rand1 = new Random();
        int[] arr2 = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand1.nextInt(10);
        }
        System.out.println(Arrays.toString(arr)); //выводим в консоль для красоты

    }
}
