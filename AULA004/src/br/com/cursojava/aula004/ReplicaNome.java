package br.com.cursojava.aula004;

import java.util.Scanner;

public class ReplicaNome {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite uma palavra");
		String palavra = teclado.nextLine().replace(" ", "");
		String montPlvr = "";
		for (int i = 0; i < palavra.length(); i++) {
			montPlvr = montPlvr + palavra.charAt(i);
			System.out.println(montPlvr);
		}
		teclado.close();
	}

}
