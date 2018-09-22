package br.com.cursojava.aula002;

import java.util.Scanner;

public class NotaMaxMin {

	public static void main(String[] args) {
		double nota1;
		double nota2;
		double nota3;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite a primeira nota");
		nota1 = Double.parseDouble(teclado.nextLine());
		System.out.println("Digite a segunda nota");
		nota2 = Double.parseDouble(teclado.nextLine());
		System.out.println("Digite a terceira nota");
		nota3 = Double.parseDouble(teclado.nextLine());
		System.out.println("A maior nota entre as 3 é: " + Math.max(Math.max(nota1, nota2), nota3));
		System.out.println("A menor nota entre as 3 é: " + Math.min(Math.min(nota1, nota2), nota3));

		teclado.close();
	}

}
