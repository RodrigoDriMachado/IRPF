package negocio;

public class ImpostoSimples {

	private Double imposto_simplificado;
	private Double baseCalculo;
	private CalculaBaseCalculo calcBase;

	public ImpostoSimples() {
		this.calcBase = new CalculaBaseCalculo();
	}

	public Double calculaImpostoSimplificado(Contribuinte c) {
		Double aux;
		baseCalculo = calcBase.calculaBaseCalculo(c);
		aux = this.baseCalculo;
		aux = aux * 0.05;
		this.baseCalculo = this.baseCalculo - aux;
		if (this.baseCalculo < 12000.00) {
			this.imposto_simplificado = 0.0;
		} else if (baseCalculo > 12000.00 && baseCalculo < 24000.00) {
			this.imposto_simplificado = (this.baseCalculo - 12000.0) * 0.15;

		} else {
			this.imposto_simplificado = ((this.baseCalculo - 12000.0) * 0.15) * 0.275;
		}
		return this.imposto_simplificado;
	}

}
