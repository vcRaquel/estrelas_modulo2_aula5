package br.com.zup;

public class ExercicioExtra2 {
    public static void main(String[] args) {
        int contador = 1;
        int qtdImpares = 0;
        int soma = 0;


        while (contador<=100){
            if (contador % 2 != 0){
                soma += contador;
                qtdImpares += 1;
            }
            contador ++;
        }
        System.out.println("A quantidade de números ímpares foi de: " + qtdImpares);
        System.out.println("A soma dos primeiros " + qtdImpares + " números ímpares é igual a: " + soma);
    }
}
