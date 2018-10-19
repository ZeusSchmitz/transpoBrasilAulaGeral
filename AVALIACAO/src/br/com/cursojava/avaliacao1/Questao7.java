package br.com.cursojava.avaliacao1;

import java.util.Scanner;

public class Questao7 {

	public static void main(String[] args) {
		double valor;
		double potencia;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe um valor numérico");
		valor = Integer.parseInt(teclado.nextLine());
		potencia = Math.pow(valor, 5);
		System.out.printf("O resultado da potencia %.2f é: %.2f", valor, potencia);
		
		teclado.close();
	}

}
