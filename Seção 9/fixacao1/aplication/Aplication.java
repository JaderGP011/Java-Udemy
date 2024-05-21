package fixacao1.aplication;

import fixacao1.util.Account;
import java.util.Scanner;
import java.util.Locale;

public class Aplication {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        System.out.print("Enter account number: ");
        int nmrConta = in.nextInt();
        System.out.println();
        System.out.print("Enter account holder: ");
        String nomeTitular = in.next();
        System.out.println();
        System.out.print("Is there a initial deposit (y/n)? ");
        String verification = in.next();
        
        double value;
        if (verification.equalsIgnoreCase("y")) {   
            System.out.print("Enter initial deposit there: ");
            value = in.nextDouble();
        } else {
            value = 00;
        }

        Account user = new Account(nmrConta, nomeTitular, value);
        user.deposit(value);
        user.show();
        in.close();
    }
}
