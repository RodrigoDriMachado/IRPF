package negocio;

public class CalculaImposto {

	private ImpostoCompleto impostoCompletoDevido;
	private ImpostoSimples impostoSimplesDevido;

	public CalculaImposto() {
		this.impostoCompletoDevido = new ImpostoCompleto();
		this.impostoSimplesDevido = new ImpostoSimples();
	}

	public Double calculaInmpostoSimples(Contribuinte contribuinte) {
		return this.impostoSimplesDevido.calculaImpostoSimplificado(contribuinte);
	}

	public Double calculaInmpostoCompleto(Contribuinte contribuinte) {
		return this.impostoCompletoDevido.calculaImpostoCompleto(contribuinte);
	}

}
