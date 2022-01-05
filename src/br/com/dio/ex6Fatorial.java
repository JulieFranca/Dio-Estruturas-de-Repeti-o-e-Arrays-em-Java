package br.com.dio;

import java.util.Scanner;

public class ex6Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("fatorial: ");
        int numero = scan.nextInt();

        int multiplicacao =1;

        for(int i = numero ;i >= 1 ; i-- ){
            multiplicacao = multiplicacao *i;

            System.out.println("fatorial do " + numero + "!=" + multiplicacao);

        }

    }
}
