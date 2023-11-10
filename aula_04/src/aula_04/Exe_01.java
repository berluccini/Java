package aula_04;

import java.util.Scanner;

public class Exe_01 {

	static Scanner Leia = new Scanner(System.in);

	public static void main(String[] args) {

		int idade, identidadegenero, mulherC = 0, homemC = 0, naob = 0, mulherT = 0, homemT = 0, outro = 0;
		int pessoadev ,back = 0, front = 0, mobile = 0, fullstack = 0;
		String continua = "S";

		while (continua.equalsIgnoreCase("S")) {
			System.out.println("Digite sua idade:");
			idade = Leia.nextInt();

			System.out.println("Digite seu Genero(1-mulherC/2-homemC/3-naob/4-mulherT/5-homemT/6-outros):");
			identidadegenero = Leia.nextInt();

			System.out.println("Digite sua area de dev(01-back/02-front/03-mobile/04-fullstack):");
			pessoadev = Leia.nextInt();
			
			if (pessoadev < 01 || pessoadev > 04)
			System.out.println("Digite uma opção entre 01 e 04!");
			while (pessoadev < 01 || pessoadev > 04)
		
			if (pessoadev == 01)
				back++;
			if (pessoadev == 02)
				front++;
			if (pessoadev == 03)
				mobile++;
			if(pessoadev == 04)
				fullstack ++;

			if (identidadegenero < 1 || identidadegenero > 6)
				System.out.println("Digite uma opção entre 1 e 6!");

			while (identidadegenero < 1 || identidadegenero > 6)
			if (identidadegenero == 1 && idade > 40 || idade < 30)
					mulherC ++;
			if (identidadegenero == 2 && idade > 40 || idade < 30)
				homemC ++;
			if (identidadegenero == 3 && idade > 40 || idade < 30)
				naob ++;
			if (identidadegenero == 4 && idade > 40 || idade < 30)
				mulherT ++;
			if (identidadegenero == 5 && idade > 40 || idade < 30)
				homemT ++;
			if (identidadegenero == 6 && idade > 40 || idade < 30)
				outro ++;

			System.out.println("Deseja continuar (S/N)?");
			Leia.skip("\\R");
			continua = Leia.nextLine();

			System.out.println("DEV backend :" + back);
			System.out.println("O número de Homens Cis e Trans desenvolvedores Mobile maiores de 40 anos:" + homemC + homemT + mobile );
			System.out.println("O número de Não Binários desenvolvedores FullStack menores de 30 anos:" + naob + fullstack );
			System.out.println("o total de mulher Cis e Trans desenvolvedoras Frodend:" + mulherC + mulherT + front);
			System.out.println(" o número total de pessoas que responderam à pesquisa:" );
			System.out.println("A média de idade das pessoas que responderam à pesquisa:");

		}

	}
}
