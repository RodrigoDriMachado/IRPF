package testes;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import negocio.*;


public class TestCalculoImposto {
	Double aux;
	ImpostoSimples imp;
	Contribuinte c;
	@Before
	public void setup() {
		c = new Contribuinte("Rodrigo", "0253698209", 3500.0, 5000.0);
		imp = new ImpostoSimples(c);
		
	}
	

	/**
	 * CALCULA IRPF SIMPLES
	 * BASE DE CALCULO MENOR QUE 12000
	 * */
	
	@Test
	public void testCalculoImpostoSimples(){
		assertEquals(0,0,this.imp.calculaImpostoSimplificado());
	}
	
	/**
	 * CALCULA IRPF SIMPLES
	 * BASE DE CALCULO MAIOR QUE 12000 E MENOR QUE 24000
	 * */
	
	@Test
	public void testCalculoImpostoSimples2(){
		c.setContribuicao_oficial(20000.0);
		c.setTotal_rendimentos(40000.0);
		assertEquals(1050,0,this.imp.calculaImpostoSimplificado());
	}

	/**
	 * CALCULA IRPF SIMPLES
	 * BASE DE CALCULO MAIOR QUE 24000
	 * */
	
	@Test
	public void testCalculoImpostoSimples3(){
		c.setContribuicao_oficial(32000.0);
		c.setTotal_rendimentos(850000.0);
		assertEquals(12998,75,this.imp.calculaImpostoSimplificado());
	}
	
	
	
	//--------------------IDADE < 65--------------------//
	
	//--------------------ATÉ 2 DEPENDENTES--------------------//
	
	/**
	 * BASE DE CALCULO MENOR QUE 12000
	 * */
	
	@Test
	public void testCalculoImpostoCompleto(){
		c.setContribuicao_oficial(3500.0);
		c.setTotal_rendimentos(5000.0);
		c.setNumero_dependentes(2);
		c.setIdade(25);
		assertEquals(0,0,this.imp.calculaImpostoCompleto());
	}
	
	
	/**
	 * BASE DE CALCULO ENTRE 12000 E 24000
	 * */
	
	@Test
	public void testCalculoImpostoCompleto2(){
		c.setContribuicao_oficial(20000.0);
		c.setTotal_rendimentos(40000.0);
		c.setNumero_dependentes(1);
		c.setIdade(25);
		assertEquals(1140,00 ,this.imp.calculaImpostoCompleto());
	}
	
	
	/**
	 * BASE DE CALCULO MAIOR QUE 24000
	 * */
	
	@Test
	public void testCalculoImpostoCompleto3(){
		c.setContribuicao_oficial(32000.0);
		c.setTotal_rendimentos(850000.0);
		c.setNumero_dependentes(2);
		c.setIdade(25);
		assertEquals(13674,50,this.imp.calculaImpostoCompleto());
	}
	
	//--------------------3 À 5 DEPENDENTES--------------------//
	
	/**
	 * BASE DE CALCULO MENOR QUE 12000
	 * */
	
	@Test
	public void testCalculoImpostoCompleto4(){
		c.setContribuicao_oficial(3500.0);
		c.setTotal_rendimentos(5000.0);
		c.setNumero_dependentes(4);
		c.setIdade(25);
		assertEquals(0,0,this.imp.calculaImpostoCompleto());
	}
	
	
	/**
	 * BASE DE CALCULO ENTRE 12000 E 24000
	 * */
	
	@Test
	public void testCalculoImpostoCompleto5(){
		c.setContribuicao_oficial(20000.0);
		c.setTotal_rendimentos(40000.0);
		c.setNumero_dependentes(3);
		c.setIdade(25);
		assertEquals(1095,00 ,this.imp.calculaImpostoCompleto());
	}
	
	
	/**
	 * BASE DE CALCULO MAIOR QUE 24000
	 * */
	
	@Test
	public void testCalculoImpostoCompleto6(){
		c.setContribuicao_oficial(32000.0);
		c.setTotal_rendimentos(850000.0);
		c.setNumero_dependentes(5);
		c.setIdade(25);
		assertEquals(13336,625,this.imp.calculaImpostoCompleto());
	}
	
	//--------------------MAIS DE 5 DEPENDENTES--------------------//
	
	/**
	 * BASE DE CALCULO MENOR QUE 12000
	 * */
	
	@Test
	public void testCalculoImpostoCompleto7(){
		c.setContribuicao_oficial(3500.0);
		c.setTotal_rendimentos(5000.0);
		c.setNumero_dependentes(6);
		c.setIdade(25);
		assertEquals(0,0,this.imp.calculaImpostoCompleto());
	}
	
	
	/**
	 * BASE DE CALCULO ENTRE 12000 E 24000
	 * */
	
	@Test
	public void testCalculoImpostoCompleto8(){
		c.setContribuicao_oficial(20000.0);
		c.setTotal_rendimentos(40000.0);
		c.setNumero_dependentes(7);
		c.setIdade(25);
		assertEquals(1050,00 ,this.imp.calculaImpostoCompleto());
	}
	
	
	/**
	 * BASE DE CALCULO MAIOR QUE 24000
	 * */
	
	@Test
	public void testCalculoImpostoCompleto9(){
		c.setContribuicao_oficial(32000.0);
		c.setTotal_rendimentos(850000.0);
		c.setNumero_dependentes(8);
		c.setIdade(25);
		assertEquals(14125,00,this.imp.calculaImpostoCompleto());
	}
	

	
	//--------------------IDADE >= 65--------------------//
	
	//--------------------ATÉ 2 DEPENDENTES--------------------//
	
	/**
	 * BASE DE CALCULO MENOR QUE 12000
	 * */
	
	@Test
	public void testCalculoImpostoCompleto10(){
		c.setContribuicao_oficial(3500.0);
		c.setTotal_rendimentos(5000.0);
		c.setNumero_dependentes(2);
		c.setIdade(75);
		assertEquals(0,0,this.imp.calculaImpostoCompleto());
	}
	
	
	/**
	 * BASE DE CALCULO ENTRE 12000 E 24000
	 * */
	
	@Test
	public void testCalculoImpostoCompleto11(){
		c.setContribuicao_oficial(20000.0);
		c.setTotal_rendimentos(40000.0);
		c.setNumero_dependentes(2);
		c.setIdade(85);
		assertEquals(1110,00 ,this.imp.calculaImpostoCompleto());
	}
	
	
	/**
	 * BASE DE CALCULO MAIOR QUE 24000
	 * */
	
	@Test
	public void testCalculoImpostoCompleto12(){
		c.setContribuicao_oficial(32000.0);
		c.setTotal_rendimentos(850000.0);
		c.setNumero_dependentes(1);
		c.setIdade(66);
		assertEquals(13449,25,this.imp.calculaImpostoCompleto());
	}
	
	//--------------------3 À 5 DEPENDENTES--------------------//
	
		/**
		 * BASE DE CALCULO MENOR QUE 12000
		 * */
		
		@Test
		public void testCalculoImpostoCompleto13(){
			c.setContribuicao_oficial(3500.0);
			c.setTotal_rendimentos(5000.0);
			c.setNumero_dependentes(4);
			c.setIdade(25);
			assertEquals(0,0,this.imp.calculaImpostoCompleto());
		}
		
		
		/**
		 * BASE DE CALCULO ENTRE 12000 E 24000
		 * */
		
		@Test
		public void testCalculoImpostoCompleto14(){
			c.setContribuicao_oficial(20000.0);
			c.setTotal_rendimentos(40000.0);
			c.setNumero_dependentes(3);
			c.setIdade(25);
			assertEquals(1065,00 ,this.imp.calculaImpostoCompleto());
		}
		
		
		/**
		 * BASE DE CALCULO MAIOR QUE 24000
		 * */
		
		@Test
		public void testCalculoImpostoCompleto15(){
			c.setContribuicao_oficial(32000.0);
			c.setTotal_rendimentos(850000.0);
			c.setNumero_dependentes(5);
			c.setIdade(25);
			assertEquals(17938,25,this.imp.calculaImpostoCompleto());
		}
		
		//--------------------MAIS DE 5 DEPENDENTES--------------------//
		
		/**
		 * BASE DE CALCULO MENOR QUE 12000
		 * */
		
		@Test
		public void testCalculoImpostoCompleto16(){
			c.setContribuicao_oficial(3500.0);
			c.setTotal_rendimentos(5000.0);
			c.setNumero_dependentes(6);
			c.setIdade(25);
			assertEquals(0,0,this.imp.calculaImpostoCompleto());
		}
		
		
		/**
		 * BASE DE CALCULO ENTRE 12000 E 24000
		 * */
		
		@Test
		public void testCalculoImpostoCompleto17(){
			c.setContribuicao_oficial(20000.0);
			c.setTotal_rendimentos(40000.0);
			c.setNumero_dependentes(7);
			c.setIdade(25);
			assertEquals(1020,00 ,this.imp.calculaImpostoCompleto());
		}
		
		
		/**
		 * BASE DE CALCULO MAIOR QUE 24000
		 * */
		
		@Test
		public void testCalculoImpostoCompleto18(){
			c.setContribuicao_oficial(32000.0);
			c.setTotal_rendimentos(850000.0);
			c.setNumero_dependentes(8);
			c.setIdade(25);
			assertEquals(12773,5,this.imp.calculaImpostoCompleto());		
		}
	
}
