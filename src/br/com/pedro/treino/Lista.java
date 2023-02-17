package br.com.pedro.treino;

import java.util.ArrayList;

public class Lista {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("pedro");
        nomes.add("guilherme");
        nomes.add("julia");
        nomes.add("miguel");
        nomes.add("fernanda");

        for(String n : nomes){

            System.out.println(n +" trovo");
        }
        System.out.println(nomes.contains("miguel"));

    }
}
