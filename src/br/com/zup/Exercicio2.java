package br.com.zup;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int contador = 1;
        int quantidadeDeNumeros;
        int soma =0;
        float verificadorFlutuante;
        int verificadorInteiro;

        System.out.println("Digite a quantidade de números inteiros: ");
        quantidadeDeNumeros = leitor.nextInt();

        for (contador=1; contador <= quantidadeDeNumeros; contador += 1){
            System.out.println("escreva um número: ");
            soma += leitor.nextInt();
        }
        double media = soma/quantidadeDeNumeros;
        System.out.println("a média dos números digitados é: " + media);
    }
}
