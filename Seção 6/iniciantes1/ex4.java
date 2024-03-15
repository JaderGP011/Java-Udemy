package iniciantes1;
import java.util.Scanner;
public class ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int nFunc = sc.nextInt(), horas = sc.nextInt();
        double vHrs = sc.nextDouble(), sl = 0.0;
        
        sl = horas * vHrs;

        System.out.println("NUMBER = " + nFunc);
        System.out.printf("SALARY = %.2f", sl);
        sc.close();
    }
}
