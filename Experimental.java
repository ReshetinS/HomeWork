import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Experimental {
    public static void main(String[] args) {
        System.out.println(sumOfHalf ()); // выводим результат
    }
    public static boolean sumOfHalf () {
        Scanner scan1 = new Scanner(System.in);
        System.out.print("Введите длину массива ");
        int len = scan1.nextInt();
        Scanner scan2 = new Scanner(System.in);
        System.out.print("Введите максимальное число для ячейки массива ");
        int initialValue = scan2.nextInt() + 1;
        int[] arr = new int[len];
        int sumAll = 0;
        int sumHalf = 0;
        Random rand1 = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand1.nextInt(initialValue);
            sumAll += arr[i];
        }

        System.out.println(Arrays.toString(arr)); //выводим в консоль для красоты

        if (sumAll % 2 == 0) { //если сумма элементов массива делится пополам, то имеет смысл продолжать
            for (int j = 0; j < arr.length; j++) {
                if (sumHalf < sumAll / 2) { //суммируем до числа массива половины общей суммы
                sumHalf += arr[j];
                }
            }
            return (sumHalf == sumAll / 2);
        }
        else {
            return false;
        }
    }
}
