package br.com.cursojava.aula004;

import java.util.Scanner;

public class MenuDoWhile {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String codigo = "";
		do {
			System.out.println("A - Abrir arquivo");
			System.out.println("B - Procurar arquivo");
			System.out.println("C - Download arquivo");
			System.out.println("D - Upload arquivo");
			System.out.println("S - Sair");
			
			codigo = teclado.nextLine().toUpperCase();
			switch (codigo) {
			case "A":
				System.out.println("Voc� escolheu Abrir arquivo");
				break;
			case "B":
				System.out.println("Voc� escolheu Procurar arquivo");
				break;
			case "C":
				System.out.println("Voc� escolheu Download arquivo");
				break;
			case "D":
				System.out.println("Voc� escolheu Upload arquivo");
				break;
			case "S":
				System.out.println("Executando logoff...");
				break;

			default:
				System.out.println("Op��o invalida");
				break;
			}
		} while (!codigo.equals("S")); //pode usar equalsIgnoreCase
		System.out.println("Fim da aplica��o");
		teclado.close();
	}

}
