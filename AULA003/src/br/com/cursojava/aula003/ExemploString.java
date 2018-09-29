package br.com.cursojava.aula003;

public class ExemploString {

	public static void main(String[] args) {
		String curso = "Curso Java TranspoBrasil S�bado";
		
		//Quantidade de caracteres
		System.out.printf("O texto %s possui %d caracteres\n", curso, curso.length());
		
		//Retira os espa�os
		String semEspaco = curso.replace(" ", "");
		System.out.println(semEspaco);
		
		System.out.println(curso.replace(" ", "").length()); //retira espacos e informa qnt caracteres
		
		System.out.println(curso.contains("TranspoBrasil")); //se contem na frase
		System.out.println(curso.startsWith("Curso")); // se inicia com isso na frase		
		System.out.println(curso.endsWith("Domingo")); // se termina com isso na frase, retorna boolean
		
		System.out.println(curso.indexOf("TranspoBrasil")); //retorna a posi�ao onde come�a o indice
		System.out.println(curso.indexOf("a")); //retorna a posi�ao do primeiro a
		System.out.println(curso.indexOf("a", 10)); // retorna a posi�ao do primeiro a depois da posi�ao 10
		System.out.println(curso.lastIndexOf("a")); //retorna a ultima posi�ao do a
		
		System.out.println(curso.toUpperCase()); //retorna tudo maiusculo
		System.out.println(curso.toLowerCase()); //retorna tudo minusculo
		
		System.out.println(curso.substring(11)); //texto a partir da 11 posicao
		System.out.println(curso.substring(11, 17)); //texto enre 11 e 17
		
		String palavra = "s�bado";
		int indice = curso.toLowerCase().indexOf(palavra.toLowerCase()); //retorna a posicao da "palavra" no texto
		System.out.println(indice);
		
		System.out.println(curso.charAt(10));
		System.out.println(curso.charAt(11));
		System.out.println(curso.charAt(12));
		System.out.println(curso.charAt(13));
		System.out.println("==============================");
		String user1 = "Jo�o";
		String user2 = "Jo�o";
		String user3 = new String("Jo�o");
		System.out.println(user1 == user2); //ser� igual pois user 2 quando criado ve na mem�ria que � igual ao user 1 e aponta para ele
		System.out.println(user1 == user3);
		System.out.println(user1.equals(user2));
		System.out.println(user1.equalsIgnoreCase(user3));
		
		System.out.println(user1.equalsIgnoreCase("JO�O"));
		System.out.println("jo�o".equalsIgnoreCase("JO�O"));
		
		String texto = "   oi pessoal    ";
		String registro = "contato;contato@teste.com;123456";
		
		System.out.printf(">%s< , length = %d\n", texto, texto.length());
		System.out.printf(">%s< , length = %d\n", texto.trim(), texto.trim().length()); //retira espa�os
		String[] valores = registro.split(";"); //acha o ; e quebra cria lista
		System.out.println(valores[0]);
		System.out.println(valores[1]);
		System.out.println(valores[2]);
		System.out.println(valores[3]);
	}

}
