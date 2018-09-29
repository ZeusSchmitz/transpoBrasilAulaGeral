package br.com.cursojava.aula003;

import java.util.Scanner;

public class NomeUsuCarac {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite um nome");
		String nomeUsu = teclado.nextLine();
		while (!"".equals(nomeUsu)) {
			System.out.printf("O nome possui %d caracteres\n", nomeUsu.length());
			System.out.println("Digite um nome");
			nomeUsu = teclado.nextLine();
		}
		teclado.close();
	}

}
