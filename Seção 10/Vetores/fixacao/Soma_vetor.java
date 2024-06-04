package fixacao;

import java.util.Locale;
import java.util.Scanner;

public class Soma_vetor {
    public static <vai> void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);
        System.out.println("Quantos números vai digitar?");
        int tam = in.nextInt();
        double[] n = new double[tam];
        for (int i = 0; i < n.length; i++) {
            System.out.println("Digite um número: ");
            n[i] = in.nextDouble();
        }

        System.out.println();
        System.out.print("Valores: ");

        double sum = 0;
        for (int i = 0; i < n.length; i++) {
            System.out.printf("%.2f ", n[i]);
            sum += n[i];
        }
        double avg = sum / n.length;
        System.out.println();
        System.out.println("Soma: " + sum);
        System.out.println("Média: " + avg);

        in.close();
    }
}
/*Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
- Imprimir todos os elementos do vetor
- Mostrar na tela a soma e a média dos elementos do vetor */