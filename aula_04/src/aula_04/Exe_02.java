package aula_04;

import java.util.Scanner;

public class Exe_02 {

	static Scanner Leia = new Scanner(System.in);

	public static void main(String[] args) {
			
			int  n1,n2,n3,n4,n5,n6,n7,n8,n9,n10, par = 0 , impar = 0;
					
			System.out.println(" Digite o 1º numero:");
			n1 =Leia.nextInt();
			System.out.println(" Digite o 2 numero:");
			n2 =Leia.nextInt();
			System.out.println(" Digite o 3º numero:");
			n3 =Leia.nextInt();
			System.out.println(" Digite o 4º numero:");
			n4 =Leia.nextInt();
			System.out.println(" Digite o 5º numero:");
			n5 =Leia.nextInt();
			System.out.println(" Digite o 6º numero:");
			n6 =Leia.nextInt();
			System.out.println(" Digite o 7º numero:");
			n7 =Leia.nextInt();
			System.out.println(" Digite o 8º numero:");
			n8 =Leia.nextInt();
			System.out.println(" Digite o 9º numero:");
			n9 =Leia.nextInt();
			System.out.println(" Digite o 10º numero:");
			n10 =Leia.nextInt();
			
			
			int[] num = {n1 ,n2 ,n3 ,n4 ,n5 ,n6 ,n7 ,n8 ,n9 ,n10};
			
			for(int p=0; p < num.length ; p ++) {
				if(num[p] % 2 == 0) {
					par += 1;
				}else {
					impar += 1;
			
			System.out.println("Total de números pares: " + par);
			System.out.println("Total de números ímpares: " + impar);

					
				 
			}
		
		
		
			}
	}
}

