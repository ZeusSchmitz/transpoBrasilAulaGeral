package br.com.cursojava.aula007;

import java.util.List;
import java.util.ArrayList;

public class CadastrarProd {

	Produtos produtos;
	List<Produtos> prod = new ArrayList<>();

	public void cadastraProd(String nome, String desc, double preco) {
		produtos = new Produtos(nome, desc, preco);
		prod.add(produtos);
	}

	public static String listarProd() {
		return "Sal";
	}
}
