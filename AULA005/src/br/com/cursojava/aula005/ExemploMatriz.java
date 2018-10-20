package br.com.cursojava.aula005;

import java.util.concurrent.SynchronousQueue;

public class ExemploMatriz {

	public static void main(String[] args) {
		double[][] notas = new double[5][3];
		int[] posicoes[] = new int[2][2];
		String nomes[][] = new String[3][2];
		
		String[][] regioes = new String[2][];
		regioes[0] = new String[3];
		regioes[1] = new String[4];
		regioes[0][0] = "Rio Grande do Sul";
		regioes[0][1] = "Santa Catarina";
		regioes[0][2] = "Paraná";
		regioes[1][0] = "São Paulo";
		regioes[1][1] = "Rio de Janeiro";
		regioes[1][2] = "Minas Gerais";
		regioes[1][3] = "Espirito Santo";
		
		int[][] pontos = {{20,16,16},{16,24,16},{16,24,16}};
		String[][] disciplinas = new String[][]{{"Lógica","BD","Java Fund",},
				                               {"HTML","JVSPT","Java Fund",},
				                               {"Angular 1","Angular 6","React",}};
				                               
        for (int regiao = 0; regiao < regioes.length; regiao++) {
			for (int estado = 0; estado < regioes[regiao].length; estado++) {
				System.out.println(regioes[regiao][estado]);
			}
		}				                               
        for (String[] curso : disciplinas) {
			for (String disciplina : curso) {
				System.out.print(disciplina + ", ");
			}
			System.out.println("");
		}
	}

}
