package br.com.cursojava.aula002;

import java.util.Scanner;

public class Potenciacao {

	public static void main(String[] args) {
		double valor;
		double potencia;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe um valor numérico");
		valor = Integer.parseInt(teclado.nextLine());
		potencia = Math.pow(valor, 2);
		System.out.printf("O resultado da potencia %.2f é: %.2f", valor, potencia);
		
		teclado.close();
	}

}
