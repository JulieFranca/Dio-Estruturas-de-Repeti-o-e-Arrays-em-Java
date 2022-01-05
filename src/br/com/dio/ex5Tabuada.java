package br.com.dio;

import java.util.Scanner;

public class ex5Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numerador;

        System.out.println("Tabuada: ");
        numerador = scan.nextInt();
        System.out.println("tabuada do "+ numerador);
        for(int i=1;i<=10;i++){
            System.out.println("tabuada do " + numerador +" X " + i + "=" +(numerador*i));
        }

    }
}
