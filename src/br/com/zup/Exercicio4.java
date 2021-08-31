package br.com.zup;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite a quantidade de números a serem somados: ");
        int quantidadeNumeros = leitor.nextInt();
        double soma = 0;

        for (int contador =1;contador <= quantidadeNumeros; contador += 1){
            System.out.println("Digite o " + contador + " número");
            double numeroLido = leitor.nextDouble();
            soma += numeroLido;
        }

        System.out.println("A soma dos " + quantidadeNumeros + " números digitados é igual a: " + soma);

    }
}
