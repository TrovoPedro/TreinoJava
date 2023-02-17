package br.com.pedro.treino;

import java.util.Scanner;

public class ComprandoMacasIf {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("---menos que 1 duzia R$0,30, 1 duzia R$0,25");
        System.out.println("Informe a quantidade de maçãs que deseja comprar: ");
        int macas = teclado.nextInt();

        if(macas >= 12){
            System.out.print("Valor a pagar é: "+macas*0.25);
        }else{
            System.out.print("O valor a pagar é: "+macas*0.30);
        }
    }
}
