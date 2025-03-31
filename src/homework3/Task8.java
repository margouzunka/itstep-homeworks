package homework3;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        System.out.print("Введите число:");
        int number = new Scanner(System.in).nextInt();

        // 10
        // [2, 3, 4, 5, 6, 7, 8, 9, 10]
        //  0, 1, 2, 3, 4, 5, 6, 7, 8

        int[] array = new int[number - 1];
        for (int numberToFill = 2, index = 0; numberToFill <= number; numberToFill++, index++) {
            array[index] = numberToFill;
        }

        System.out.println(number + " is product of: ");

        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                if (array[i] * array[j] == number) {
                    System.out.println(array[i] + " and " + array[j]);
                }
            }
        }
    }
}
