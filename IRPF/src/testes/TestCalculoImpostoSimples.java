package testes;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import negocio.CadastroContribuinte;
import negocio.CalculaImposto;

public class TestCalculoImpostoSimples {
	
	private CadastroContribuinte cadContribuinte;
	private CalculaImposto calcImp;

	@Before
	public void setup() {
		Double aux;
		 this.cadContribuinte = new CadastroContribuinte();
		 this.calcImp = new CalculaImposto();
		 this.cadContribuinte.cadastraContribuinte("Rodrigo",  "0253698209");
	}
	
	@Test
	public void testCalculoImpostoSimples(){
		this.cadContribuinte.setContribuicaoOficial("Rodrigo", 3500.0);
		this.cadContribuinte.setRendimentos("Rodrigo", 5000.0);
		assertEquals(0,0,calcImp.calculaInmpostoSimples(cadContribuinte.pesquisaContribuinte("Rodrigo")));
	}
	

	@Test
	public void testCalculoImpostoSimples2(){
		this.cadContribuinte.setContribuicaoOficial("Rodrigo", 20000.0);
		this.cadContribuinte.setRendimentos("Rodrigo", 40000.0);
		assertEquals(1050,0,calcImp.calculaInmpostoSimples(cadContribuinte.pesquisaContribuinte("Rodrigo")));
	}


	@Test
	public void testCalculoImpostoSimples3(){
		this.cadContribuinte.setContribuicaoOficial("Rodrigo", 32000.0);
		this.cadContribuinte.setRendimentos("Rodrigo", 850000.0);
		assertEquals(12998,75,calcImp.calculaInmpostoSimples(cadContribuinte.pesquisaContribuinte("Rodrigo")));
	}
	

}
