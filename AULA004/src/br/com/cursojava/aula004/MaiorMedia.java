package br.com.cursojava.aula004;

import java.util.Scanner;

public class MaiorMedia {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double notas[] = new double[10];
		String nomes[] = new String[10];
		double media = 0;
		for (int i = 0; i < notas.length; i++) {
			System.out.println("Por favor digite uma nota");
			notas[i] = Double.parseDouble(teclado.nextLine());
			System.out.println("Por favor digite uma nome");
			nomes[i] = teclado.nextLine();
			media += notas[i];
		}
		media /= 9;
		for (int j = 0; j < notas.length; j++) {
			if (notas[j] >= media) {
				System.out.print("Nome: "+nomes[j]+", nota "+notas[j] + " ");
			}
		}		
		teclado.close();
	}

}
