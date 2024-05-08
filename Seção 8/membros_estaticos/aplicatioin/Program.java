package membros_estaticos.aplicatioin;

import java.util.*;

import membros_estaticos.util.CurrencyConverter;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);
        CurrencyConverter converter = new CurrencyConverter();

        System.out.print("What is the dollar price? ");
        converter.dolarPrice = in.nextDouble();

        System.out.println();
        System.out.print("How many dollars will be bought? ");
        converter.amountDollars = in.nextDouble();

        // converter.paidBrl = converter.convertDollar(converter.dolarPrice, converter.amountDollars);

        System.out.println();
        System.out.printf("Amount to be paid in reais: %.2f%n", converter.convertDollar(converter.dolarPrice, converter.amountDollars));

        in.close();
    }
}
