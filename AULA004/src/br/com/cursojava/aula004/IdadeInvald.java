package br.com.cursojava.aula004;

import java.util.Scanner;

public class IdadeInvald {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int idade = 0;
		do {
			System.out.println("Informe sua Idade");
			idade = Integer.parseInt(teclado.nextLine());
			if(idade < 0) {
				System.out.println("Valor invalido...");
			}				
		} while (idade < 0);
		System.out.println("Sua idade é: " + idade);
		teclado.close();
	}

}
