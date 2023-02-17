package br.com.pedro.treino;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("----- tabuada -----");

        System.out.print("Digite um número que deseja saber a tabuada: ");
        int valor1 = teclado.nextInt();

        System.out.print("Digite o valor maximo para fazer o calculo: ");
        int valor2 = teclado.nextInt();

        if(valor2 >= 0){
            for(int i = 0; i <= valor2; i++){
                System.out.println(valor1+"X"+i+" = "+valor1*i);
            }
        }else{
            System.out.println("O segundo valor precisa ser prositivo!!");
        }

        teclado.close();
    }
}