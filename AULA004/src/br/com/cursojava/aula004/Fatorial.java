package br.com.cursojava.aula004;

import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int num = 0;
		int fat = 1;
		do {
			System.out.println("Digite um valor entre 1 e 20");
			num = Integer.parseInt(teclado.nextLine());
			if(num<1 && num>20) {
				System.out.println("Informe um valor valido...");
			}
		} while (num<=1 && num>=20);
		
		for (int i = 1; i <= num; i++) {
			fat *= i;
		}
		System.out.println("O valor fatorial é: " + fat);
		teclado.close();
	}

}
