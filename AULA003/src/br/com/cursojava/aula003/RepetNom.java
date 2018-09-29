package br.com.cursojava.aula003;

import java.util.Scanner;

public class RepetNom {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite uma palavra");
		String palavra = teclado.nextLine();
		String repete = "";
		int index = palavra.trim().replaceAll(" ", "").length();
		while (index > 0) {
			repete += palavra + " ";
			System.out.println(repete);
			index--;
		}
		teclado.close();
	}

}
