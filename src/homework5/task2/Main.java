package homework5.task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите кол-во набранных баллов");
        int points = scanner.nextInt();
        if (points >= 90) {
            System.out.println("Grade - A");
        } else if (points >= 80) {
            System.out.println("Grade - B");
        } else if (points >= 70) {
            System.out.println("Grade - C");
        } else if (points >= 60) {
            System.out.println("Grade - D");
        } else {
            System.out.println("Grade - F");
        }
    }
}
