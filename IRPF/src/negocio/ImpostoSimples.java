package negocio;

public class ImpostoSimples {

	private static Contribuinte c;
	private Double imposto_simplificado;
	private Double imposto_completo;
	private Double baseCalculo;

	public ImpostoSimples(Contribuinte contribuinte) {
		this.c = contribuinte;
	}
	
	

	public Double calculaImpostoSimplificado() {
		Double aux;
		calculaBaseCalculo();
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



		return this.imposto_completo;
	}

	}
