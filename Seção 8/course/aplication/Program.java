import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);

        Product product = new Product();
        System.out.println("enter prodct data");
        System.out.print("Name: ");
        product.name = in.nextLine();

        System.out.print("Price: ");
        product.price = in.nextDouble();

        System.out.print("Quantity in stock: ");
        product.quantity = in.nextInt();
        System.out.println();
        System.out.println("Product data: " + product);

        System.out.println();
        System.out.println("Enter the number of products to be added in stock:");
        int quantity = in.nextInt();
        product.addProduct(quantity);

        System.out.println();
        System.err.println("Updated data: " + product);

        System.out.println();
        System.out.println("Enter the number of products to be removed from stock");
        quantity = in.nextInt();
        product.removeProducts(quantity);

        System.out.println();
        System.out.println("Updated data " + product);
        in.close();
    }
    
}