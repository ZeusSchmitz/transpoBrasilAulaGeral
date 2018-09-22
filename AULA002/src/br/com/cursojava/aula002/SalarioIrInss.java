package br.com.cursojava.aula002;

import java.util.Scanner;

public class SalarioIrInss {

	public static void main(String[] args) {
		double salario;
		double slrInss;
		double slrIr;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe o valor de seu sal�rio");
		salario = Double.parseDouble(teclado.nextLine());
		slrInss = salario - (salario*(11f/100));
		if(slrInss<=1800) {
			System.out.printf("Seu sal�rio final � de: %.2f voc� n�o tem desconto do IR", slrInss);
		}else if ((slrInss>1800)&&(slrInss<=2400)) {
			slrIr = slrInss - (slrInss*(7.5f/100));
			System.out.printf("Seu sal�rio inicial � de: %.2f com desconto do INSS � de %.2f " 
					+         "e com desconto de 7,5 %% do IR, seu s�lario l�quido "
					+         "� de: %.2f", salario, slrInss, slrIr);
		}else if ((slrInss>2400)&&(slrInss<=3600)) {
			slrIr = slrInss - (slrInss*(24f/100));
			System.out.printf("Seu sal�rio inicial � de: %.2f com desconto do INSS � de %.2f " 
					+         "e com desconto de 24 %% do IR, seu s�lario l�quido "
					+         "� de: %.2f", salario, slrInss, slrIr);
		}else if (slrInss>3600) {
			slrIr = slrInss - (slrInss*(32f/100));
			System.out.printf("Seu sal�rio inicial � de: %.2f com desconto do INSS � de %.2f " 
					+         "e com desconto de 32 %% do IR, seu s�lario l�quido "
					+         "� de: %.2f", salario, slrInss, slrIr);
		}
		
		teclado.close();
	}

}
