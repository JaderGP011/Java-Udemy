package fixacao;

import java.util.Locale;
import java.util.Scanner;

public class Alturas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);

        System.out.println("Quantos serão digitados?");
        int tam = in.nextInt();
        
        //Instanciação de vetores
        String[] nome = new String[tam];
        int[] idade = new int[tam];
        double[] altura = new double[tam];
        //Cadastros
        for (int i = 0; i < tam; i++){
            System.out.println("Dados da " + (i+1) + "° pessoa: ");
            System.out.print("Nome: ");
            nome[i] = in.next();
            
            System.out.print("Idade: ");
            idade[i] = in.nextInt();

            System.out.print("Altura: ");
            altura[i] = in.nextDouble();
            System.out.println();
        }
        double alturaMedia = 0, alturaTotal = 0;
        int menores = 0;
        for (int i = 0; i < altura.length; i++) {
            if (idade[i] < 16) {
                menores++;
            }
            alturaTotal = alturaTotal + altura[i];
        }

        alturaMedia = alturaTotal / tam;
        double percMenores = ((double) menores / tam) *100;

        System.out.printf("\nAltura Média: %.2f", alturaMedia);
        System.out.printf("\nPessoas com menos de 16: %.2f%n", percMenores);
        for(int i=0; i<tam; i++) {
	        if (idade[i] < 16) {
	        	System.out.printf("%s\n", nome[i]);
	        }
	    }
        in.close();
    }
}
/*Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na
tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos,
bem como os nomes dessas pessoas caso houver.*/