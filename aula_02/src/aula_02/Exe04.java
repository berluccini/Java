package aula_02;

import java.util.Scanner;

public class Exe04 {
	
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		
		float n1, n2, n3, n4;
		
		System.out.println(" Insira o primeiro numero : ");
		n1 = leia.nextFloat();
		System.out.println(" Insira o segundo numero : ");
		n2 = leia.nextFloat();
		System.out.println(" Insira o terceiro numero : ");
		n3 = leia.nextFloat();
		System.out.println(" Insira o quarto numero : ");
		n4 = leia.nextFloat();
		
		System.out.println("A diferença é : " + ((n1 * n2) - (n3 * n4)));
		
		

		
	}

}
