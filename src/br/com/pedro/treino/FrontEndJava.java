package br.com.pedro.treino;

import javax.swing.*;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.*;

/*
* criando .jar do arquivo, ctrl+shift+alt+s, clicar no +, JAR, segunda opcao, escolher o arquivo,
*
*
* */

public class Main5 {
    public static void main(String[] args) {

        int nome = parseInt(showInputDialog(null,"Digite seu nome: ", "Cadastro de pessoa", INFORMATION_MESSAGE));
        showMessageDialog(null, "Olá "+nome);

        if(showConfirmDialog(null, "CU") == 0){
            showMessageDialog(null, "Ok");
        } else if (showConfirmDialog(null, "CU") == 1) {
            showMessageDialog(null, "Não");
        }else{
            showMessageDialog(null, "Cancelar");

        }

        int valor = parseInt("1");

    }
}
