package aula_03;

import java.util.Scanner;

public class PlanoSaudeV2 {
	
	static Scanner Leia = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		String nome;
		int FaixaIdade;
		
		System.out.print(" Digite o seu nome: ");
		nome = Leia.nextLine();
		
		System.out.println("Faixas Etárias:");
		System.out.println("1- De 0 a 10 anos:");
		System.out.println("2- De 11 a 29 anos:");
		System.out.println("3- de 30 a 45 anos:");
		System.out.println("4- de 46 a 59 anos:");
		System.out.println("5- de 60 a 65 anos:");
		System.out.println("6- Acima de 65 anos:");

		
		System.out.print("\n Digite a faixa etaria : ");
		FaixaIdade = Leia.nextInt();
		
		
		switch(FaixaIdade) {
		case 1:
			System.out.printf("\n%s o seu plano de Saude custara R$ 100,00 por mes. ", nome);
			break;
		case 2:
			System.out.printf("\n%s o seu plano de Saude custara R$ 200,00 por mes. ", nome);
			break;
		case 3:
			System.out.printf("\n%s o seu plano de Saude custara R$ 300,00 por mes. ", nome);
			break;
		case 4:
			System.out.printf("\n%s o seu plano de Saude custara R$ 500,00 por mes. ", nome);
			break;
		case 5:
			System.out.printf("\n%s o seu plano de Saude custara R$ 600,00 por mes. ", nome);
			break;
		case 6:
			System.out.printf("\n%s o seu plano de Saude custara R$ 800,00 por mes. ", nome);
			break;
		default:
			System.out.println("\nFaixa Etária invalida! digite um valor entre 1 e 6");
		}
	}

}
