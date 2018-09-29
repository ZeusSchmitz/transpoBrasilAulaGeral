package br.com.cursojava.aula003;

import java.util.Scanner;

public class UltiPalavra {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite uma frase");
		String frase = teclado.nextLine().trim();
		int posi = frase.trim().lastIndexOf(" ");
		System.out.println(frase.substring(posi+1, frase.length()));
		
		teclado.close();
	}

}
