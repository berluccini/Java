package aula_02;

import java.util.Scanner;

public class Exe01 {

	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {

		float salario, abono;

		System.out.println(" Insira o valor do salario : ");
		salario = leia.nextFloat();

		System.out.println(" insira o valor do abono: ");
		abono = leia.nextFloat();

		System.out.println("soma: " + (salario + abono));

	}

}
