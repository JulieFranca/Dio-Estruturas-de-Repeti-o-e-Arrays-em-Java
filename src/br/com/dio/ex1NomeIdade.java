package br.com.dio;


import java.util.Scanner;

public class ex1NomeIdade {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nome;
        int idade;

        while (true){
            System.out.println("Nome: ");
            nome = scan.next();
            if(nome.equals("0"))break;
            System.out.println("Idade: ");
            idade = scan.nextInt();

            System.out.println("Nome: " + nome + " Idade: " + idade);
        }
        System.out.println("Encerrado");
    }
}
