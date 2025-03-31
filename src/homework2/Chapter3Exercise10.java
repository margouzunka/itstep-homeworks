package homework2;

public class Chapter3Exercise10 {
    public static void main(String args[]) throws java.io.IOException {

        char ch;
        int transforms = 0;
        for (; ;) {
            ch = (char) System.in.read();
            if (ch == '.') {
                break;
            }
            if (ch >= 'a' && ch <= 'z') {
                ch -= 32;
                transforms++;
                System.out.println("Преобразованный символ: " + ch );
            } else if (ch >= 'A' && ch <= 'Z') {
                ch += 32;
                transforms++;
                System.out.println("Преобразованный символ: " + ch );
            }

        }
        System.out.println("Количество преобразований символов: " + transforms);
    }
}
