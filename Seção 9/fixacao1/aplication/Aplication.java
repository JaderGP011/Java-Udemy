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

        double value = 0.0; 
        
        Account user; 

        if (verification.equalsIgnoreCase("y")) {   
            System.out.print("Enter initial deposit there: ");
            value = in.nextDouble();
            user = new Account(nmrConta, nomeTitular, value); 
        } else {
            user = new Account(nmrConta, nomeTitular);
        }

        user.show();
        
        System.out.println("Enter a deposit value:");
        value = in.nextDouble();
        user.deposit(value);
        user.show();

        System.out.println("Enter a withdraw value:");
        value = in.nextDouble();
        user.withdraw(value);
        user.show();
        
        in.close();
    }
}
