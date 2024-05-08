package aplication;
import java.util.*;
import entities.Student;

public class Program {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Student student = new Student();
        Locale.setDefault(Locale.US);

        System.out.print("Hi! Whats your name? ");
        student.name = in.next();
        System.out.println();
        for (int i = 0; i <= 2; i++) {
            System.out.println("Give your " + (i+1) + "° note:");
            student.mark[i] = in.nextDouble();
        }
        
        System.err.printf("Final grade: %.2f Points\n", student.grade());
        if (student.grade() < 60) {
            System.out.println("Failed");
            System.out.printf("Missing %.2f points\n", student.missingPoint());
        }else { 
            System.out.println("Pass");
        }

        in.close();
    }
}