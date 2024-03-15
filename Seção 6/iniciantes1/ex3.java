package iniciantes1;
import java.util.*;
public class ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt(), B= sc.nextInt(), C = sc.nextInt(), D = sc.nextInt(), dif = 0;

        dif  = A * B - C * D;
        System.out.println("DIFERENCA = " + dif);
        sc.close();
    }
}
