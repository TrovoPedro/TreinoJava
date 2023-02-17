import java.util.Scanner;

public class FluxoControle {

	public static void main(String[] args) {

		int idade = 15;
		
		Scanner teclado = new Scanner (System.in);

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
		else {
			System.out.println("Menoridade");
		}


	}

}
