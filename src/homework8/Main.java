package homework8;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws IOException {
        String string;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите регулярное выражение для фильтрации текста");

        string = scanner.nextLine();
        File inputFile = new File("./src/homework8/input.txt");
        Scanner scannerFile = new Scanner(inputFile);

        Pattern pattern = Pattern.compile(string);

        FileWriter fileWriter = new FileWriter("./src/homework8/output.txt");

        while (scannerFile.hasNextLine()) {
            String line = scannerFile.nextLine();
            Matcher mather = pattern.matcher(line);

            if (mather.find()) {
                fileWriter.write(line + "\n");
            }
        }
        fileWriter.close();
        System.out.println("Результат был записан в файл - ./src/homework8/output.txt");
    }
}
