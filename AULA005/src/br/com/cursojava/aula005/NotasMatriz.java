package br.com.cursojava.aula005;

import java.util.Scanner;

public class NotasMatriz {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double[][] nota = new double[5][3];
		for (int notas = 0; notas < nota.length; notas++) {
			for (int alunos = 0; alunos < nota[notas].length; alunos++) {
				System.out.println("Informe uma nota");
				nota[notas][alunos] = Double.parseDouble(teclado.nextLine());
			}
		}
		for (double[] ds : nota) {
			for (double notas : ds) {
				System.out.print(notas + ", ");
			}
			System.out.println("");
		}
		teclado.close();
	}
}
