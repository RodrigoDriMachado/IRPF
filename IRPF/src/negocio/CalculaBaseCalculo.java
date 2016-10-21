package negocio;

public class CalculaBaseCalculo {

	private Contribuinte contribuinte;
	//private static CalculaBaseCalculo calcBaseCalculo = null;
	private Double baseCalculo;
	// private static int simples;

	public CalculaBaseCalculo() {
		// this.simples = 1;
	}

	public Double calculaBaseCalculo(Contribuinte c) {

		this.contribuinte = c;
		this.baseCalculo = contribuinte.getTotal_rendimentos();
		this.baseCalculo = this.baseCalculo - contribuinte.getContribuicao_oficial();
		return this.baseCalculo;
	}
}
