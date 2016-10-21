package negocio;

public class CalculaImposto {

	private ImpostoCompleto impostoComletoDevido;
	private ImpostoSimples impostoSimplesDevido;
	Contribuinte contribuinte;

	private CalculaImposto(Contribuinte c) {
		this.contribuinte = c;
	}

	public Double calculaInmpostoSimples() {
		return this.impostoComletoDevido.calculaImpostoCompleto(this.contribuinte);
	}

	public Double calculaInmpostoCompleto() {
		return this.impostoSimplesDevido.calculaImpostoSimplificado(this.contribuinte);
	}

}
