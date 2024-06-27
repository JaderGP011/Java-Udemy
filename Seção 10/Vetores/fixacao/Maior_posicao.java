package fixacao;

import java.util.Scanner;

public class Maior_posicao {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Quantos numeros serão digitados");
        int n = in.nextInt(), maiorposicao = 0 ;
        double[] numeros = new double[n];
        for (int i = 0; i < args.length; i++) {
            System.out.print("Digite um número: ");
            numeros[i] = in.nextDouble();
        }
        double maior = numeros[0];

        for (int i=1; i<n; i++) {
	        if (numeros[i] > maior) {
	            maior = numeros[i];
	            maiorposicao = i;
	        }
	    }
		
	    System.out.printf("MAIOR VALOR = %.1f\n", maior);
	    System.out.printf("POSICAO DO MAIOR VALOR = %d\n", maiorposicao);
        in.close();
    }
}
/*Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida, mostrar na tela
o maior número do vetor (supor não haver empates). Mostrar também a posição do maior elemento,
considerando a primeira posição como 0 (zero). 
 */
