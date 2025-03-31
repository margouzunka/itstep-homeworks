package homework2;

import java.io.IOException;

public class Help {
    public static void main(String[] args) throws IOException {
        System.out.println("Cпpaвкa:");
        System.out.println(" 1. if");
        System.out.println(" 2. switch");
        System.out.print("Bыбepитe: ");

        char choice;
        choice = (char) System.in.read();// int -> char

        System.out.println("\n");

        switch (choice) {
            case '1':
                System.out.println("Оператор if:\n");
                System.out.println("if (условие) оператор;");
                System.out.println("else оператор;");
                break;
            case '2':
                System.out.println("Оператор switch:\n");
                System.out.println("switch (выражение) (");
                System.out.println(" case константа:");
                System.out.println(" последовательность операторов");
                System.out.println(" break");
                System.out.println(" // ... ");
                System.out.println("}");
                break;
            default:
                System.out.print("Зaпpoc не найден.");
        }
    }

}
