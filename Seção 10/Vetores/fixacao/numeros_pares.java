package fixacao;

import java.util.Scanner;

public class numeros_pares {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Quantos números você vai digitar?");
        int tam = in.nextInt();
        int[] n = new int[tam];
        int[] pares = new int[tam];
        int paresTotal = 0;

        for (int i = 0; i < n.length; i++) {
            System.out.print("Digite um número: ");
            n[i] = in.nextInt();
            if (n[i]%2 == 0) {
                pares[i] = n[i];
                paresTotal++;
            }
        }

        System.out.println("Números Pares:");
        for (int i = 0; i < pares.length; i++) {
            System.out.print(pares[i] + " ");

        }
        System.out.println("\nQuantidade de pares: " + paresTotal);
        in.close();
    }
}
/*Faça um programa que leia N números inteiros e armazene-os em um vetor. Em seguida, mostre na
tela todos os números pares, e também a quantidade de números pares. 
 */

 /*Quantos numeros voce vai digitar? 6
Digite um numero: 8
Digite um numero: 2
Digite um numero: 11
Digite um numero: 14
Digite um numero: 13
Digite um numero: 20
NUMEROS PARES:
8 2 14 20
QUANTIDADE DE PARES = 4 */