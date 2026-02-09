package secao5;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double  x;
        System.out.println("Digite um numero");
        x = sc.nextDouble();

        if(x >= 0 && x <= 25){
            System.out.printf("%.2f%n está no intervalo [0,25]", x);
        } else if (x > 25 && x <= 50) {
            System.out.printf("%.2f%n está no intervalo  (25,50]", x);
        } else if (x > 50 && x <= 75) {
            System.out.printf("%.2f%n está no intervalo  (50,75]", x);
        } else if (x > 75 && x <= 100) {
            System.out.printf("%.2f%n está no intervalo  (75,100]", x);
        } else {
            System.out.println("Fora de intervalo");
        }


    }
}
