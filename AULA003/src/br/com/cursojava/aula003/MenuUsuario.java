package br.com.cursojava.aula003;

import java.util.Scanner;

public class MenuUsuario {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("1 - Cadastrar Produtos\n2 - Listar Produtos\n"
				+ "3 - Pesquisar Produtos\n4 - Remover Produtos\n5 - Sair");
		System.out.println("Digite um n�mero de op��o do Menu acima");
		int opcao = Integer.parseInt(teclado.nextLine());
		switch (opcao) {
		case 1:
			System.out.println("Voc� escolheu a op��o Cadastrar Produto");
			break;
		case 2:
			System.out.println("Voc� escolheu a op��o Listar Produtos");
			break;
		case 3:
			System.out.println("Voc� escolheu a op��o Pesquisar Produtos");
			break;
		case 4:
			System.out.println("Voc� escolheu a op��o Remover Produtos");
			break;
		case 5:
			System.out.println("Voc� escolheu a op��o Sair");
			break;
		default:
			System.out.println("Op��o invalida");
			break;
		}	
		teclado.close();
	}

}
