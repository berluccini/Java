package aula_03;

import java.util.Scanner;

public class PlanoSaude {
	
	static Scanner Leia = new Scanner(System.in);

	public static void main(String[] args) {
		
		String nome;
		int idade;
		
		System.out.print(" Digite o seu nome: ");
		nome = Leia.nextLine();
		
		System.out.print("\n Digite o sua idade : ");
		idade = Leia.nextInt();
		
		if(idade > 0 && idade <= 10 ) {
			System.out.printf("\n%s o seu plano de saude custara R$ 100,00 por mes.", nome);
		}else if (idade >= 11 && idade <= 29) {
			System.out.printf("\n%s o seu plano de saude custara R$ 200,00 por mes.", nome);
		}else if (idade >= 30 && idade <= 45) {
			System.out.printf("\n%s o seu plano de saude custara R$ 300,00 por mes.", nome);
		}else if (idade >= 46 && idade <= 59) {
			System.out.printf("\n%s o seu plano de saude custara R$ 500,00 por mes.", nome);
		}else if (idade >= 60 && idade <= 65) {
			System.out.printf("\n%s o seu plano de saude custara R$ 800,00 por mes.", nome);
		}else {
			System.out.printf("\n%s o seu plano de saude custara R$ 1000,00 por mes.", nome);

		}

	}

}
