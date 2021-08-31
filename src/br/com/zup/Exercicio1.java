package br.com.zup;

public class Exercicio1 {
    public static void main(String[] args) {
        int contador =0;

        System.out.println("Contando até 100 usando o while: ");
        while (contador <=100){
            System.out.println(contador);
            contador +=1;
        }
        System.out.println( "Agora iremos contar usando o for: ");
        for (int contador2 = 1; (contador2 <= 100); contador2+=1){
            System.out.println(contador2);
        }
    }
}
