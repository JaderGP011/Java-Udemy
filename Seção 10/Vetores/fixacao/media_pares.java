package fixacao;

import java.util.Locale;
import java.util.Scanner;

public class media_pares {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Quantos elementos vai ter o vetor?");
        int n = in.nextInt(); //numero de termos

        int[] vetor = new int[n];
        int mediaDePares = 0, qntdPares = 0;

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite um número: ");
            vetor[i] = in.nextInt();
            if (vetor[i] % 2 == 0) {
                mediaDePares += vetor[i];
                qntdPares++;
            }
        }
        if (qntdPares == 0) {
            System.out.println("NENHUM NÚMERO PAR!");
        }else {
            mediaDePares /= qntdPares;
            System.out.printf("Média dos pares = %d\n", mediaDePares);
        }

        in.close();
    }
}
/*
 * Fazer um programa para ler um vetor de N números inteiros. Em seguida,
 * mostrar na tela a média
 * aritmética somente dos números pares lidos, com uma casa decimal. Se nenhum
 * número par for
 * digitado, mostrar a mensagem "NENHUM NUMERO PAR"
 */
