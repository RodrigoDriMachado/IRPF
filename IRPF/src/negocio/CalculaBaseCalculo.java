package negocio;

public class CalculaBaseCalculo {

	private Contribuinte contribuinte;
	
	private Double baseCalculo;
	

	public CalculaBaseCalculo() {
	
	}

	public Double calculaBaseCalculo(Contribuinte c) {

		this.contribuinte = c;
		this.baseCalculo = contribuinte.getTotal_rendimentos();
		this.baseCalculo = this.baseCalculo - contribuinte.getContribuicao_oficial();
		return this.baseCalculo;
	}
}
