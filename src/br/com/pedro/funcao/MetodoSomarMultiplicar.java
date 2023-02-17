package br.com.pedro.funcao;

import java.util.Scanner;

public class MetodoSomarMultiplicar {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int resultado = 0;

        System.out.print("Informe o primeiro valor: ");
        int valor1 = teclado.nextInt();

        System.out.print("Informe o segundo valor: ");
        int valor2 = teclado.nextInt();

        boolean valorVerificado = valorPositivo(valor1,valor2);

        if(valorVerificado){
            System.out.print("Deseja multiplicar ou somar? m/s ");
            String resposta = teclado.next();

            if(resposta.equals("m")){
                resultado = multiplicar(valor1, valor2);
            } else if (resposta.equals("s")) {
                resultado = somar(valor1, valor2);
            }
            imprimir(resultado);
        }
    }

    public static boolean valorPositivo(int valor1, int valor2){

        if(valor1 > 0 && valor2 > 0){
            return true; //Se os valores forem positivos ele ja sai do metodo aqui, nao faz as linhas debaixo
        }else {
            System.out.println("Os valores precisam ser positivos!!");
            return false;
        }
        /*return false; Esse return esta comentado por que se a primeira condicao for falsa ele sempre entra no else
        entao nao precisa ter esse return no fim desse metodo;*/
    }

    public static int multiplicar(int valor1, int valor2){
        return valor1 * valor2;
    }

    public static int somar(int valor1, int valor2) {
        return valor1 + valor2;
    }

    public static void imprimir(int resultado){
        System.out.print("O resultado é: "+resultado);
    }

}
