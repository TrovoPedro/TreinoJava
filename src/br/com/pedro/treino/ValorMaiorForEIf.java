package br.com.pedro.treino;

import java.util.Scanner;

public class ValorMaiorForEIf {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int maior = 0;

        for(int i = 1; i <= 5; i++){

            System.out.print("Digite o valor: ");
            int valor = teclado.nextInt();

            if(valor > maior){
                maior = valor;
            }

        }

        System.out.println("O maior valor é: "+maior);

    }
}
