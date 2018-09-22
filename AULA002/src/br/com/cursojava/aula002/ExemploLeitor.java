package br.com.cursojava.aula002;

import java.util.Scanner;
public class ExemploLeitor {
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Olá, informe o seu nome por favor");
		String nome = teclado.nextLine(); //Criando variavel nome, tipo string, next line retorna a próxima linha processada, retorna um valor tipo string
		System.out.printf("O nome informado foi %s \n", nome); //Imprime na tela com o nome formatado na frase "%s"=nome 
		
		teclado.close();
	}
}
