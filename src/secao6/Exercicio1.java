package secao6;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int tentativaSenha = sc.nextInt();
        int senha = 2002;

        while(tentativaSenha != senha){
            System.out.println("Senha incorreta");
            tentativaSenha = sc.nextInt();
        }

        System.out.println("Acesso permitido");
    }
}
