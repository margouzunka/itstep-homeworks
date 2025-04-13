package homework5.task1;

import java.util.Scanner;

public class Main {

    public static int RETIREMENT_AGE_MALE = 70;
    public static int RETIREMENT_AGE_FEMALE = 65;

    public static void main(String[] args) throws Exception {
        Scanner scannerAge = new Scanner(System.in);
        System.out.println("Введите возраст");
        int age = scannerAge.nextInt();
        Scanner scannerSex = new Scanner(System.in);
        System.out.println("Введите пол (м - мужской, ж - женский)");
        String sex = scannerSex.nextLine();

        int retirementAge;
        if (sex.equals("ж")) {
            retirementAge = RETIREMENT_AGE_FEMALE;
        } else if (sex.equals("м")) {
            retirementAge = RETIREMENT_AGE_MALE;
        } else {
            throw new IllegalArgumentException("Введен неверный пол");
        }

        calculate(age, retirementAge);

    }

    public static void calculate(int age, int retirementAge) {
        if (age > retirementAge) {
            System.out.println("Человек уже " + (age - retirementAge) + " лет как на пенсии");
        } else if (age < retirementAge) {
            System.out.println("До выхода на пенсию осталось " + (retirementAge - age) + " лет");
        } else {
            System.out.println("Человек только что вышел на пенсию");
        }
    }

}
