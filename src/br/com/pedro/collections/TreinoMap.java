package br.com.pedro.collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class TreinoMap {
    public static void main(String[] args) {
        Map<Integer, String> mapa = new LinkedHashMap<>(); /* O Map nao aceita tipos primitivos;
        O Map é muito bom para acesso rapido a objetos;
        */

        mapa.put(1, "Pedro"); //O HashMap precisa de uma chave, igual um id, e um valor; O put é igual o .add do Set e do List;
        mapa.put(1, "Guilherme"); //O HashMap nao permite ter dois elementos com a msm key, mas permitem ter o msm conteudo;
        mapa.put(2, "Pedro");

        //System.out.println(mapa.get(1)); //No Map em vez de passar o indice, passamos a key/chave,
        //System.out.println(mapa.get(2));

        for(int i = 1; i <= mapa.size(); i++){
            System.out.println(mapa.get(i));
        }
    }
}
