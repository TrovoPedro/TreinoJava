package br.com.pedro.collections;

import java.util.HashSet;
import java.util.Set;

public class TreinoSet {
    public static void main(String[] args) {
        Set<String> nomes = new HashSet<>(); //  A classe Set não possui o metodo get só o getClass;

        nomes.add("Pedro");
        nomes.add("Guilherme");
        nomes.add("Fernando");

        System.out.println(nomes);

        nomes.add("Pedro"); //Por ser um Set ele não permite ter elementos repetidos na lista. Mesmo eu tendo adicionado outro "Pedro", ele so vai printar um "Pedro";

        boolean adc = nomes.add("Pedro"); /* adc recebe nomes.add passando Pedro, mas como Pedro ja existe na lista, adc vai ser false, pulando para o else
        o if precisa de uma condição verdadeira ou falsa, por adc ser do tipo boolean, true/false, só passamos a variavel dentro do if;
        */

        if (adc){ // Essa verificação serve para mostrar que o Set não permite elementos iguais na lista;
            System.out.println("Adicionou");
        }else {
            System.out.println("Não adicionou");
        }
    }
}
