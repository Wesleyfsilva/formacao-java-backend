package secao5;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double salario, imposto, dif;

        System.out.println("Digite o salario:");
        salario = sc.nextDouble();

        if(salario >= 0.00 && salario <= 2000.00){
            System.out.println("A pessoa esta isenta de imposto");
        } else if (salario < 3000.00) {
            imposto = (salario - 2000) * 0.8 / 100;
            System.out.printf("O imposto a pagar é de %.2f%n", imposto);
        }
    }
}
