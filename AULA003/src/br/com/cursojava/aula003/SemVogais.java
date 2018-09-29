package br.com.cursojava.aula003;

import java.util.Scanner;

public class SemVogais {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite uma frase");
		String frase = teclado.nextLine();
		String texto = frase.replaceAll("[aeiouAEIOU]", "");
		String fraseSemVog = frase.replaceAll("a", "");
		fraseSemVog = fraseSemVog.replaceAll("e", "");
		fraseSemVog = fraseSemVog.replaceAll("i", "");
		fraseSemVog = fraseSemVog.replaceAll("o", "");
		fraseSemVog = fraseSemVog.replaceAll("u", "");
		fraseSemVog = fraseSemVog.replaceAll("A", "");
		fraseSemVog = fraseSemVog.replaceAll("E", "");
		fraseSemVog = fraseSemVog.replaceAll("I", "");
		fraseSemVog = fraseSemVog.replaceAll("O", "");
		fraseSemVog = fraseSemVog.replaceAll("U", "");
		System.out.println(fraseSemVog);
		System.out.println(texto);
		
		teclado.close();
	}

}
