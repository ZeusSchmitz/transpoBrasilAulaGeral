package br.com.cursojava.avaliacao1;

import java.util.Scanner;

public class Questao2 {

	public static void main(String[] args) {
		int idade;
		Scanner teclado = new Scanner(System.in);		
		System.out.println("Digite sua idade");
		idade = Integer.parseInt(teclado.nextLine());
		System.out.printf("Sua idade em 20 anos será de: %d", idade + 20);
		
		teclado.close();
	}
}
