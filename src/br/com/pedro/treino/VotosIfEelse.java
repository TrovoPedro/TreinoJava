package br.com.pedro.treino;

import java.util.Scanner;

public class VotosIfEelse {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe a data do seu nascimento: ");
        int nascimento = teclado.nextInt();

        if(nascimento <= 2005){
            System.out.println("Você poderá votar esse ano!!");
        }else {
            System.out.println("Você so poderá votar ano que vem!!");
        }
    }
}
