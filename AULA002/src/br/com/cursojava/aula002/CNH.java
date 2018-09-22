package br.com.cursojava.aula002;

import java.util.Scanner;

public class CNH {

	public static void main(String[] args) {
		int idade;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite sua idade");
		idade = Integer.parseInt(teclado.nextLine());
		if(idade>=18)
			System.out.println("Pode fazer CNH, lembre-se, se dirigir não beba, se beber me chame :D");
		else
			System.err.println("Você não pode fazer CNH, errrooooou");
		teclado.close();
	}

}
