package aula_11;

import java.util.Arrays;
import java.util.List;

public class Lambda {

	public static void main(String[] args) {
		
		List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9);
			
		System.out.println("Exibir dados da lista:");
		
	/*	for(var n: numeros)
		System.out.println(n);*/
		
		numeros.forEach(n -> System.out.println(n));
	
	System.out.println(" Exibir todos os elementos da lista em dobro:");
		
	numeros.forEach(n -> System.out.println(n +n));
		/*for(var n: numeros)
		System.out.println(n + n);*/
		
	System.out.println("Exibir todos os elemnetos pares:");
		
		numeros.forEach(n -> { 
			if (n%2==0)
				System.out.println(n);
		});
	
	/*	for(var n: numeros) {
			if (n%2==0)
		System.out.println(n);*/
	}
	}
	


