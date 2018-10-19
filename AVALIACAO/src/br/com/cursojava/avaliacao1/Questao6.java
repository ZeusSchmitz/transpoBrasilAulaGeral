package br.com.cursojava.avaliacao1;

import java.util.Scanner;

public class Questao6 {

	public static void main(String[] args) {
		int idade;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe sua idade");
		idade = Integer.parseInt(teclado.nextLine());
		if(idade<=12) {
			System.out.println("Criança");
		}else if ((idade>=13)&&(idade<=17)) {
			System.out.println("Adolescente");
		}else if ((idade>=18)&&(idade<=24)) {
			System.out.println("Jovem");
		}else if ((idade>=25)&&(idade<=59)) {
			System.out.println("Adulto");
		}else if (idade>60) {
			System.out.println("Idoso");
		}
		teclado.close();
	}
}
