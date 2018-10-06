package br.com.cursojava.aula004;

public class ParesFor {

	public static void main(String[] args) {
		for (int i = 100; i <= 200; i++) {
			if (i % 2 == 1) {
				continue;
			}
			System.out.println(i + " ");
		}

	}

}
