package br.com.cursojava.aula002;

import java.util.Scanner;

public class PreaPerimetroRetangulo {

	public static void main(String[] args) {
		double base;
		double altura;
		double area;
		double perimetro;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe o tamanho da base");
		base = Double.parseDouble(teclado.nextLine());
		System.out.println("Informe o valor da altura");
		altura = Double.parseDouble(teclado.nextLine());
		area = base * altura;
		perimetro = 2*(base + altura);
		System.out.printf("O valor da área do retangulo é de: %.2f \n O valor do perimetro é de: %.2f", area, perimetro);
		
		teclado.close();
	}

}
