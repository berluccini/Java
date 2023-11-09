package aula_03;

import java.util.Scanner;

public class Exe_03 {
	
	static Scanner Leia = new Scanner(System.in);
	public static void main(String[] args) {
		
		int num1, num2, num3;
		String valor;
		
		System.out.println("Digite o primeiro numero :");
		num1 = Leia.nextInt();
		System.out.println("Digite o segundo numero :");
		num2 = Leia.nextInt();
		System.out.println("Digite o terceiro numero :");
		num3 = Leia.nextInt();
		
		int  X = (num1 + num2);
		
		if(X < num3) {
			valor ="menor";
		}else if (X == num3) {
			valor = "igual";
		}else {
			valor = "maior";
		}
		System.out.printf("A soma de num1 + num2 é %s em relação ao num3", valor);

			
		}

	}


