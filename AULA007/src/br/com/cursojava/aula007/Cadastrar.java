package br.com.cursojava.aula007;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cadastrar extends Produtos{

	public static void main(String[] args) {
		int cod = 0;
		Produtos produto;
		Scanner teclado = new Scanner(System.in);
		List<Produtos> prod = new ArrayList<>();
		System.out.println("----------Lista de Produtos----------");
		System.out.println("");
		System.out.println("1 - Cadastrar produto");
		System.out.println("2 - Listar produtos");
		System.out.println("3 - Remover produto");
		System.out.println("");
		System.out.println("----------Digite uma opção----------");
		//cod = teclado.nextInt();
		do {
			cod = teclado.nextInt();
			System.out.println("Ola");
			switch (cod) {
			case 1:
				produto = new Produtos("Sal", "Salgado", 2);				
				break;
			case 2:
				System.out.println(prod);				
				break;
			case 3:
				produto = new Produtos("Sal", "Salgado", 2);
				prod.remove(produto);
				break;

			default:
				break;
			}
		} while (cod > 0 && cod < 4);
/*		Produtos produto = new Produtos("Sal", "Salgado", 2);
		prod.add(produto);
		Produtos produto1 = new Produtos("Agua", "Molhada", 2);
		prod.add(produto1);
		System.out.println(prod);
		prod.remove(produto);
		System.out.println(prod);
*/
	}

}
