package fixacao;

import java.util.Locale;
import java.util.Scanner;

public class soma_vetores {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Quamtos valores vai ter cada vetor?");
        int tam = in.nextInt();

        int[] vectA = new int[tam];
        int[] vectB = new int[tam];
        int[] vectC = new int[tam];

        System.out.println("digite os valores do vetor A: ");
        for (int i = 0; i < vectA.length; i++) {
            vectA[i] = in.nextInt();
        }
        System.out.println("digite os valores do vetor B: ");
        for (int i = 0; i < vectB.length; i++) {
            vectB[i] = in.nextInt();
        }

        System.out.println("Valor resultante: ");
        for (int i = 0; i < vectC.length; i++) {
            vectC[i] = vectA[i] + vectB[i];
            System.out.println(vectC[i]);
        }
        
        in.close();
    }
}
