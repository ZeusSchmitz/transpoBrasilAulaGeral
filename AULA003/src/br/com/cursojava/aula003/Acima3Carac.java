package br.com.cursojava.aula003;

import java.util.Scanner;

public class Acima3Carac {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe seu nome");
		String nome = teclado.nextLine();
		String nomeSemEsp = nome.replaceAll(" ", "");
		String nomeComp = nome.trim();
		int numCarac = nomeSemEsp.length();
		String tipo = numCarac < 3 ? "Nome Invalido" : "Bem vindo " + nomeComp;
		System.out.println(tipo);
		
		teclado.close();
	}

}
