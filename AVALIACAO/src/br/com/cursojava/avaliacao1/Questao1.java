package br.com.cursojava.avaliacao1;

import java.util.Scanner;

public class Questao1 {

	public static void main(String[] args) {
		int valor;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite um valor inteiro");
		valor = Integer.parseInt(teclado.next());
		if(valor % 2 == 0) {
			System.out.printf("Valor %d é par", valor);
		}else {
			System.out.printf("Valor %d é ímpar", valor);
		}
		teclado.close();		
	}

}
