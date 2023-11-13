package aula_05;

import java.util.Scanner;

public class Exe_01 {

	static Scanner Leia =new Scanner(System.in);
	
	public static void main(String[] args) {
		
		
		int [] incio_vetor = {2,5,1,3,4,9,7,8,10,6};
		int number = 0 ,posição = -1;
		
		System.out.println(" \nDigite o valor desejado para descobrir sua posição : \n");
		number=Leia.nextInt();
		
		for(int i= 0;i < incio_vetor.length;i ++ ) {
			if(incio_vetor[i]==number) {
				posição = i;
			
			
			System.out.println(" \n o numero "  +  number  +  " esta localizado na posição " + posição + "\n" );
			
		}
		}
			if(posição <= -1)
			System.out.println("\n o numero " + number +  " não foi encontrado,digite um numero valido: " );
			

			}
		
	
	}

		
		

	


