package br.com.cursojava.aula003;

import java.util.Scanner;

public class viteNotas {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite 20 notas de 0 a 10");
		int numNotas = 0;
		double nota = 0;
		while (numNotas <= 20) {
			System.out.printf("Digite a %d* nota\n", numNotas);
			nota += Double.parseDouble(teclado.nextLine());
			numNotas++;
		}
		double resultado = nota/20;
		System.out.printf("A média das notas é: %.2f", resultado);
		
		teclado.close();
	}

}
