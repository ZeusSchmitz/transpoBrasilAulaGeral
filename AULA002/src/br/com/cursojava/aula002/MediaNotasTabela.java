package br.com.cursojava.aula002;

import java.util.Scanner;

public class MediaNotasTabela {

	public static void main(String[] args) {
		double nota1;
		double nota2;
		double nota3;
		double nota4;
		double media;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota");
		nota1 = Double.parseDouble(teclado.nextLine());
		System.out.println("Digite a segunda nota");
		nota2 = Double.parseDouble(teclado.nextLine());
		System.out.println("Digite a terceira nota");
		nota3 = Double.parseDouble(teclado.nextLine());
		System.out.println("Digite a quarta nota");
		nota4 = Double.parseDouble(teclado.nextLine());
		media = ((nota1 + nota2 + nota3 + nota4)/4);
		if(media>=9) {
			System.out.println("Conceito A");
		}
		else if ((media>=8)&&(media<9)) {
			System.out.println("Conceito B");
		}else if ((media>=6)&&(media<8)) {
			System.out.println("Conceito C");
		}else if ((media>=5)&&(media<6)) {
			System.out.println("Conceito D");
		}else if (media<5) {
			System.out.println("Insuficiente");
		}
		
		teclado.close();
	}

}
