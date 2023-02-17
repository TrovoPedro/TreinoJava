package br.com.pedro.funcao;

public class Escopo {

    public static void main(String[] args) {
        String nome = "pedro";
        //int valor = 6; nao da pra criar uma variavel com o msm nome dentro do escopo da funcao main;
        escopo(nome);
    }
    public static void escopo(String nomeMain){
        String nome = "gui";

        System.out.println("Valor da variavel nome do metodo main: "+nomeMain);
        System.out.println("Valor da variavel nome do metodo escopo: "+nome);
    }
}
