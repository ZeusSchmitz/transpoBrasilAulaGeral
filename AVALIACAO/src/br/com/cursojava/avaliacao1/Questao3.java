package br.com.cursojava.avaliacao1;

import java.util.Scanner;

public class Questao3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite uma palavra");
		String palavra = teclado.nextLine();
		String plvrInvt = "";
		int tam = palavra.length()-1;
		while (tam >= 0) {
			plvrInvt += palavra.charAt(tam);
			tam--;
		}
		System.out.println(plvrInvt);
		teclado.close();
	}

}
