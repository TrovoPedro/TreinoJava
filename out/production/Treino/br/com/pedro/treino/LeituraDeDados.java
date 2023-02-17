import java.util.Scanner;

public class LeituraDeDados {

	public static void main(String[] args) {

		int idade = 15;

		Scanner teclado = new Scanner (System.in);
		System.out.print("Informe seu nome: ");
		String nome = teclado.nextLine();
		
		System.out.print("Informe sua idade: ");
		idade = teclado.nextInt();

		if(idade < 0)
			System.out.println("Idade invalida");

		if(idade >= 18 && idade < 70) {
			System.out.println("Maioridade");	
		} else if(idade >=70){
			System.out.println("Terceira idade");
		}
		if(idade >= 100) {
			System.out.println("Centenaria");
		}

	}

}
