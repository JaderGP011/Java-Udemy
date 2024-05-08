package ex2.aplication;
import java.util.*;
import entities.*;
import ex2.entities.Employee;
public class program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);
        Employee emp = new Employee();

        System.out.print("Name: ");
        emp.name = in.next();
        System.out.println();
        System.out.print("Gross Salary: ");
        emp.grossSalary = in.nextDouble();
        System.out.println();
        System.out.print("Tax: ");
        emp.tax = in.nextDouble();

        System.out.println("Employee: "+ emp.toString());
        System.out.println();
        System.out.print("Which percentage to increase salary? ");
        double percentage = in.nextDouble();
        emp.increaseSalary(percentage);

        System.out.println();
        System.out.print("Updated data: " + emp.toString());
        in.close();
    }

    
}
