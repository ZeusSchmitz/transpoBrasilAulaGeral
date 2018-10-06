package br.com.cursojava.aula004;

import java.util.Scanner;

public class ModoInverso {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite uma palavra");
		String palavra = teclado.nextLine().replace(" ", "");
		String plvrInvert = "";
		int numLetras = palavra.length()-1;
		if (numLetras > -1) {
			do {
				plvrInvert += palavra.charAt(numLetras--);
				//numLetras--;
			} while (numLetras >= 0);			
		}
		System.out.println("O inverso da palavra é: " + plvrInvert);
		teclado.close();
	}

}
