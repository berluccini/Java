package aula_02;

import java.util.Scanner;

public class Exe03 {
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {

		float salariobruto, adicionalnoturno, horasextras, descontos;

		System.out.println(" Insira o valor do salario bruto : ");
		salariobruto = leia.nextFloat();

		System.out.println(" Insira o valor do adicional noturno : ");
		adicionalnoturno = leia.nextFloat();

		System.out.println(" Insira o valor das horas extras : ");
		horasextras = leia.nextFloat();

		System.out.println(" Insira o valor do descontos : ");
		descontos = leia.nextFloat();

		System.out.println("soma: " + (salariobruto + adicionalnoturno + horasextras - descontos));

	}

}
