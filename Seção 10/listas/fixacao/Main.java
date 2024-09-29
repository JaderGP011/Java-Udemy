package fixacao;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<Funcionario> funcionario = new ArrayList<>();
        
        System.out.print("How many employees will be registred? ");
        int n = in.nextInt();
        Integer id;
        Double salary;
        for (int i = 0; i < n; i++) {
            System.out.println("Employee #" + (i+1) + ":");
            System.out.print("ID: ");
            id = in.nextInt();
            System.out.print("Salary: ");
            salary = in.nextDouble();
            System.out.print("Enter the employee id that will have salary increase: ");
        }
        
    }
}
