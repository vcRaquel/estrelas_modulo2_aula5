package br.com.zup;

import java.util.Scanner;

public class ExercicioExtra1 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);


        System.out.println("Digite a quantidade de números a serem consultados: ");
        int quantidadeNumeros = leitor.nextInt();
        System.out.println("Digite um número inteiro: ");
        int numeroLido = leitor.nextInt();

        for (int contador = 1; contador <= quantidadeNumeros; contador += 1) {
            if (numeroLido % (numeroLido + 1) != 0 && numeroLido / numeroLido == 1) {
                System.out.println("O número " + numeroLido + " é um número primo");
            } else {
                System.out.println("O número " + numeroLido + " não é um número primo");
            }
        }

    }
}
