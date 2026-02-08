package secao5;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x;

        x = sc.nextInt();

        if(x < 0){
            System.out.println("O numero é negativo");
        }
        else {
            System.out.println("O numero é positivo");
        }

        sc.close();
    }
}
