package br.com.pedro.treino;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Teste2 {
    public static void main(String[] args) {

        List<String> alfabetoList = new ArrayList<>();
        alfabetoList.add("A");
        alfabetoList.add("B");
        alfabetoList.add("C");
        alfabetoList.add("B");

        System.out.println(alfabetoList);

        Set<String> alfabetoSet = new HashSet<>(); // O Set não permite ter elementos duplicados; O Set não é indexado (ELe é aleatorio);
        alfabetoSet.add("A");
        alfabetoSet.add("B");
        alfabetoSet.add("C");
        alfabetoSet.add("B");
        alfabetoSet.add("D");
        alfabetoSet.add("E");
        alfabetoSet.add("F");
        alfabetoSet.add("G");
        alfabetoSet.add("H");
        alfabetoSet.add("I");
        alfabetoSet.add("J");
        alfabetoSet.add("K");
        alfabetoSet.add("L");
        alfabetoSet.add("M");
        alfabetoSet.add("N");
        alfabetoSet.add("O");
        alfabetoSet.add("P");


        System.out.println(alfabetoSet);
    }
}
