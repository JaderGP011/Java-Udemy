package aplication;
import java.util.Scanner;
import entities.Rectangle;
public class program {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Rectangle rectangle = new Rectangle();

        System.out.println("Enter rectangle width and height:");
        rectangle.width = in.nextDouble();
        rectangle.height = in.nextDouble();

        System.out.printf("AREA: %.2f%n", rectangle.area());
        System.out.printf("PERIMETER: %.2f%n", rectangle.perimeter());
        System.out.printf("DIAGONAL: %.2f%n", rectangle.diagonal());
        
        in.close();
    }
    
}