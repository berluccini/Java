package aula_02;

import java.util.Scanner;

public class Calculadora {
	
	static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {
		
	double	numero1, numero2;
	
	System.out.println(" Digite o primeiro numero: ");
	numero1 = leia.nextDouble();
	
	System.out.println(" Digite o segundo numero: ");
	numero2 = leia.nextDouble();
	
	System.out.println("soma: " + (numero1 + numero2));
	System.out.println("subtração: " + (numero1 - numero2));
	System.out.println("divisão: " + (numero1 / numero2));
	System.out.println("multiplicação: " + (numero1 * numero2));
	
	System.out.println("Raiz quadrada do numero1: "+ (Math.sqrt(numero1)));
	System.out.println("Pontenciação do numero1 pelo numero2:" + (Math.pow(numero1, numero2)));
	
	}

}
