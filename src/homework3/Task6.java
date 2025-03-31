package homework3;
public class Task6 {
    public static void main(String[] args) throws java.io.IOException {
        System.out.println("Выберите язык приветствия (цифру):");
        System.out.println("1 - русский");
        System.out.println("2 - английский");
        System.out.println("3 - румынский");
        System.out.println("4 - турецкий");

        char choice;
        choice = (char) System.in.read();

        switch (choice) {
            case '1':
                System.out.println("Здравствуйте!");
                break;
            case '2':
                System.out.println("Hello");
                break;
            case '3':
                System.out.println("Buna ziua");
                break;
            case '4':
                System.out.println("Merhaba");
                break;
        }
    }
}
