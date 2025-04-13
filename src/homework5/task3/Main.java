package homework5.task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите кол-во студентов в группе");
        Scanner scanner = new Scanner(System.in);
        int studentsNumber = scanner.nextInt();

        Scanner scannerRating = new Scanner(System.in);
        int[] ratings = new int[studentsNumber];
        int studentNumber = 0;
        do {
            System.out.println("Введите оценку за студента " + (studentNumber + 1));
            int rating = scannerRating.nextInt();
            ratings[studentNumber] = rating;
            studentNumber++;
        } while (studentNumber < ratings.length);

        studentNumber = 0;
        double ratingsSum = 0.0;
        while (studentNumber < ratings.length) {
            ratingsSum += ratings[studentNumber];
            studentNumber++;
        }
        System.out.println("Средний бал по группе " + (ratingsSum / ratings.length));
    }
}
