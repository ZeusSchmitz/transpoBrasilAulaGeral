package br.com.cursojava.aula002;

import java.util.Scanner;

public class Banco {

	public static void main(String[] args) {
		int operacao;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite 1 para Depositar; 2 para Sacar; 3 para Verificar Saldo");
		operacao = Integer.parseInt(teclado.nextLine());
		if (operacao == 1) {
			System.out.println("Voc� escolheu a op��o Depositar");
		} else if (operacao == 2) {
			System.out.println("Voc� escolheu a op��o Sacar");			
		} else if (operacao == 3) {
			System.out.println("Voc� escolheu a op��o Verificar Saldo");			
		}
		teclado.close();
	}

}
