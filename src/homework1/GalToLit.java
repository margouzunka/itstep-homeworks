package homework1;

import java.io.IOException;
import java.util.Scanner;

public class GalToLit {
    public static void main(String args[]) throws IOException {
        double gallons = new Scanner(System.in).nextDouble();
        double liters;
        liters = gallons * 3.7854;
        System.out.println(gallons + " галлонам соответствует " + liters + " литров");
    }


}
