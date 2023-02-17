package br.com.pedro.treino;

import java.util.ArrayList;
import java.util.Scanner;

public class ListImparPar {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();
            for (boolean opcao = true; opcao; ){
            System.out.print("Digite um numero para saber se é impar ou par: ");
            numeros.add(teclado.nextInt());

            System.out.println("deseja digitar mais um número?");
            String resposta = teclado.next();

            if (resposta.equals("nao")){
                opcao = false;
            }
        }

        for(Integer numero : numeros){
            if(numero % 2 == 0){
                System.out.println(numero+" é par");
            }else{
                System.out.println(numero+" é impar");
            }

        }
    }
}
