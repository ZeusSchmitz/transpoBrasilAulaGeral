package br.com.cursojava.aula003;

import java.util.Scanner;

public class QntCaracNome {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe seu nome");
		String nome = teclado.nextLine();
		System.out.printf("Seu nome é %s e possue %d caracteres", nome, nome.replaceAll(" ", "").length());

		teclado.close();
	}

}
