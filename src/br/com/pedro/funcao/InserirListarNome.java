package br.com.pedro.funcao;

import java.util.ArrayList;
import java.util.Scanner;

public class InserirListarNome {
    public static void main(String[] args) {
        /*
        * Criar um programa que insere nome em uma lista
        * perguntar se a pessoa dejesa inserir ou listar
        *  criar uma funcção para inserir e outra para listar
        * */
        Scanner teclado = new Scanner(System.in);

        ArrayList<String> nomes = new ArrayList<>();
        int opcao = 0;


        do{
            System.out.println("Deseja inserir o nome ou listar? 1 para inserir, 2 para listar e 3 para sair");
            opcao = teclado.nextInt();

            if(opcao == 1){
                inserirNome(teclado, nomes);
            } else if (opcao == 2) {
                listarNomes(nomes);

            } else if (opcao == 3) {
                System.out.println("Encerrando programa!!");
            } else{
                System.out.println("Opção invalida");
            }

        }while (opcao != 3);

    }

    private static void listarNomes(ArrayList<String> nomes) {
        /*for(String n : nomes){

            System.out.println(n);

            if(n.equals("pedro")){
                System.out.println("Entrou no if");
            }
        }*/

        nomes.forEach(n -> {

            System.out.println(n);
        });
        //nomes.forEach(System.out::println);
    }

    public static void inserirNome(Scanner teclado, ArrayList<String> nomes){

        System.out.print("Insira um nome: ");
        nomes.add(teclado.next());

    }
}
