package br.com.pedro.treino;

import java.util.Scanner;

public class ValidandoSenhaIfElse {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite sua senha: ");
        String senhaDigitada = teclado.next();

        System.out.print("Confirme sua senha: ");
        String senha = teclado.next();

        if(senha.equals(senhaDigitada)){
            System.out.println("Acesso permitido!!");
        }else{
            System.out.println("Acesso negado!!");
        }
    }
}
