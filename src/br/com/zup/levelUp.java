package br.com.zup;

import java.util.Scanner;

public class levelUp {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o valor inicial do intervalo: ");
        int valorInicial = leitor.nextInt();
        System.out.println("Digite o valor final do intervalo: ");
        int valorFinal = leitor.nextInt();
        int quantidadeLacos = valorFinal - valorInicial;
        int somaImpar = 0;

        if (valorInicial < valorFinal) {


            for (int contador = valorInicial; contador <= valorFinal; contador += 1) {
                if (contador % 2 != 0) {
                    somaImpar += contador;
                }
            }
            System.out.println("A soma dos números ímpares do intervalo selecionado é igua a " + somaImpar);
        }else {
            System.out.println("Intervalo de valores inválido");
        }
    }
}
