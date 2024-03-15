package iniciantes1;
import java.util.Scanner;
public class ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pc1 = 0, nPc1 = 0, pc2 = 0, nPc2 = 0;
        double valor =0, unt1 = 0, unt2 = 0;

        pc1 = sc.nextInt();
        nPc1 = sc.nextInt();
        unt1 = sc.nextDouble();
        pc2 = sc.nextInt();
        nPc2 = sc.nextInt();
        unt2 = sc.nextDouble();
        
        valor = (nPc1  * unt1) + (nPc2 * unt2);

        System.out.printf("VALOR TOTAL A PAGAR: R$ %.2f", valor);
        System.out.print("");
        sc.close();
    }
}
