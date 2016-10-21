package negocio;

public class ImpostoCompleto {
	
	private CalculaBaseCalculo calcBase;
	private Double baseCalculo;
	private Contribuinte contribuinte;
	private Double imposto_completo;
	
	public ImpostoCompleto(Contribuinte c){
		this.calcBase = new CalculaBaseCalculo();
		this.contribuinte = c;
	}
	
	public Double calculaImpostoCompleto(Contribuinte c) {
		
		baseCalculo = calcBase.calculaBaseCalculo(c);
		int idade_c, dependentes_c;
		idade_c = contribuinte.getIdade();
		dependentes_c = contribuinte.getNumero_dependentes();

		if (idade_c < 65) {
			if (dependentes_c <= 2) {
				this.baseCalculo = this.baseCalculo - (this.baseCalculo * 0.02);
				if (this.baseCalculo < 12000.00) {
					this.imposto_completo = 0.0;
				} else if (baseCalculo > 12000.00 && baseCalculo < 24000.00) {
					this.imposto_completo = (this.baseCalculo - 12000.00) * 0.15;
				} else {
					Double aux;
					aux = (this.baseCalculo - 240000.00) * 0.275;
					this.imposto_completo = (this.baseCalculo - 12000.00) * 0.15;
					this.imposto_completo = this.imposto_completo + aux;
				}
			}
			else if (dependentes_c >= 3 && dependentes_c <= 5) {
				this.baseCalculo = this.baseCalculo - (this.baseCalculo * 0.035);
				if (this.baseCalculo < 12000.00) {
					this.imposto_completo = 0.0;
				} else if (baseCalculo > 12000.00 && baseCalculo < 24000.00) {
					this.imposto_completo = (this.baseCalculo - 12000.00) * 0.15;
				} else {
					Double aux;
					aux = this.baseCalculo;
					aux = (this.baseCalculo - 12000.00) * 0.15;
					this.baseCalculo = (this.baseCalculo - 24000.00) * 0.275;
					this.imposto_completo = aux + this.baseCalculo;
				}
			}
			else if (dependentes_c > 5) {
				this.baseCalculo = this.baseCalculo - (this.baseCalculo * 0.05);
				if (this.baseCalculo < 12000.00) {
					this.imposto_completo = 0.0;
				} else if (baseCalculo > 12000.00 && baseCalculo < 24000.00) {
					this.imposto_completo = (this.baseCalculo - 12000.00) * 0.15;
				} else {
					Double aux;
					aux = this.baseCalculo;
					aux = (this.baseCalculo - 12000.00) * 0.15;
					this.baseCalculo = (this.baseCalculo - 24000.00) * 0.275;
					this.imposto_completo = aux + this.baseCalculo;
				}
			}
		} else if (idade_c >= 65) {
			if (dependentes_c <= 2) {
				this.baseCalculo = this.baseCalculo - (this.baseCalculo * 0.03);
				if (this.baseCalculo < 12000.00) {
					this.imposto_completo = 0.0;
				} else if (baseCalculo > 12000.00 && baseCalculo < 24000.00) {
					this.imposto_completo = (this.baseCalculo - 12000.00) * 0.15;
				} else {
					Double aux;
					aux = this.baseCalculo;
					aux = (this.baseCalculo - 12000.00) * 0.15;
					this.baseCalculo = (this.baseCalculo - 24000.00) * 0.275;
					this.imposto_completo = aux + this.baseCalculo;
				}
			} else if (dependentes_c >= 3 && dependentes_c < 5) {
				this.baseCalculo = this.baseCalculo - (this.baseCalculo * 0.045);
				if (this.baseCalculo < 12000.00) {
					this.imposto_completo = 0.0;
				} else if (baseCalculo > 12000.00 && baseCalculo < 24000.00) {
					this.imposto_completo = (this.baseCalculo - 12000.00) * 0.15;
				} else {
					Double aux;
					aux = this.baseCalculo;
					aux = (this.baseCalculo - 12000.00) * 0.15;
					this.baseCalculo = (this.baseCalculo - 24000.00) * 0.275;
					this.imposto_completo = aux + this.baseCalculo;
				}
			} else if (dependentes_c > 5) {
				this.baseCalculo = this.baseCalculo - (this.baseCalculo * 0.06);
				if (this.baseCalculo < 12000.00) {
					this.imposto_completo = 0.0;
				} else if (baseCalculo > 12000.00 && baseCalculo < 24000.00) {
					this.imposto_completo = (this.baseCalculo - 12000.00) * 0.15;
				} else {
					Double aux;
					aux = this.baseCalculo;
					aux = (this.baseCalculo - 12000.00) * 0.15;
					this.baseCalculo = (this.baseCalculo - 24000.00) * 0.275;
					this.imposto_completo = aux + this.baseCalculo;
				}
			}
		}
		return this.imposto_completo;
	}
}
