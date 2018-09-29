package br.com.cursojava.aula003;

import java.util.Scanner;

public class VerificIorL {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite uma frase");
		String frase = teclado.nextLine().trim();
		System.out.println(frase.contains("I"));
		System.out.println(frase.contains("L"));
		
		teclado.close();
	}

}
