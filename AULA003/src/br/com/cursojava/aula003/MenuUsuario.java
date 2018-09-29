package br.com.cursojava.aula003;

import java.util.Scanner;

public class MenuUsuario {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("1 - Cadastrar Produtos\n2 - Listar Produtos\n"
				+ "3 - Pesquisar Produtos\n4 - Remover Produtos\n5 - Sair");
		System.out.println("Digite um número de opção do Menu acima");
		int opcao = Integer.parseInt(teclado.nextLine());
		switch (opcao) {
		case 1:
			System.out.println("Você escolheu a opção Cadastrar Produto");
			break;
		case 2:
			System.out.println("Você escolheu a opção Listar Produtos");
			break;
		case 3:
			System.out.println("Você escolheu a opção Pesquisar Produtos");
			break;
		case 4:
			System.out.println("Você escolheu a opção Remover Produtos");
			break;
		case 5:
			System.out.println("Você escolheu a opção Sair");
			break;
		default:
			System.out.println("Opção invalida");
			break;
		}	
		teclado.close();
	}

}
