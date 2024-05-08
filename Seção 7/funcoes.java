import java.util.Scanner;
// SINTAXE DE FUNÇÕES   
public class funcoes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter three numbers: ");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        int higher = max(a, b, c);
        showResult(higher);
        in.close();
    }

    public static int max(int x, int y, int z) {
        int aux;
        if (x > y && x > z) {
            aux = x;
        }else if (y > z) {
            aux = y;
        } else {
            aux = z;
        }
        return aux;
    }
    public static void showResult(int value) {
        System.out.println("Higher: " + value);
    }
}
