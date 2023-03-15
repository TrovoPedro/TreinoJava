package br.com.pedro.funcao;

import java.util.*;

public class Media {
    public static void main(String[] args) {
        /*
        * Criar um programa que receba medias dos alunos
        * 1 para inserir
        * 2 para consultar situação do aluno
        * 3 sair do programa
        * < 5 repetiu > 5 passou
        * */

        Scanner teclado = new Scanner(System.in);

        List<Double> medias = new Vector<>();

        int opcao = 0;

        do{
            System.out.println("O que deseja fazer?\n1. para inserir media\n2. para consultar situação\n3. para fechar o programa");
            opcao = teclado.nextInt();

            verificandoOpcao(teclado, opcao, medias);

        }while (opcao != 3);

    }

    private static void verificandoOpcao(Scanner teclado, int opcao, List<Double> medias) {

        if (opcao == 1){
            inserirmedias(teclado, medias);
        } else if (opcao == 2) {
            situacaoAluno(medias);
        }else if(opcao == 3) {
            System.out.println("Encerrando programa!!");
        }else {
            System.out.println("Opção inválida!!");
        }
    }

    private static void situacaoAluno(List<Double> medias) {

        for(double m : medias){        //for-each o "m" representa o elemento da lista "medias1ss"
            if(m >= 5){
                System.out.println("O aluno passou de ano!!");
            }else {
                System.out.println("O aluno reprovou!!");
            }
        }

    }

    public static void inserirmedias(Scanner teclado, List<Double> medias) {

            System.out.print("Informe sua média: ");
            medias.add(teclado.nextDouble());

    }
}
