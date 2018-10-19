package br.com.cursojava.aula004;

import java.util.Scanner;

public class MeidaMaior {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double[] notas = new double[10];
		double media = 0;
		for (int i = 0; i < notas.length; i++) {
			System.out.println("Digite uma nota");
			notas[i] = Double.parseDouble(teclado.nextLine());
		}
		for (int i = 0; i < notas.length; i++) {
			media += notas[i]; 
		}
		System.out.println("Média é: " + media/10);
		for (double d : notas) {
			if (d >= (media/10)) {
				System.out.println("Nota maior ou igual a média: " + d);
			}
		}
		teclado.close();
	}

}
