package br.com.pedro.funcao;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {

        imprimir();
        int mostrarResultado = multplicar(3,5);
        System.out.println(mostrarResultado);
    }
    public static void imprimir(){
        String texto = "Alguma coisa";

        System.out.println("Olá mundo");
        imprimir2(texto, 8);

    }

    public static void imprimir2(String valor, int numero){
        System.out.println(valor+" "+numero);
    }

    public static int multplicar(int numero1, int numero2) {
        int resultado = numero1 * numero2;
        return resultado;
    }

    public static int gf(){
        return 2;
    }
}
