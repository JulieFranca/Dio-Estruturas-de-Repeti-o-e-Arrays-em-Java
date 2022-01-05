package br.com.dio;

import java.util.Scanner;

public class ex2Nota {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double nota1,nota2,media;

        System.out.println("Insira a nota1");
        nota1 = scan.nextDouble();

        while(nota1 < 0 | nota1 > 10){
            System.out.println("Nota invalida!"+ "\n"+"Digite novamente");
            System.out.println("Insira a nota1");
            nota1 = scan.nextDouble();

        }

        System.out.println("Insira a nota2");
        nota2 = scan.nextDouble();

        while (nota2 <0 | nota2 > 10){
            System.out.println("Nota invalida!"+ "\n"+"Digite novamente");
            System.out.println("Insira a nota2");
            nota2 = scan.nextDouble();
        }

        media = ((nota1 + nota2) / 2);

        System.out.println("sua média é: " + media);
        if(media <6 ){
            System.out.println("aluno reprovado");
        }else if(media>=6){
            System.out.println("aluno aprovado");
        }else{
            System.out.println("Invalido! refazer novamente");
        }
    }
}
