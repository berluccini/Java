package exercicos;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int numero, contador;
		
		System.out.println("Digite a Tabuada que vc deseja calcular:");
		numero=leia.nextInt();
		
		for (contador = 0; contador <=12; contador++) {
			System.out.println(numero + " x " + contador + "=" + numero * contador);
		}
	}

}
