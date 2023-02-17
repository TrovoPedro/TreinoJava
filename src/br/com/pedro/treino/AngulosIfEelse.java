package br.com.pedro.treino;

import br.com.pedro.funcao.Exercicio1;

import java.util.Scanner;

public class AngulosIfEelse {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("------Calculando angulos do triangulo------");

        int angulos = entradaDeDados(teclado);
        validarTriangulo(angulos);

    }

    public static int entradaDeDados(Scanner teclado){
        int angulos = 0;
        for (int i = 1; i <= 3; i++){
            System.out.println("Informe o valor do angulo: ");
            angulos += teclado.nextInt();
        }
        return angulos;
    }
    public static void validarTriangulo(int angulos){
        if (angulos == 90){
            System.out.println("Triângulo Retângulo: possui um ângulo reto. (igual a 90º)");
        } else if (angulos > 90) {
            System.out.println("Triângulo Obtusângulo: possui um ângulo obtuso. (maior que 90º)");
        }else{
            System.out.println("Triângulo Acutângulo: possui três ângulos agudos. (menor que 90º)");
        }
    }
}
