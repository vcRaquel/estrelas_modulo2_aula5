package br.com.zup;

import java.util.Scanner;

public class ExercicioExtra3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Por favor digite o número a ter o fatorial calculado: ");
        int numeroBase = leitor.nextInt();
        int fatorial = 0;
        int somaFatorial = 0;

        System.out.println("O cálculo de " +numeroBase + "! é:");
        for (int contador = numeroBase;contador >= (numeroBase - (numeroBase -1)) ;contador -=1){
            fatorial = numeroBase * contador;
            somaFatorial += fatorial;
            System.out.println(numeroBase + " * " + contador + " = " + fatorial);
            System.out.println("A soma so fatorial de " + numeroBase + "! é igual a " +somaFatorial);
        }
    }
}
