package br.com.cursojava.aula004;

import java.util.Scanner;

public class NotasVetor {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double[] notas = new double[5];
		for (int i = 0; i < notas.length; i++) {
			System.out.println("Digite uma nota");
			notas[i] = Double.parseDouble(teclado.nextLine());
		}
		for (double d : notas) {
			System.out.println(d);
		}
		teclado.close();
	}

}
