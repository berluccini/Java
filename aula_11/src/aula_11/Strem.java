package aula_11;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Strem {

	public static void main(String[] args) {
		
	
		
	List<String> cidade = Arrays.asList(" São Paulo , campinas, Sorrocaba ,ubatuba,rio de janeiro,nova york,barreto, Santos, Santo andre");
		
	/*List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		List<Integer> numerosaoCubo =numeros.stream()
				.map(n -> n*n*n)
				.collect(Collectors.toList());
	
		System.out.println(numerosaoCubo);
	
		
		List<Integer> numerosPares =numeros.stream()
				.filter(n -> n%2 ==0)
				.collect(Collectors.toList());
		System.out.println(numerosPares);*/
		
		long cidadesIniciandoS = cidade.stream()
				.filter(c-> c.toString().startsWith(" S"))
				.count();
		
		System.out.println("quantas cidades comecam com a letra S : " + cidadesIniciandoS );
		
				
	}
}
