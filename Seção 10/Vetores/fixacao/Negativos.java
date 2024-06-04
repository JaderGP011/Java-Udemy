package fixacao;

import java.util.Locale;
import java.util.Scanner;

public class Negativos {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);
        System.out.println("Quantos Números você vai digitar?");
        int tam = in.nextInt(); //tam = Tamanho
        int[] n = new int[tam];
        for (int i = 0; i < n.length; i++) {
            System.out.println("Digite um Número (até 10):");
            n[i] = in.nextInt();
        }
        System.out.println();
        System.out.println("Números negativos:");

        for (int i = 0; i < n.length; i++) {
            if (n[i] <0) {
                System.out.printf("%d\n", n[i]);
            }
        }
        in.close();   
    }
}

// Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros
// e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos. 

