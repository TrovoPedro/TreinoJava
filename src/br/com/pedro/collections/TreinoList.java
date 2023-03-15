package br.com.pedro.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TreinoList {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();

        nomes.add("Pedro"); //.add serve para adicionar elementos a lista;
        nomes.add("Guilherme");
        nomes.add("Fernando");

        String pegandoNome = nomes.get(0); // .get resgata o elemento da posição que vc determinar;
        System.out.println(pegandoNome);

        nomes.remove(1); // .remove remove o elemento determinado;
        System.out.println(nomes); // printando sem o elemento de indice 1 da lista;

        for(int i = 0; i < nomes.size(); i++){ // O i serve para percorrer a lista enquanto a condição for verdadeira;
            System.out.println(nomes.get(i));
        }

        nomes.forEach(nome -> System.out.println(nome)); //forEach percorre a lista, a variavel "nome" re


        nomes.add("Pedro");
        System.out.println(nomes); // Por ser um ArrayList ele permite ter elementos repetidos;


        }
}
