package secao5;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int codigo, quantidade;
        double total;

        System.out.println("Digite o código do produto e quantidade:");
        codigo = sc.nextInt();
        quantidade = sc.nextInt();

        if(codigo == 1) {
            total = quantidade * 4.00;
            System.out.printf("O total é %.2f%n", total);
        }
        else if (codigo == 2) {
            total = quantidade * 4.50;
            System.out.printf("O total é %.2f%n", total);
        } else if (codigo == 3) {
            total = quantidade * 5.00;
            System.out.printf("O total é %.2f%n", total);
        } else if (codigo == 4) {
            total = quantidade * 2.00;
            System.out.printf("O total é %.2f%n", total);
        } else if (codigo == 5) {
            total = quantidade * 1.50;
            System.out.printf("O total é %.2f%n", total);
        } else{
            System.out.println("Digite um código valido");
        }


    }
}
