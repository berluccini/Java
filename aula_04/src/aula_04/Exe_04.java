package aula_04;

import java.util.Scanner;

public class Exe_04 {

	 static Scanner Leia = new Scanner(System.in);
	public static void main(String[] args) {
		
		int idade = 1;
		int contador21 = 0, contador50=0;
		
		while (idade > 0) {
			System.out.println("Digite uma idade:");
			idade = Leia.nextInt();
			if(idade <21)
				contador21 ++;
			if(idade >50)
				contador50 ++;
		}
		System.out.printf("total de pessoas menores de 21 anos: %d",contador21);
		System.out.printf("total de pessoas maiores de 50 anos: %d",contador50);


	}

}
