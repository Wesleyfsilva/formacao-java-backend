package secao4;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int numero;
        double horas, salario, valHora;

        numero = sc.nextInt();
        horas = sc.nextDouble();
        valHora = sc.nextDouble();
        salario = horas * valHora;

        System.out.printf("NUMBER %d%n SALARY %.2f%n", numero, salario);

    }
}
