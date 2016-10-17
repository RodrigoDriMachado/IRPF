package main;

import java.math.BigDecimal;

public class Imposto {
	
	//private static Contribuinte contribuinte;
		private BigDecimal imposto_simplificado;
		private BigDecimal imposto_completo;
		private BigDecimal baseCalculo;
		private BigDecimal rendimentos;
		private BigDecimal previdencia;
		

		public Imposto(Contribuinte c){
			this.imposto_completo = new BigDecimal(0.0);
			this.imposto_simplificado = new BigDecimal(0.0);
			this.baseCalculo = new BigDecimal(0.0);
			this.rendimentos = new BigDecimal(0.0);
			this.previdencia = new BigDecimal(0.0);
			this.previdencia.add(c.getContribuicao_oficial());
			this.baseCalculo.add(c.getTotal_rendimentos());
			this.baseCalculo.subtract(this.previdencia);
		}
			
		public BigDecimal calculaImpostoSimplificado(Contribuinte c){
			Double aux;
			this.baseCalculo.add(c.getTotal_rendimentos());
			this.baseCalculo.subtract(c.getContribuicao_oficial());
			aux = this.baseCalculo.doubleValue();
			aux = aux * 0.05;
			this.baseCalculo.subtract(new BigDecimal(aux));
			if(baseCalculo.compareTo(new BigDecimal(12000.00))==0){
				this.imposto_simplificado.valueOf(0.0);
			}
			else if (baseCalculo.compareTo(new BigDecimal(12000.00))==1 && baseCalculo.compareTo(new BigDecimal(24000.00))==-1) {
				aux = (this.baseCalculo.doubleValue() - 12000.0) *0.15;
				this.imposto_simplificado.valueOf(aux);
			}
			else { 
				aux = ((this.baseCalculo.doubleValue() - 12000.0) *0.15) * 0.275;
				this.imposto_simplificado.valueOf(aux);
				
				
			}
			return this.imposto_simplificado;
		}
		
		private BigDecimal calculaImpostoCompleto(Contribuinte c){
		
			int idade_c, dependentes_c;
			idade_c = c.getIdade();
			dependentes_c = c.getNumero_dependentes();
			
			if(idade_c < 65){
				if(dependentes_c <= 2){
					this.baseCalculo.subtract(this.baseCalculo.multiply(new BigDecimal(0.02)));
					if(this.baseCalculo.compareTo(new BigDecimal(12000.0)) < 1){
						this.imposto_completo.valueOf(0.0);
					}
					else if (baseCalculo.compareTo(new BigDecimal(12000.00))==1 &&  baseCalculo.compareTo(new BigDecimal(24000.00))==-1) {
						this.imposto_completo.valueOf((this.baseCalculo.doubleValue() - 12000.00)* 0.15);
					}
					else { 
						Double aux;
						aux = ((this.baseCalculo.subtract(new BigDecimal(240000.0))).multiply( new BigDecimal(0.275))).doubleValue(); 
						this.imposto_completo.valueOf((this.baseCalculo.doubleValue() - 12000.00)* 0.15);
						this.imposto_completo.add(new BigDecimal(aux));
					}
				}
				else if(dependentes_c >= 3 && dependentes_c < 5){
					this.baseCalculo.subtract((this.baseCalculo.multiply(new BigDecimal(0.035))));
					if(this.baseCalculo.compareTo(new BigDecimal(12000.0)) < 1){
						this.imposto_completo.valueOf(0.0);
					}
					else if (this.baseCalculo.compareTo(new BigDecimal(12000.0))==1 && this.baseCalculo.compareTo( new BigDecimal(24000.00))==0) {
						this.imposto_completo.valueOf((this.baseCalculo.doubleValue() - 12000.00)* 0.15);
					}
					else { 
						Double aux;
						aux = this.baseCalculo.doubleValue();
						this.baseCalculo.subtract(new BigDecimal(24000.0));
						this.baseCalculo.multiply(new BigDecimal(0.275));
						this.baseCalculo.subtract(new BigDecimal(12000.0)).multiply(new BigDecimal(0.15));
						aux = aux + this.baseCalculo.doubleValue();
						this.imposto_completo.valueOf(aux);
					}
				}
				else if(dependentes_c > 5){
					
					this.baseCalculo.subtract(this.baseCalculo.multiply(new BigDecimal(0.05)));
					if(this.baseCalculo.compareTo(new BigDecimal(12000.0)) <1){
						this.imposto_completo.valueOf(0.0);
					}
					else if (this.baseCalculo.compareTo(new BigDecimal(12000.0))==1 && this.baseCalculo.compareTo(new BigDecimal(24000.0))==0) {
						this.imposto_completo.valueOf((this.baseCalculo.doubleValue()*0.15));
					}
					else { 
						Double aux;
						aux = this.baseCalculo.doubleValue();
						this.baseCalculo.multiply(new BigDecimal(0.275)).subtract(new BigDecimal(24000.0));
						this.imposto_completo.valueOf(12000.0);
						this.imposto_completo.multiply(new BigDecimal(0.15).subtract(this.baseCalculo));
						this.imposto_completo.add(new BigDecimal(aux));
					}
				}
			}
			else if(idade_c >= 65){
				if(dependentes_c <= 2){
					
					this.baseCalculo.subtract(this.baseCalculo.multiply(new BigDecimal(0.03)));
					if(this.baseCalculo.compareTo(new BigDecimal(12000.0)) < 1){
						this.imposto_completo.valueOf(0.0);
					}
					else if (this.baseCalculo.compareTo(new BigDecimal(12000.0))==1 && this.baseCalculo.compareTo(new BigDecimal(24000.0))==0) {
						this.imposto_completo.multiply(new BigDecimal(0.15)).subtract(new BigDecimal(12000.0));
					}
					else { 
						Double aux1;
						BigDecimal aux2 = new BigDecimal(0.0);
						aux1 = this.baseCalculo.doubleValue();
						aux1 = aux1 - 24000;
						aux2.valueOf(aux1);
						aux2.multiply(new BigDecimal(0.275));
						this.imposto_completo.multiply(new BigDecimal(0.15)).subtract(new BigDecimal(120000));
						this.imposto_completo.add(aux2);
					}
				}
				else if(dependentes_c >= 3 && dependentes_c < 5){
					BigDecimal aux2 = new BigDecimal(0.0);
					aux2.add(this.baseCalculo);
					aux2.multiply(new BigDecimal(0.045));
					this.baseCalculo.subtract(aux2);
					if(this.baseCalculo.compareTo(new BigDecimal(12000.0)) < 1){
						this.imposto_completo.valueOf(0.0);
					}
					else if (this.baseCalculo.compareTo(new BigDecimal(12000.0))==1 && this.baseCalculo.compareTo(new BigDecimal(24000.0))==0) {
						this.imposto_completo.multiply(new BigDecimal(0.15)).subtract(new BigDecimal(12000.0));
					}
					else { 
						Double aux1;
						BigDecimal aux3 = new BigDecimal(0.0);
						aux1 = this.baseCalculo.doubleValue();
						aux1 = aux1 - 24000;
						aux3.valueOf(aux1);
						aux3.multiply(new BigDecimal(0.275));
						this.imposto_completo.multiply(new BigDecimal(0.15)).subtract(new BigDecimal(120000));
						this.imposto_completo.add(aux2);
					}
				}
				else if(dependentes_c > 5){
					BigDecimal aux4 = new BigDecimal(0.0);
					aux4.add(baseCalculo);
					aux4.multiply(new BigDecimal(0.06));
					this.baseCalculo.subtract(aux4);
					if(this.baseCalculo.compareTo(new BigDecimal(12000.0)) < 1){
						this.imposto_completo.valueOf(0.0);
					}
					else if (this.baseCalculo.compareTo(new BigDecimal(12000.0))==1 && this.baseCalculo.compareTo(new BigDecimal(24000.0))==0) {
						this.imposto_completo.multiply(new BigDecimal(0.15)).subtract(new BigDecimal(12000.0));
					}
					else { 
						Double aux1;
						BigDecimal aux5 = new BigDecimal(0.0);
						aux1 = this.baseCalculo.doubleValue();
						aux1 = aux1 - 24000;
						aux5.valueOf(aux1);
						aux5.multiply(new BigDecimal(0.275));
						this.imposto_completo.multiply(new BigDecimal(0.15)).subtract(new BigDecimal(120000));
						this.imposto_completo.add(aux5);
					}
				}
			}
			
			return this.imposto_completo;
		}
		
		public BigDecimal getBaseCalculo(){
			return this.baseCalculo;
		}

}
