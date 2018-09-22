package br.com.cursojava.aula002;

import java.util.Scanner;

public class ClassificacaoIdade {

	public static void main(String[] args) {
		int idade;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe sua idade");
		idade = Integer.parseInt(teclado.nextLine());
		if(idade>=18) {
			System.out.println("Categoria Adulto");
		}else if ((idade>=14)&&(idade<=17)) {
			System.out.println("Categoria Juvenil");
		}else if ((idade>=12)&&(idade<=13)) {
			System.out.println("Categoria Infanto Juvenil");
		}else if ((idade>=9)&&(idade<=11)) {
			System.out.println("Categoria Infantil");
		}else if (idade<9) {
			System.out.println("Categoria Mirim");
		}
		teclado.close();
	}

}
