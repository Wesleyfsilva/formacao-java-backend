package seção4;

public class ProcessamentoDados {
    public static void main(String[] args) {

        //Exemplo 1
        int x;
        double y;

        x = 5;
        y = 2 * x;

        System.out.println(x);
        System.out.println(y);

        //Exemplo 2
        double b, B, h, area;

        b = 6.0;
        B = 8.0;
        h = 5.0;

        area = (b+B) / 2.0 * h;

        System.out.println(area);

        //Exemplo 3

        int a, c;
        double resultado;

        a = 5;
        c = 2;

        //casting: converte para double
        resultado = (double) a / c;

        System.out.println(resultado);

        //exemplo 4

        double z;
        int n;

        z = 5.0;
        n = (int) z;

        System.out.println(n);
    }
}
