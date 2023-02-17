package br.com.pedro.funcao;

import java.util.Scanner;

public class FuncaoMedia {
    public static void main(String[] args) {
        /*Fazer um programa com entrada de dados/ perguntar quantas notas sao
        guardar a entrada dentro de um array e o array tera o tamanho que a pessoa digitar
        calcular as medias dos valores
        verificar, <= 4 repete, entre 5 e 6 recuperacao e >= 7 passou
        usar duas funcoes no programa*/

        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe a quantidade de notas: ");
        int qtdNotas = teclado.nextInt();

        double[] notas = new double[qtdNotas];

        for (int i = 0; i < notas.length; i++) {
            System.out.print("Informe as notas: ");
            notas[i] = teclado.nextDouble();
        }
        double resultadoMedia = calcularMedia(notas);
        imprimir(resultadoMedia);
    }

    public static double calcularMedia(double[] notas){

        double media = 0;

        for (int i = 0; i < notas.length; i++){
            media += notas[i];
        }
        return media / notas.length;
    }
    public static void imprimir(double resultadoNotas){
        if(resultadoNotas >= 6){
            System.out.println("Média: "+resultadoNotas+" você passou de ano!!");
        } else if (resultadoNotas >= 4 && resultadoNotas <= 5.9) {
            System.out.println("Média: "+resultadoNotas+" você ficou de recuperação!!");
        }else {
            System.out.println("Média: "+resultadoNotas+" você repetiu de ano!!");
        }
    }
}
