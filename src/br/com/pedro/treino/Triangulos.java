package br.com.pedro.treino;

import java.util.Scanner;

public class Triangulos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int[] valores = new int[3];

        System.out.println("Verificando tipos de triângulos");

        for(int i = 0; i < valores.length; i++){
            System.out.print("Digite o valor: ");
            valores[i] = teclado.nextInt();

            if (valores[i] < 0){
                System.out.println("O valor precisa ser positivo!!");
                i--;
            }
        }

        if (valores[0] == valores[1] && valores[0] == valores[2]){
            System.out.println("É um trângulo Equilatero!!");
        } else if (valores[0] == valores[1] || valores[1] == valores[2] || valores[0] == valores[2]) {
            System.out.println("É um triângulo Isóscele!!");
        }else {
            System.out.println("É um triângulo Escaleno!!");
        }

    }
}