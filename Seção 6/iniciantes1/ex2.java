package iniciantes1;
import java.util.Scanner;
public class ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final double pi = 3.14159;
        double raio = sc.nextDouble();
        
        double area = pi * raio * raio;

        System.out.printf("A=%.4f", area);
        sc.close();
    }
}
