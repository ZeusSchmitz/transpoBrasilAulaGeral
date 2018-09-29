package br.com.cursojava.aula003;

import java.util.Scanner;

public class IsentoIR {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe seu salário");
		double slr = Double.parseDouble(teclado.nextLine());
		String slrIr = slr <= 1800 ? "Isento do" : "Precisa pagar o";
		System.out.printf("%s imposto de renda", slrIr);

		teclado.close();
	}

}
