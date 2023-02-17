package br.com.pedro.funcao;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        * Fazer um programa que cadastre produto f
        * A pessoa vai informar a quantidade de produtos/ fzr com array f
        * fzr um metodo para cadastrar os produtos
        * perguntar se a pessoa deseja procurar um produto/ se sim, criar um metodo para procurar um produto
        * enquanto a pesssoa falar q sim, procurar o produto, se nao, encerrar o programa;
        * */

        Scanner teclado = new Scanner(System.in);
        String resposta = "";

        System.out.print("Informe a quantidade de produtos: ");
        int qtdProdutos = teclado.nextInt();

        String[] produtos = new String[qtdProdutos];
        String[] produtoCadastro = cadastrarProduto(produtos, teclado);

        do {
            System.out.print("\nDeseja pesquisar um produto? s/n ");
            resposta = teclado.next();

            if (resposta.equals("s")){
                System.out.print("Informe o nome do produto: ");
                String nomeProduto = teclado.next();

                if (produtoExiste(produtos, nomeProduto)){
                    imprimir(nomeProduto);
                } else {
                    System.out.println("Não existe: "+nomeProduto);
                }
            }

        } while(resposta.equals("s"));

        System.out.println("O programa acabou!!");
    }
    public static String[] cadastrarProduto(String[] produtos, Scanner teclado){

        for (int i = 0; i < produtos.length; i++){
            System.out.print("Informe o nome do produto: ");
            produtos[i] = teclado.next();
        }
        return produtos;
    }

    public static boolean produtoExiste(String[] produtos, String nomeProduto){
        for(int i = 0; i < produtos.length; i++){
            if (nomeProduto.equals(produtos[i])){
                return true;
            }
        }
        return false;
    }

    private static void imprimir(String nomeProduto) {
        System.out.println("O produto: "+nomeProduto+" esta cadastrado!!");
    }


}
