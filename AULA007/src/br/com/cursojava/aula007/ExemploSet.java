package br.com.cursojava.aula007;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ExemploSet {

	public static void main(String[] args) {
		Set<String> nomes = new HashSet<>();
		
		//Add
		nomes.add("Maria");
		nomes.add("Joao");
		System.out.println(nomes);
		//Não são permitidos elementos duplicados
		boolean adicionado = nomes.add("Joao");
		System.out.println(adicionado);
		//Verifica QTD
		System.out.println(nomes.size());
		//Verifica conj elemento
		System.out.println(nomes.contains("Ana"));
		System.out.println(nomes.contains("Joao"));
		//conjunto vazio
		System.out.println(nomes.isEmpty());
		//itera sobre o conjunto
		for (String atual : nomes) {
			System.out.println(atual);
		}
		Iterator<String> iterator = nomes.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
			
		}
		//Remover
		System.out.println(nomes);
		nomes.remove("Maria");
		System.out.println(nomes);
	}

}
