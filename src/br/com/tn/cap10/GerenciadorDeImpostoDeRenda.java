package br.com.tn.cap10;

public class GerenciadorDeImpostoDeRenda {
	private double total;

	void adiciona(Tributavel t) {
		System.out.println("Adicionando Tributável: " + t);

		this.total += t.calculaTributos();
	}

	public double getTotal() {
		return this.total;
	}

}