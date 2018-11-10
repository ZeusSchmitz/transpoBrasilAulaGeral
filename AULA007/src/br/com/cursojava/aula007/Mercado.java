package br.com.cursojava.aula007;

public class Mercado {

	public static void main(String[] args) {
		CadastrarProd cadsProd = new CadastrarProd();
		
		cadsProd.cadastraProd("Sal", "Salgado", 2);
		cadsProd.cadastraProd("Agua", "Molhada", 2);
		System.out.println(cadsProd.produtos);
		System.out.println();
		//System.out.println(cadsProd.listarProd());
	}

}
