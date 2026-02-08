package secao4;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double r, A, pi;
        System.out.println("Digite o valor a ser calculado: ");
        r = sc.nextDouble();
        pi = 3.14159;
        A = pi * (r * r);

        System.out.printf("O calculo do raio de %.2f é %.4f%n", r , A);


    }
}
