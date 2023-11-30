package aula_10;

import java.util.Optional;

public class ExeOptional {

	public static void main(String[] args) {
		
		String [] palavras = new String[10];
		String palavra ="";
		String teste = "batatinha";
		
		for(var p : palavras) {
			System.out.println(p);
		}
		
		Optional<String> checaNulo = Optional.ofNullable(palavras[5]);
		
		if(checaNulo.isPresent()) {
		palavra =palavras[5].toLowerCase();
		System.out.println(palavra);
	}else	

		System.out.println("A Palavra é nula!");
	

	Optional<String> opTeste =Optional.ofNullable(teste);
	if(opTeste.isEmpty())
	 System.out.println("vazio!");

	if(opTeste.isPresent())
		System.out.println("tem uma string!");
	
	System.out.println(opTeste.get());
}
}