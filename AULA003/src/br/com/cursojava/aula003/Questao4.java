package br.com.cursojava.aula003;

public class Questao4 {

	public static void main(String[] args) {
		int num = 0;
		int numFin = 50;
		int conta = 0;
		while (num <= numFin) {
			conta += conta + num;
			num++;
		}
		System.out.println(conta);
	}

}
