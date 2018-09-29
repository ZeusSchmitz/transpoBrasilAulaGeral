package br.com.cursojava.aula003;

public class Impares {

	public static void main(String[] args) {
		int numVez = 1;
		while (numVez <= 100) {
			if((numVez % 2) == 1)
				System.out.println(numVez);
			numVez++;
		}

	}

}
