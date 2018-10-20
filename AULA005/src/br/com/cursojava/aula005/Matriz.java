package br.com.cursojava.aula005;

public class Matriz {

	public static void main(String[] args) {
		int[][] num = {{10,9,8,7},{6,5,4,3},{2,1,2,3},{4,5,6,7}}; 
		int soma = 0;
		for (int linha = 0; linha < num.length; linha++) {
			for (int coluna = 0; coluna < num[linha].length; coluna++) {
				soma += num[linha][coluna];
			}
		}
		System.out.println("A soma de todos os números é: " + soma);
		System.out.print("Diagonal Primaria: ");
		for (int linha = 0; linha < num.length; linha++) {
			for (int coluna = 0; coluna < num[linha].length; coluna++) {
				if (linha == coluna) {
					System.out.print(num[linha][coluna] + ", ");
				}
			}
		}
		System.out.println("");
		System.out.print("Diagonal Secundaria: ");
		for (int linha = 0; linha < num.length; linha++) {
			for (int coluna = 0; coluna < num[linha].length; coluna++) {
				if ((linha + coluna)+2 == 5) {
					System.out.print(num[linha][coluna] + ", ");
				}
			}
		}		
	}

}
