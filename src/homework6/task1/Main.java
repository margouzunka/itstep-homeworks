package homework6.task1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static String RATINGS_FILE_PATH = "./src/homework6/task1/ratings.txt";
    public static String RESULT_FILE_PATH = "./src/homework6/task1/ratings_average.txt";

    public static void main(String[] args) throws IOException {
        File ratingsFile = new File(RATINGS_FILE_PATH);
        Scanner scannerFile = new Scanner(ratingsFile);

        double ratingsSum = 0.0;
        int studentsNumber = 0;

        while (scannerFile.hasNextLine()) {
            String line = scannerFile.nextLine();
            int rating = Integer.parseInt(line);
            ratingsSum += rating;
            studentsNumber++;
        }

        double average = ratingsSum / studentsNumber;
        String averageString = String.valueOf(average);

        FileWriter fileWriter = new FileWriter(RESULT_FILE_PATH);
        fileWriter.write(averageString);
        fileWriter.close();
        System.out.println("Результат был записан в файл " + RESULT_FILE_PATH);
    }
}