package br.com.cursojava.aula007;

public class AppVeiculo {

	public static void main(String[] args) {
		Veiculo v1 = new Veiculo(1);
		v1.setMarca("Honda");
		v1.setModelo("Fit");
		//v1.setId(2);
		v1.setAnoFabricacao(2007);
		v1.setAnoModelo(2007);
		
		Veiculo v2 = new Veiculo(1);
		v2.setMarca("Honda");
		v2.setModelo("Fit");
		//v2.setId(2);
		v2.setAnoFabricacao(2007);
		v2.setAnoModelo(2007);

		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v1.equals(v2));
	}

}
