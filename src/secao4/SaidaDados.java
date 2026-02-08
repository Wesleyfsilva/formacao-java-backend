package secao4;

import java.util.Locale;

public class SaidaDados {
    public static void main(String[] args) {

        int y = 28;
        double x = 10.35498;
        System.out.println(y);
        System.out.printf("%.4f%n", x);
        System.out.println("Olá mundo!");
        Locale.setDefault(Locale.US);
        System.out.printf("%.4f%n", x);

        double alt = 1.70;
        String nome = "Wesley";
        System.out.printf("Ola, meu nome é %s e eu tenho %.2f de altura%n ", nome, alt);

        System.out.printf("Resultado = %.2f metros%n", alt);

        String name = "Maria";
        int idade = 31;
        double renda = 4000.0;
        System.out.printf("%s tem %d anos e ganha R$ %.2f reais %n", name, idade, renda);

    }
}

