package br.com.cursojava.aula002;

import java.util.Scanner;

public class IdadeDDMMAAAA {

	public static void main(String[] args) {
		int idade;
		int idadeDias;
		int idadeMes;
		int idadeAnos;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe sua idade em dias");
		idade = Integer.parseInt(teclado.nextLine());
		idadeAnos = idade/360;
		idadeMes = (idade%360)/30;
		idadeDias = (idade%360)%30;
		
		System.out.printf("Sua idade em dias é de: %d dias \n Que é %d anos %d meses e %d dias",idade, idadeAnos, idadeMes, idadeDias);
		
		teclado.close();
	}

}
