package aula_04;

import java.util.Scanner;

public class Pesquisa {
	static Scanner Leia = new Scanner(System.in);

	public static void main(String[] args) {

		int idade, esporte, futebol = 0, voleibolM18 = 0, basquetebolm18 = 0, outros = 0;
		String continua = "s";

		while (continua.equalsIgnoreCase("s")) {

			System.out.println("Digite sua idade:");
			idade = Leia.nextInt();
			
			do {
			System.out.println("Digite o seu esporte favorito(1-fut/2-vol/3-basq/4-outros:");
			esporte = Leia.nextInt();
			if(esporte < 1 || esporte >4){
				System.out.println("Digite uma opção entre 1 e 4!");
	}
			}while(esporte < 1 || esporte >4);
			if (esporte == 1)
				futebol++;
			if (esporte == 2 && idade > 18)
				voleibolM18++;
			if (esporte == 3 && idade < 18)
				basquetebolm18++;
			if (esporte == 4)
				outros++;
			System.out.println("Deseja continuar (S/N)?");
			Leia.skip("\\R");
			continua = Leia.nextLine().toUpperCase();
			System.out.println("total de pessoas que gostam de futebol:" + futebol);
			System.out.println("total de pessoas que gostam de voleibol e são maiores de 18 anos:" + voleibolM18);
			System.out.println("total de pessoas que gostam de basquetebol e são menores de 18 anos:" + basquetebolm18);
			System.out.println("total de pessoas que gostam de outros esportes:" + outros);

		}

	}

}
