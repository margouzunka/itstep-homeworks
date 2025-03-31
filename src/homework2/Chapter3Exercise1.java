package homework2;

import java.io.IOException;

public class Chapter3Exercise1 {
    public static void main(String[] args) throws IOException {
        int i;
        int spacesNum = 0;
        System.out.println("Для остановки введите символ точки" + " '.' ");
        for (i = System.in.read();  i != '.'; i = System.in.read()) {
            if (i == ' ') {
                spacesNum++;
            }
        }
        System.out.println("Пробелов: " + spacesNum);
    }

}


