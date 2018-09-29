package br.com.cursojava.aula003;

import java.util.Scanner;

public class MetadAtBx {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite uma frase");
		String frase = teclado.nextLine().trim();
		int posi = frase.length();
		String metPrim = frase.substring(0, posi/2);
		String metSeg = frase.substring(posi/2, frase.length());
		System.out.println(metPrim.toLowerCase());
		System.out.println(metSeg.toUpperCase());

		teclado.close();
	}

}
