package br.com.cursojava.aula003;

import java.util.Scanner;

public class VotarSorN {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe sua idade");
		int idade = Integer.parseInt(teclado.nextLine());
		String votar = idade >=16 ? "pode votar" : "n�o pode votar";
		System.out.printf("Voc� %s nestas elei��es", votar);
		
		teclado.close();
	}

}
