package br.com.cursojava.avaliacao1;

import java.util.Scanner;

public class Questao10 {

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
		if ((imc<=17)&&(imc>=18.99)) {
			System.out.println("Abaixo do peso");
		} else if ((imc>=18.5)&&(imc<=24.99)) {
			System.out.println("Peso normal");
		} 
		
		teclado.close();

	}

}
