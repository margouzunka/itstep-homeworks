package homework3;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        System.out.print("Введите первое число:");
        int number1 = new Scanner(System.in).nextInt();
        System.out.print("Введите второе число:");
        int number2 = new Scanner(System.in).nextInt();

        System.out.println("Сумма чисел: " + (number1 + number2));
        System.out.println("Среднее значение: " + ((number1 + number2) / 2));
        if (number1 < number2) {
            System.out.println(number1 + " < " + number2);
        } else if (number1 > number2) {
            System.out.println(number1 + " > " + number2);
        } else  { // не рассписываем else if проверку на равенство, т.к. тут очевидно равно
            System.out.println(number1 + " = " + number2);
        }

    }
}
