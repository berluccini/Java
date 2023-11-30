package exercicos;

import java.util.Scanner;

public class Soma {

	public static void main(String[] args) {
	
		Scanner leia =new Scanner(System.in);
	
		int x = 0;
		int y = 0;
		
		System.out.println("digite  o valor de x:");
		x=leia.nextInt();
		System.out.println("digite o valor de y");
		y=leia.nextInt();
		System.out.println("a soma de é : " + (x+y));
	}

}
