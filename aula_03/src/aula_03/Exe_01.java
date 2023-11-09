package aula_03;

import java.util.Scanner;

public class Exe_01 {

	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {

		int numero;
		String paridade, sinal;

		System.out.println("Digite o valor: ");
		numero = leia.nextInt();

		if (numero % 2 == 0) {
			paridade = "par";
		} else {
			paridade = "ímpar";
		}
		if (numero >= 0) {
			sinal = "positivo";
		} else {
			sinal = "negativo";
		}

		System.out.printf("O Número é %s e %s!", paridade, sinal);

	}

}
