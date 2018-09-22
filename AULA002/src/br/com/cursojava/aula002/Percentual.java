package br.com.cursojava.aula002;

import java.util.Scanner;

public class Percentual {

	public static void main(String[] args) {
		double vlrPdto;
		double vlrDsct;
		double vlrFinal;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe o valor do produto");
		vlrPdto = Double.parseDouble(teclado.nextLine());
		System.out.println("Informe o valor do desconto");
		vlrDsct = Double.parseDouble(teclado.nextLine());
		vlrFinal = vlrPdto - (vlrPdto*(vlrDsct/100));
		System.out.printf("O valor de desconto no produto é de: %.0f porcento valor final do produto com o desconto é de: %.2f", vlrDsct, vlrFinal);
		
		teclado.close();
	}

}
