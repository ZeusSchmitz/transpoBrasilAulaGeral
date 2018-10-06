package br.com.cursojava.aula004;

import java.util.Scanner;

public class NomesVetor {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String[] nomes = new String[5];
		for (int i = 0; i < nomes.length; i++) {
			System.out.println("Digite um nome");
			nomes[i] = teclado.nextLine(); 
		}
		for (String string : nomes) {
			System.out.println(string);
		}
		teclado.close();
	}

}
