import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        List<Employee> list = new ArrayList<>();

        System.out.print("Enter the number of employees: ");
        int n = in.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("Employee #" + i + " data:");
            System.out.print("outsourced? (y/n) ");
            char ch = in.next().charAt(0);
            System.out.print("name: ");
            in.nextLine();
            String name = in.nextLine();
            System.out.print("hours: ");
            int hours = in.nextInt();
            System.out.print("Value per Hour: ");
            double valuePerHour = in.nextDouble();
            if (ch == 'y') {
                System.out.print("Addicional Charge: ");
                double addCharge = in.nextDouble();
                list.add(new OutsoursedEmployee(name, hours, valuePerHour, addCharge));
            }else{
                list.add(new Employee(name, hours, valuePerHour));
            }
        }
        System.out.println();
        System.out.println("Payments: ");
        for (Employee emp : list) {
            System.out.println(emp.getName() + " - $" + String.format("%.2f", emp.payment()));
        }
        in.close();
    }
}
