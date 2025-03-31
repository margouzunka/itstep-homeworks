package homework3;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) throws java.io.IOException {
        System.out.print("Введите число:");
        int number = new Scanner(System.in).nextInt();
        if (number % 2 == 0) {
            System.out.println("Введенное число " + number + " является четным");
        } else {
            System.out.println("Введенное число " + number + " является нечетным");
        }
    }
}