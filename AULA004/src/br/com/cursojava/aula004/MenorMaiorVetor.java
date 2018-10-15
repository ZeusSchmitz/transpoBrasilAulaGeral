package br.com.cursojava.aula004;

import java.util.Scanner;

public class MenorMaiorVetor {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double[] notas = new double[10];
		double menor = 99;
		double maior = 0;
		for (int i = 0; i < notas.length; i++) {
			System.out.println("Digite uma nota");
			notas[i] = Double.parseDouble(teclado.nextLine());
		}
		for (double d : notas) {
			System.out.printf("Nota:%.2f ", d);
			menor = Math.min(menor, d);
			maior = Math.max(maior, d);
		}
		System.out.println("");
		System.out.printf("A menor nota é: %.2f \n", menor);
		System.out.printf("A maior nota é: %.2f \n", maior);
		teclado.close();
	}

}
