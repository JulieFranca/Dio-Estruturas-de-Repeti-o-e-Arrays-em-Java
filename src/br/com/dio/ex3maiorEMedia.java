package br.com.dio;

import java.util.Scanner;

public class ex3maiorEMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero;
        int contador=0;
        int maior=0;
        int soma=0;
        double media;

        do {
            System.out.println("Numero: ");
            numero = scan.nextInt();
            soma = soma + numero;
            System.out.println("Soma numeros: " + soma);
            media = (soma/5);
            System.out.println("Media numeros: " + media);
            if (numero > maior) maior = numero;

            contador = contador+1;

        }while(contador<5);
        System.out.println("Maior numero: " + maior);
    }
}
