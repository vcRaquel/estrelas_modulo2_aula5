package br.com.zup;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double maiorNumero = 0;
        double menorNumero = 0;
        double somaDosNumeros = 0;
        double numeroLido;
        int contador = 1;

        for (contador = 1; contador <= 10; contador += 1) {
            System.out.println("Digite o " + contador + " número: ");
            numeroLido = leitor.nextDouble();
            if (contador == 1) {
                maiorNumero = numeroLido;
                menorNumero = numeroLido;
            } else {
                if (numeroLido <= menorNumero) {
                    menorNumero = numeroLido;
                }
                if (numeroLido >= maiorNumero) {
                    maiorNumero = numeroLido;
                }
            }
        }

        System.out.println("O menor número é: " + menorNumero);
        System.out.println("O maior número é: " + maiorNumero);


    }
}
