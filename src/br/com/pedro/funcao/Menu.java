package br.com.pedro.funcao;

import java.util.Scanner;

public class Menu {
    /*
     * Fazer um menu, se a pessoa digitar "1" vai aparecer vsf, 2 vtnc, 3, ela vai ter que digitar um nome
     * se ela digitar 4 vai mostrar tds os nomes escritos e 5 acaba o programa;
     * */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int opcao = 0;
        int contNomes = 0;
        String[] nomes = new String[50];

        do {
            System.out.println("Digite:\n1.\n2.\n3. Inserir um nome\n4. Listar todos os nomes\n5. Encerrar o programa");
            opcao = teclado.nextInt();

            if (opcao == 1) {
                System.out.print("Vai se foder\n");
            } else if (opcao == 2) {
                System.out.print("Vai tomar no cú\n");
            } else if (opcao == 3) {
                contNomes = inserirNome(teclado, contNomes, nomes);
            } else if (opcao == 4) {
                listarNomes(nomes);
            } else if (opcao == 5) {
                System.out.println("cabou");
            } else {
                System.out.println("cu");
            }

        }while (opcao > 0 && opcao < 5);

    }

    public static int inserirNome(Scanner teclado, int i, String[] nomes){
        System.out.print("Insira um nome: ");
        nomes[i] = teclado.next();

        return i = i + 1;
    }

    public static void listarNomes(String[] nomes){
        for (int i = 0; i < nomes.length; i++){
            if (nomes[i] == null){
                break;
            }
            System.out.println(nomes[i]);
        }
    }

}
