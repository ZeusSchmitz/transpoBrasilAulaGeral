package br.com.cursojava.avaliacao1;

import java.util.Scanner;

public class Questao5 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite 10 notas de 0 a 10");
		int numNotas = 0;
		double nota = 0;
		while (numNotas <= 20) {
			System.out.printf("Digite a %d* nota\n", numNotas);
			nota += Double.parseDouble(teclado.nextLine());
			numNotas++;
		}
		
   }
}