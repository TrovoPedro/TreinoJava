package br.com.pedro.treino;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Teste {
    public static void main(String[] args) {

        String[] nomesVetor = {"Pedro","Guilherme","Fernando"};

        ArrayList<String> alfabeto = new ArrayList<>(); // <> chamado como operador diamante
        alfabeto.add("a");
        alfabeto.add("b");
        alfabeto.add("c");

        nomesVetor[0] = "cu";
        nomesVetor[1] = "cu";
        nomesVetor[2] = "cu";


        for (int i = nomesVetor.length - 1; i >= 0; i--){ // nomesVetor.length - 1 pega o tamanho do vetor que nesse caso é 3 e subtrai 1, então o for começa do elemento 2;
            System.out.println(nomesVetor[i]);
        }

        System.out.println(alfabeto);

        Collections.reverse(alfabeto);
        System.out.println((alfabeto));

    }
}
