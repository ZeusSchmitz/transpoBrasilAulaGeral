package br.com.cursojava.aula002;

import java.util.Scanner;

public class IMC {

	public static void main(String[] args) {
		double altura;
		double peso;
		double imc;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe sua altura");
		altura = Double.parseDouble(teclado.nextLine());
		System.out.println("Informe seu peso");
		peso = Double.parseDouble(teclado.nextLine());
		imc = peso/(altura*altura);
		System.out.printf("Seu IMC é de: %.2f", imc);
		
		teclado.close();
	}

}
