package aula_04;

import java.util.Scanner;

public class Exe_03 {
	
	static Scanner Leia = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		
		int  num1, num2;
		
		System.out.println(" Digite o primeiro numero do intervalo:");
		num1 = Leia.nextInt();
		System.out.println(" Digite o segundo numero do intervalo:");
		num2 = Leia.nextInt();
		if(num1>num2) {
			System.out.println("Intervalo Invalido:");
		}else {
			System.out.printf("No Intervalo entre %d e %d:\n", num1,num2);
			for(int contador = num1;contador  <=num2; contador ++) {
				
				if (contador % 3 == 0 && contador% 5 ==0) {
					System.out.println(contador +" é multiplo de 3 ou 5. ");

				}
			}


		}

	}

}
