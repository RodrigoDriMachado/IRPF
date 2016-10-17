package main;



public class Imposto {
	
		private static Contribuinte c;
		private Double imposto_simplificado;
		private Double imposto_completo;
		private Double baseCalculo;
	
		public Imposto(Contribuinte contribuinte){
			this.c = contribuinte;
			
		}
			
		public Double calculaImpostoSimplificado(){
			Double aux;
			this.baseCalculo = c.getTotal_rendimentos();
			this.baseCalculo = this.baseCalculo - c.getContribuicao_oficial();
			aux = this.baseCalculo;
			aux = aux * 0.05;
			this.baseCalculo = this.baseCalculo - aux;
			if(this.baseCalculo < 12000.00){
				this.imposto_simplificado= 0.0;
			}
			else if (baseCalculo > 12000.00 && baseCalculo < 24000.00) {
				this.imposto_simplificado = (this.baseCalculo - 12000.0) * 0.15;
				
			}
			else { 
				this.imposto_simplificado = ((this.baseCalculo - 12000.0) *0.15) * 0.275;
			}
			return this.imposto_simplificado;
		}
		
		public Double calculaImpostoCompleto(){
			
			int idade_c, dependentes_c;
			idade_c = c.getIdade();
			dependentes_c = c.getNumero_dependentes();
			
			if(idade_c < 65){
				if(dependentes_c <= 2){
					this.baseCalculo = this.baseCalculo - (this.baseCalculo*0.02);
					
					if(this.baseCalculo < 12000.00){
						this.imposto_completo = 0.0;
					}
					else if (baseCalculo > 12000.00 && baseCalculo < 24000.00) {
						this.imposto_completo = (this.baseCalculo -12000.00) * 0.15;
						
					}
					else { 
						Double aux;
						aux = (this.baseCalculo - 240000.00) * 0.275; 
						this.imposto_completo = (this.baseCalculo.doubleValue() - 12000.00)* 0.15;
						this.imposto_completo = this.imposto_completo + aux;
					}
				}
				else if(dependentes_c >= 3 && dependentes_c < 5){
					this.baseCalculo = this.baseCalculo  - (this.baseCalculo * 0.035);
					if(this.baseCalculo < 12000.00){
						this.imposto_completo = 0.0;
					}
					else if (baseCalculo > 12000.00 && baseCalculo < 24000.00) {
						this.imposto_completo = (this.baseCalculo - 12000.00) * 0.15;
					}
					else { 
						Double aux;
						aux = this.baseCalculo.doubleValue();
						aux = (this.baseCalculo - 12000.00) * 0.15;
						this.baseCalculo = (this.baseCalculo - 24000.00)*0.275;
						this.imposto_completo = aux + this.baseCalculo;
					}
				}
				else if(dependentes_c > 5){
					this.baseCalculo = this.baseCalculo - (this.baseCalculo*0.05);
					if(this.baseCalculo < 12000.00){
						this.imposto_completo = 0.0;
					}
					else if (baseCalculo > 12000.00 && baseCalculo < 24000.00) {
						this.imposto_completo = (this.baseCalculo - 12000.00) * 0.15;
					}
					else { 
						Double aux;
						aux = this.baseCalculo.doubleValue();
						aux = (this.baseCalculo - 12000.00) * 0.15;
						this.baseCalculo = (this.baseCalculo - 24000.00)*0.275;
						this.imposto_completo = aux + this.baseCalculo;
					}
				}
			}
			else if(idade_c >= 65){
				if(dependentes_c <= 2){
					this.baseCalculo = this.baseCalculo - (this.baseCalculo*0.03);
					if(this.baseCalculo < 12000.00){
						this.imposto_completo = 0.0;
					}
					else if (baseCalculo > 12000.00 && baseCalculo < 24000.00) {
						this.imposto_completo = (this.baseCalculo - 12000.00) * 0.15;
					}
					else { 
						Double aux;
						aux = this.baseCalculo.doubleValue();
						aux = (this.baseCalculo - 12000.00) * 0.15;
						this.baseCalculo = (this.baseCalculo - 24000.00)*0.275;
						this.imposto_completo = aux + this.baseCalculo;
					}
				}
				else if(dependentes_c >= 3 && dependentes_c < 5){
					this.baseCalculo = this.baseCalculo - (this.baseCalculo*0.045);
					if(this.baseCalculo < 12000.00){
						this.imposto_completo = 0.0;
					}
					else if (baseCalculo > 12000.00 && baseCalculo < 24000.00) {
						this.imposto_completo = (this.baseCalculo - 12000.00) * 0.15;
					}
					else { 
						Double aux;
						aux = this.baseCalculo.doubleValue();
						aux = (this.baseCalculo - 12000.00) * 0.15;
						this.baseCalculo = (this.baseCalculo - 24000.00)*0.275;
						this.imposto_completo = aux + this.baseCalculo;
					}
				}
				else if(dependentes_c > 5){
					this.baseCalculo = this.baseCalculo - (this.baseCalculo*0.06);
					if(this.baseCalculo < 12000.00){
						this.imposto_completo = 0.0;
					}
					else if (baseCalculo > 12000.00 && baseCalculo < 24000.00) {
						this.imposto_completo = (this.baseCalculo - 12000.00) * 0.15;
					}
					else { 
						Double aux;
						aux = this.baseCalculo.doubleValue();
						aux = (this.baseCalculo - 12000.00) * 0.15;
						this.baseCalculo = (this.baseCalculo - 24000.00)*0.275;
						this.imposto_completo = aux + this.baseCalculo;
					}
				}
			}
			
			return this.imposto_completo;
		}
		
		public Double getBaseCalculo(){
			return this.baseCalculo;
		}

}
