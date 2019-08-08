/*
 * This is a problem on Hackerrank.com, solved by Teena Xiong
 */
package currencyformatter;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author teena
 */
public class CurrencyFormatter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number. It will be formatted to a differenct currency");

        while (!scanner.hasNextDouble()) {
            System.out.println("\nThat is not a number. Please enter a number.");
            scanner.next();
        }
        double payment = scanner.nextDouble();
        scanner.close();

        //Indian does not have Locale. Must write one:
        Locale indiaLocale = new Locale("en", "IN");
        NumberFormat indiaNF = NumberFormat.getCurrencyInstance(indiaLocale);
        NumberFormat chinaNF = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat usNF = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat franceNF = NumberFormat.getCurrencyInstance(Locale.FRANCE);

        String us = usNF.format(payment);
        String india = indiaNF.format(payment);
        String china = chinaNF.format(payment);
        String france = franceNF.format(payment);

        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }

}
