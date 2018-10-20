package br.com.cursojava.aula005;

import java.util.Scanner;

public class MediasMatriz {


	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double[][] nota = new double[5][3];
		double calcMedia = 0;
		int posi = 0;
		double[] media = new double[5];
		for (int notas = 0; notas < nota.length; notas++) {
			for (int alunos = 0; alunos < nota[notas].length; alunos++) {
				System.out.println("Informe uma nota");
				nota[notas][alunos] = Double.parseDouble(teclado.nextLine());
				calcMedia += nota[notas][alunos];
			}
			media[notas] = calcMedia/3;
			calcMedia = 0;			
		}
		for (double[] ds : nota) {
			for (double notas : ds) {
				System.out.print(notas + ", ");
			}
			System.out.print(" Média = " + media[posi]);
			System.out.println("");
			posi++;
		}
		teclado.close();
	}
}
