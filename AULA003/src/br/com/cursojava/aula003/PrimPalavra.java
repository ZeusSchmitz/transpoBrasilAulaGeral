package br.com.cursojava.aula003;

import java.util.Scanner;

public class PrimPalavra {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite uma frase");
		String frase = teclado.nextLine().trim();
		int posi = frase.indexOf(" ");
		System.out.println(frase.substring(0, posi));
		
		teclado.close();
	}

}
