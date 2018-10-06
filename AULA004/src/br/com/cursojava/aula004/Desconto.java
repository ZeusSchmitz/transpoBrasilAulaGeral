package br.com.cursojava.aula004;

import java.util.Scanner;

public class Desconto {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double notas[] = new double[10];
		double media = 0;
		for (int i = 0; i < notas.length; i++) {
			System.out.println("Por favor digite uma nota");
			notas[i] = Double.parseDouble(teclado.nextLine());
			media += notas[i];

			if (i == 9) {
				media /= 9;
				for (int j = 0; j < notas.length; j++) {
					if (notas[j] <= media) {
						System.out.print(notas[j] + " ");
					}
				}

			}
		}
		teclado.close();
	}

}
