package br.com.cursojava.avaliacao1;

public class Questao4 {

	public static void main(String[] args) {
		int num = 0;
		int numFin = 50;
		int conta = 0;
		while (num <= numFin) {
			conta += num;
			num++;
		}
		System.out.println(conta);
	}

}
