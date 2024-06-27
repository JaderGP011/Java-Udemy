package fixacao;

import java.util.Locale;
import java.util.Scanner;

public class abaixo_da_media {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int n;
        System.out.println("Quantos elementos vai ter o vetor?");
        n = in.nextInt();
        double[] vetor = new double[n];
        
        double media = 0;
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite um número: ");
            vetor[i] = in.nextDouble();
            media += vetor[i];
        }
        
        media /= n;
        System.out.printf("Média: %.3f\n", media);

        
        System.out.println("Abaixo da media");
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] < media) {
                System.out.println(vetor[i]);
            }
        }
        
        in.close();
    }
}
