package aula_02;

import java.util.Scanner;

public class Exe02 {

	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {

		float nota1, nota2, nota3, nota4;

		System.out.println("Entre com a primeira nota:\n");
		
		nota1 = leia.nextFloat();
		
		System.out.println("Entre com a segunda nota:\n");
		
		nota2 = leia.nextFloat();
		
		System.out.println("Entre com a terceira nota:\n");
		
		nota3 = leia.nextFloat();
		
		System.out.println("Entre com a quarta nota:\n");
		
		nota4 = leia.nextFloat();

		System.out.println("soma: " + (nota1 + nota2 + nota3 + nota4) / 4);

	}

}
