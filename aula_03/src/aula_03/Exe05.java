package aula_03;

import java.util.Scanner;

public class Exe05 {

	static Scanner Leia= new Scanner(System.in);
	public static void main(String[] args) {
		
		String  palavra1 , palavra2 , palavra3 ;
		
		System.out.println("Digite a primeira palavra:");
		palavra1 = Leia.nextLine();
		
		System.out.println("Digite a segunda palavra:");
		palavra2 = Leia.nextLine();
		
		System.out.println("Digite a terceira palavra:");
		palavra3 = Leia.nextLine();
		
		if(palavra1.equalsIgnoreCase("vertebrado")) {
			if(palavra2.equalsIgnoreCase("ave")) {
			if(palavra3.equalsIgnoreCase("carnivoro")) {
				System.out.println("aguia.");
			}else {
				System.out.println("pomba.");
			}
			}else {
				if(palavra3.equalsIgnoreCase("herbivoro")) 
					System.out.println("vaca");

				
					
					

			


			}
			
			}else {
				
			}
		}
		

		
		

		

	}


