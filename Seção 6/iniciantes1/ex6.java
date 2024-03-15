package iniciantes1;

import java.util.Locale;
import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in); 
        double A = sc.nextDouble(), B = sc.nextDouble(), C = sc.nextDouble();
        final double pi = 3.14159;

        // AREA TRIANGULO RETANGULO 
        double triangR = A * C / 2.0;

        // AREA CIRCULO DE RAIO 
        double circulo = C * C * pi;

        // AREA TRAPÉZIO 
        double trap = (A + B) / 2.0 * C;

        // AREA QUADRADO 
        double aQuadrado = B * B;

        // AREA RETANGULO
        double aRetang = A * B;
        
        System.out.printf("TRIANGULO: %.3f", triangR);
        System.out.println("");
        System.out.printf("CIRCULO: %.3f", circulo);
        System.out.println(""); 
        System.out.printf("TRAPEZIO: %.3f", trap);
        System.out.println("");
        System.out.printf("QUADRADO: %.3f", aQuadrado);
        System.out.println(""); 
        System.out.printf("RETANGULO: %.3f", aRetang);
        System.out.println("");
        sc.close();
    }
}
