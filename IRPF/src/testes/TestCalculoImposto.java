package testes;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import main.*;


public class TestCalculoImposto {
	Double aux;
	Imposto imp;
	Contribuinte c;
	@Before
	public void setup() {
		c = new Contribuinte("Rodrigo", "0253698209", 3500.0, 5000.0);
		imp = new Imposto(c);
		
	}
	
	@Test
	public void testCalculoImpostoSimples(){
		assertEquals(0,0,this.imp.calculaImpostoSimplificado());
	}
	
	@Test
	public void testCalculoImpostoSimples2(){
		c.setContribuicao_oficial(20000.0);
		c.setTotal_rendimentos(40000.0);
		assertEquals(1050,0,this.imp.calculaImpostoSimplificado());
	}

	@Test
	public void testCalculoImpostoSimples3(){
		c.setContribuicao_oficial(32000.0);
		c.setTotal_rendimentos(850000.0);
		assertEquals(12998,75,this.imp.calculaImpostoSimplificado());
	}
	
	@Test
	public void testCalculoImpostoCompleto(){
		c.setContribuicao_oficial(3500.0);
		c.setTotal_rendimentos(5000.0);
		c.setNumero_dependentes(2);
		c.setIdade(25);
		assertEquals(0,0,this.imp.calculaImpostoCompleto());
	}
	
	@Test
	public void testCalculoImpostoCompleto2(){
		c.setContribuicao_oficial(20000.0);
		c.setTotal_rendimentos(40000.0);
		c.setNumero_dependentes(2);
		c.setIdade(25);
		assertEquals(1140,00 ,this.imp.calculaImpostoCompleto());
	}

	@Test
	public void testCalculoImpostoCompleto3(){
		c.setContribuicao_oficial(32000.0);
		c.setTotal_rendimentos(850000.0);
		c.setNumero_dependentes(2);
		c.setIdade(25);
		assertEquals(13674,50,this.imp.calculaImpostoCompleto());
	}
	
	
	
}
