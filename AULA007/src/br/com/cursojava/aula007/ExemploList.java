package br.com.cursojava.aula007;

import java.util.List;
import java.util.ArrayList;

public class ExemploList {

	public static void main(String[] args) {
		List<String> nomes = new ArrayList<>();

		nomes.add("Joao");
		nomes.add("Maria");
		System.out.println(nomes);
		//Tamanho do array
		System.out.println(nomes.size());
		//Adiciona em algum ponto, ex: no começo 0
		nomes.add(0, "José");
		System.out.println(nomes);
		nomes.add("Zec");
		System.out.println(nomes);
		//Trocar nome
		nomes.set(nomes.size() -1, "Zeus");
		System.out.println(nomes);
		//Buscar um elemento especifico
		System.out.println(nomes.get(0));
		System.out.println(nomes.get(3));
		//Verificar o indice de um elemento
		System.out.println(nomes.indexOf("Zeus"));
		System.out.println(nomes.indexOf("Joao"));
		//Criar sublista
		List<String> sublista = nomes.subList(2, nomes.size()); //começo, fim
		System.out.println(sublista);
		nomes.remove(0);
		System.out.println(nomes);
		//remover um elemento atravez de referencia
		nomes.remove("Maria");
		System.out.println(nomes);
	}

}
