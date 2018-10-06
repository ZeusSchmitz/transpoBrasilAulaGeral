package br.com.cursojava.aula004;

import java.util.Scanner;

public class QtdCarc {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String[] nomes = new String[5];
		int nomeMax = 0;
		for (int i = 0; i < nomes.length; i++) {
			System.out.println("Digite um nome");
			nomes[i] = teclado.nextLine(); 
		}
		for (int i = 0; i < nomes.length; i++) {
			if(nomes[nomeMax].length() < nomes[i].length()) { //nomes posi nomeMax "0"na primeira vez 
				nomeMax = i;
			}
		}
		System.out.println("O maior nome é:" + nomes[nomeMax]);
		teclado.close();
	}

}
