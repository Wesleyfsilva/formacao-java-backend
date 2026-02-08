package secao5;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a, b;

        a = sc.nextInt();
        b = sc.nextInt();

        if(a % b == 0 || b % a == 0){
            System.out.println("Os numeros são multiplos");
        }
        else {
            System.out.println("Os numeros nao são multiplos");
        }

        sc.close();
    }
}
