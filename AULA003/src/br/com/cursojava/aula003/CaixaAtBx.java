package br.com.cursojava.aula003;

import java.util.Scanner;

public class CaixaAtBx {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite uma frase");
		String frase = teclado.nextLine().trim();
		System.out.println(frase.toLowerCase());
		System.out.println(frase.toUpperCase());

		teclado.close();
	}

}
