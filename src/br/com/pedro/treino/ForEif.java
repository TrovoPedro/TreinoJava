package br.com.pedro.treino;

import java.util.Scanner;

public class ForEif {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        int valor1 = teclado.nextInt();

        System.out.print("Digite o segundo valor: ");
        int valor2 = teclado.nextInt();

        if(valor1 > 0 || valor2 > 0){ //Verificando se os valores sao positivos
            if (valor1 < valor2) { //se os valores forem positivos esse if vai verificar se o primeiro valor é menor que o segundo
                for (; valor1 <= valor2; valor1++) {
                    System.out.println(valor1);
                }
            } else{ //caso o segundo if seja falso ele cairá nesse else
                System.out.println("O segundo valor precisa ser maior que o primeiro!!");
            }
        } else{ //caso o primeiro if seja falso ele cairá nesse else
            System.out.println("Os valores precisam ser positivos!!");
        }
    }
}
