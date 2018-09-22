package br.com.cursojava.aula002;

import java.util.Scanner;

public class MediaPonderada {

	public static void main(String[] args) {
		double nota1;
		double nota2;
		double nota3;
		double mediaPndr;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota");
		nota1 = Double.parseDouble(teclado.nextLine());
		System.out.println("Digite a segunda nota");
		nota2 = Double.parseDouble(teclado.nextLine());
		System.out.println("Digite a terceira nota");
		nota3 = Double.parseDouble(teclado.nextLine());
		mediaPndr = ((nota1*2)+(nota2*3)+(nota3*5))/10;
		System.out.printf("A sua média ponderada é de: %.2f", mediaPndr);

		teclado.close();
	}

}
