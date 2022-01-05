package br.com.dio;

import java.util.Scanner;

public class ex4ParEImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int quantidadeNumero;
        int numero;
        int quantidadePares = 0;
        int quandtidadeImpares = 0;


        System.out.println("Quantidade de numeros");
        quantidadeNumero = scan.nextInt();

        int contador=0;
        do{
            System.out.println("numero: ");
            numero = scan.nextInt();

            if(numero % 2 == 0)quantidadePares++;
            else quandtidadeImpares++;

            contador++;
        }while (contador < quantidadeNumero);
        System.out.println("Pares: " + quantidadePares);
        System.out.println("Impares: " + quandtidadeImpares);
    }
}
