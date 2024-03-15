package iniciantes1;
import java.util.Scanner;
public class ex1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int x = in.nextInt();
        int sm = n + x;
        System.out.println("Soma: " + sm);

        in.close();
    }
}