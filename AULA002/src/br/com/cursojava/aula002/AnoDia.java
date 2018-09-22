package br.com.cursojava.aula002;

import java.util.Scanner;

public class AnoDia {
	public static void main(String[] args) {
		int idade;
		int idadeDias;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe sua idade em anos");
		idade = Integer.parseInt(teclado.nextLine());
		idadeDias = idade * 365;
		System.out.printf("Sua idade em dias é de: %d", idadeDias);
		
		teclado.close();
	}

}
