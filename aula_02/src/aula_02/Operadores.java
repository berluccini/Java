package aula_02;

import java.util.Scanner;

public class Operadores {
	
 	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		
		int numero1 = 10000, numero2 = 1000;
		String valor1= "2", valor2= "3"; 
		
		String nome ="felipe";
				int idade = 18;
		
		float média = 2.456789f;
		int tamanho = 20;
				
		System.out.println("A soma das variaveis valor1 e valor2 é igual a:" + (valor1 + valor2));
		
	System.out.println("A soma das variaveis numero1 e numero2 é igual a: " + (numero1 + numero2));
	
	System.out.println("Meu nome é " + nome +" e eu tenho " + idade +" anos.");
	
System.out.printf("a média final é %.2f", média);

System.out.printf("A média final da %s é %.2f", nome, média);

	System.out.println("Digite o tamanho");
	tamanho =leia.nextInt();

	}

}
