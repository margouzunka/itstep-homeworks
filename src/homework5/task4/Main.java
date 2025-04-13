package homework5.task4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scannerSum = new Scanner(System.in);

        Scanner scannerContinue = new Scanner(System.in);

//        System.out.println("Введите кол-во товаров");
//        int productsNumber = scanner.nextInt();
//
//        int[] products = new int[productsNumber];
//        int productNumber = 0;
//        while (productNumber < products.length) {
//            System.out.println("Введите стоимость товара " + (productNumber + 1));
//            products[productNumber] = scanner.nextInt();
//            productNumber++;
//        }

        int checkSum = 0;
        double totalSum = 0;
        while (true) {
            System.out.println("Введите стоимость товара");
            checkSum += scannerSum.nextInt();

            System.out.println("Есть еще товары? (да/нет)");
            String answerToContinue = scannerContinue.nextLine();
            if (answerToContinue.equals("да")) {
                continue;
            }

            if (checkSum > 1000) {
                double discount = calculateDiscount(checkSum);
                totalSum = checkSum - discount;
                System.out.println("Поздравляем вы сэкономили " + discount + "$");
                break;
            } else {
                totalSum = checkSum;
                System.out.println("Потратьте еще " + (1001 - checkSum) + "$ чтобы получить скидку. Желаете взять еще товаров? (да/нет)");
                answerToContinue = scannerContinue.nextLine();
                if (answerToContinue.equals("нет")) {
                    break;
                }
            }
        }

        System.out.println("Сумма к оплате " + totalSum + "$");
    }

    public static double calculateDiscount(int sum) {
        if (sum <= 10000) {
            return sum * 0.1;
        } else {
            return sum * 0.2;
        }
    }
}
