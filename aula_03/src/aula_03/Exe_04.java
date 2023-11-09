package aula_03;

import java.util.Scanner;

public class Exe_04 {
	
	static Scanner Leia = new Scanner(System.in);

	public static void main(String[] args) {
		
		int codigo;
		double numero1, numero2, resultado;
		
		System.out.println("Digite o primeiro numero :");
		numero1 = Leia.nextDouble();
		System.out.println("Digite o segundo numero :");
		numero2 = Leia.nextDouble();
		System.out.println("Operação :");
		codigo = Leia.nextInt();
		
		switch(codigo) {
		case 1:
			resultado = (numero1 + numero2);
			System.out.printf("O resultado da soma é: %.2f", resultado);
			break;
		case 2:
			resultado = (numero1 - numero2);
			System.out.printf("O resultado da subtração é: %2f",resultado );
			break;
		case 3:
			resultado = ( numero1 * numero2);
			System.out.printf("O resultado da multiplicação é: %.2f", resultado);
			break;
		case 4:
			resultado = (numero1 / numero2);
			System.out.printf("O resulado da divisão é: %.2f", resultado);
			break;
			default:
				System.out.println("Operação invalida.");

				


			


		}
		

	}

}
