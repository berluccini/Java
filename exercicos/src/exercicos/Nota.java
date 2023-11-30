package exercicos;

import java.util.Scanner;

public class Nota {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		float nt1, nt2, nt3, nt4, media;

		System.out.println("digite a 1º nota:");
		nt1 = leia.nextFloat();
		System.out.println("digite a 2º nota:");
		nt2 = leia.nextFloat();
		System.out.println("digite a 3º nota:");
		nt3 = leia.nextFloat();
		System.out.println("digite a 4º nota:");
		nt4 = leia.nextFloat();
		
		media = (nt1+nt2+nt3+nt4)/4;
		if(media >= 6) {
			System.out.println("parabens,vc foi aprovado com media :" + media);
		}else {
			System.out.println("infelizmente vc foi reprovado com a media : "+ media);
		}
		
	}

}
