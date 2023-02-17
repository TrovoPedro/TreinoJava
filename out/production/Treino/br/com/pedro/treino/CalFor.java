import java.util.Scanner;

public class CalFor {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int valor1 = 0, valor2 = 0, resultado = 0;
		
		
		
		//entrada de dados
		
		for( int i = 1; i <= 3; i++) {
			System.out.print("Digite o 1° valor: ");
			valor1 = teclado.nextInt();
			
			System.out.print("Digite o 2° valor: ");
			valor2 = teclado.nextInt();
			
			resultado = valor1 - valor2;
			
			System.out.println("Resultado, "+valor1+" - "+valor2+" = "+resultado+"\n");
		
		}
		
		teclado.close();
		
	}

}
