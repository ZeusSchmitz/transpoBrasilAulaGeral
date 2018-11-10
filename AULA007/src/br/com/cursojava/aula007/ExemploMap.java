package br.com.cursojava.aula007;

import java.util.HashMap;
import java.util.Map;

public class ExemploMap {

	public static void main(String[] args) {
		Map<String, Pessoa> mapa = new HashMap<>();
		
		//Add
		mapa.put("123456", new Pessoa("Maria"));
		mapa.put("789123", new Pessoa("João"));
		mapa.put("246810", new Pessoa("Mariana"));
		System.out.println(mapa);
		//Qtd de elementos
		System.out.println(mapa.size());
		//Troca de Valores
		mapa.put("troca", new Pessoa("Pessoa1"));
		mapa.put("troca", new Pessoa("Tiburcio"));
		System.out.println(mapa);
		//Verifica se existe chave
		System.out.println(mapa.containsKey("123456"));
		//Veriifica se existe valor especifico
		System.out.println(mapa.containsValue(new Pessoa("Maria")));
		//Busca elemento atraves da chave
		System.out.println(mapa.get("123456"));
	}

}
