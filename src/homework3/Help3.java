package homework3;

public class Help3 {
    public static void main(String[] args) throws java.io.IOException {
        char choice, ignore;
        do {
            System.out.println("Cпpaвкa:");
            System.out.println(" 1. if");
            System.out.println(" 2. switch");
            System.out.println(" З. for");
            System.out.println(" 4. while");
            System.out.println(" 5. do-while");
            System.out.println(" 6. break");
            System.out.println(" 7. continue\n");
            System.out.print("Bыбepитe: (q - выход): ");

            choice = (char) System.in.read();

            do {
                ignore = (char) System.in.read();
            } while (ignore != '\n');
        } while ( choice < '1'| choice > '7' & choice != 'q');

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
            case '3':
                System.out.println("Oпepaтop for:\n");
                System.out.print("for(инициaлизaция; условие; итерация)");
                System.out.println(" оператор;");
                break;
            case '4':
                System.out.println("Oпepaтop while:\n");
                System.out.println("while(ycлoвиe) оператор;");
                break;
            case '5':
                System.out.println("Oпepaтop do-while:\n");
                System.out.println("do {");
                System.out.println(" оператор;");
                System.out.println("} while (условие};");
                break;
            case '6':
                System.out.println("Oпepaтop break:\n");
                System.out.println("break; или break метка;");
                break;
            case '7':
                System.out.println("Oпepaтop continue:\n");
                System.out.println("continue; или continue метка;");
                break;
        }
    }
}
