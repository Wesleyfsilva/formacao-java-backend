package secao4;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int A,B,C,D, vezes, vezes1, dif;

        System.out.println("Digite os valores dos produtos: ");
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        D = sc.nextInt();


        vezes = A * B;
        vezes1 = C * D;
        dif = vezes - vezes1;

        System.out.printf("A diferença do produtos é de %d%n", dif);

    }
}
