package exercicos;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int opcao;
		
		System.out.println("#################### MENU ##################");
		System.out.println(" 1- indicação de filme:                     ");
		System.out.println(" 2- indicação de serie:                     ");
		System.out.println(" 3- indicação de anime:                     ");
		System.out.println("############################################");
		System.out.println("\n\n                                        ");
		
		opcao = leia.nextInt();
		
		switch(opcao) {
		case 1:
			System.out.println("filme: desafiando gigantes!");
			break;
		case 2:	
			System.out.println("serie: lucifer!");
			break;
		case 3:
			System.out.println("anime: naruto!");
			break;
			default:
				System.out.println("opção invalida!");
		}
	}

}
