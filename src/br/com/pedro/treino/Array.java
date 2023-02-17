package br.com.pedro.treino;

import java.util.Locale;

public class Array {
    public static void main(String[] args) {
        String nomesArray[] = new String[5];
        nomesArray[0] = "pedro";
        nomesArray[1] = "guilherme";
        nomesArray[2] = "miguel";
        nomesArray[3] = "fernanda";
        nomesArray[4] = "julia";

        System.out.println("tamanho do array: "+nomesArray.length);

        for(int i = 0; i < nomesArray.length ; i++){
            nomesArray[i] = nomesArray[i] + " trovo";
            System.out.println(nomesArray[i]);

            if(nomesArray[i].equals("miguel trovo")){
                System.out.println("Miguel gay!!");
            }
        }


        /*teste = teste + "trovo";
        teste += "trovo";
        teste = teste.concat("trovo");

        teste = teste.toUpperCase();*/

    }
}
