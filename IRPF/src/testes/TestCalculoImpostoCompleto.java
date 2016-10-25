package testes;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import negocio.CadastroContribuinte;
import negocio.CalculaImposto;
import negocio.ImpostoSimples;


public class TestCalculoImpostoCompleto {
	
	private CadastroContribuinte cadContribuinte;
	private CalculaImposto calcImp;
	
	@Before
	public void setup() {
		Double aux;
		 this.cadContribuinte = new CadastroContribuinte();
		 this.calcImp = new CalculaImposto();
		 this.cadContribuinte.cadastraContribuinte("Rodrigo",  "0253698209");
	}
	

	
	//--------------------IDADE < 65--------------------//
	
	//--------------------ATÉ 2 DEPENDENTES--------------------//
	
	/**
	 * BASE DE CALCULO MENOR QUE 12000
	 * */
	
	@Test
	public void testCalculoImpostoCompleto(){
		this.cadContribuinte.setContribuicaoOficial("Rodrigo", 3500.0);
		this.cadContribuinte.setRendimentos("Rodrigo", 5000.0);
		this.cadContribuinte.setIdade("Rodrigo",36);
		this.cadContribuinte.setNumDependentes("Rodrigo", 2);
		assertEquals(0,0,calcImp.calculaInmpostoCompleto(cadContribuinte.pesquisaContribuinte("Rodrigo")));
	}
	
	
	/**
	 * BASE DE CALCULO ENTRE 12000 E 24000
	 * */
	
	@Test
	public void testCalculoImpostoCompleto2(){
		this.cadContribuinte.setContribuicaoOficial("Rodrigo", 20000.0);
		this.cadContribuinte.setRendimentos("Rodrigo", 40000.0);
		this.cadContribuinte.setIdade("Rodrigo",35);
		this.cadContribuinte.setNumDependentes("Rodrigo", 1);
		assertEquals(1140,00,calcImp.calculaInmpostoCompleto(cadContribuinte.pesquisaContribuinte("Rodrigo")));
	}
	
	
	/**
	 * BASE DE CALCULO MAIOR QUE 24000
	 * */
	
	@Test
	public void testCalculoImpostoCompleto3(){
		this.cadContribuinte.setContribuicaoOficial("Rodrigo", 32000.0);
		this.cadContribuinte.setRendimentos("Rodrigo", 850000.0);
		this.cadContribuinte.setIdade("Rodrigo",47);
		this.cadContribuinte.setNumDependentes("Rodrigo", 2);
		assertEquals(13674,50,calcImp.calculaInmpostoCompleto(cadContribuinte.pesquisaContribuinte("Rodrigo")));
	}
	
	//--------------------3 À 5 DEPENDENTES--------------------//
	
	/**
	 * BASE DE CALCULO MENOR QUE 12000
	 * */
	
	@Test
	public void testCalculoImpostoCompleto4(){
		this.cadContribuinte.setContribuicaoOficial("Rodrigo", 3500.0);
		this.cadContribuinte.setRendimentos("Rodrigo", 5000.0);
		this.cadContribuinte.setIdade("Rodrigo",21);
		this.cadContribuinte.setNumDependentes("Rodrigo", 3);
		assertEquals(0,0,calcImp.calculaInmpostoCompleto(cadContribuinte.pesquisaContribuinte("Rodrigo")));
	}
	
	
	/**
	 * BASE DE CALCULO ENTRE 12000 E 24000
	 * */
	
	@Test
	public void testCalculoImpostoCompleto5(){
		this.cadContribuinte.setContribuicaoOficial("Rodrigo", 20000.0);
		this.cadContribuinte.setRendimentos("Rodrigo", 40000.0);
		this.cadContribuinte.setIdade("Rodrigo",42);
		this.cadContribuinte.setNumDependentes("Rodrigo", 4);
		assertEquals(1095,00,calcImp.calculaInmpostoCompleto(cadContribuinte.pesquisaContribuinte("Rodrigo")));
		}
	
	
	/**
	 * BASE DE CALCULO MAIOR QUE 24000
	 * */
	
	@Test
	public void testCalculoImpostoCompleto6(){
		
		this.cadContribuinte.setContribuicaoOficial("Rodrigo", 32000.0);
		this.cadContribuinte.setRendimentos("Rodrigo", 850000.0);
		this.cadContribuinte.setIdade("Rodrigo",19);
		this.cadContribuinte.setNumDependentes("Rodrigo", 5);
		assertEquals(13336,625,calcImp.calculaInmpostoCompleto(cadContribuinte.pesquisaContribuinte("Rodrigo")));
	}
	
	//--------------------MAIS DE 5 DEPENDENTES--------------------//
	
	/**
	 * BASE DE CALCULO MENOR QUE 12000
	 * */
	
	@Test
	public void testCalculoImpostoCompleto7(){
		this.cadContribuinte.setContribuicaoOficial("Rodrigo", 3500.0);
		this.cadContribuinte.setRendimentos("Rodrigo", 5000.0);
		this.cadContribuinte.setIdade("Rodrigo",37);
		this.cadContribuinte.setNumDependentes("Rodrigo", 6);
		assertEquals(0,0,calcImp.calculaInmpostoCompleto(cadContribuinte.pesquisaContribuinte("Rodrigo")));
	}
	
	
	/**
	 * BASE DE CALCULO ENTRE 12000 E 24000
	 * */
	
	@Test
	public void testCalculoImpostoCompleto8(){
		this.cadContribuinte.setContribuicaoOficial("Rodrigo", 20000.0);
		this.cadContribuinte.setRendimentos("Rodrigo", 40000.0);
		this.cadContribuinte.setIdade("Rodrigo",55);
		this.cadContribuinte.setNumDependentes("Rodrigo", 7);
		assertEquals(1050,00 ,calcImp.calculaInmpostoCompleto(cadContribuinte.pesquisaContribuinte("Rodrigo")));
	}
	
	
	/**
	 * BASE DE CALCULO MAIOR QUE 24000
	 * */
	
	@Test
	public void testCalculoImpostoCompleto9(){
		this.cadContribuinte.setContribuicaoOficial("Rodrigo", 32000.0);
		this.cadContribuinte.setRendimentos("Rodrigo", 850000.0);
		this.cadContribuinte.setIdade("Rodrigo",53);
		this.cadContribuinte.setNumDependentes("Rodrigo", 8);
		assertEquals(14125,00,calcImp.calculaInmpostoCompleto(cadContribuinte.pesquisaContribuinte("Rodrigo")));
	}
	

	
	//--------------------IDADE >= 65--------------------//
	
	//--------------------ATÉ 2 DEPENDENTES--------------------//
	
	/**
	 * BASE DE CALCULO MENOR QUE 12000
	 * */
	
	@Test
	public void testCalculoImpostoCompleto10(){
		this.cadContribuinte.setContribuicaoOficial("Rodrigo", 3500.0);
		this.cadContribuinte.setRendimentos("Rodrigo", 5000.0);
		this.cadContribuinte.setIdade("Rodrigo",65);
		this.cadContribuinte.setNumDependentes("Rodrigo", 1);
		assertEquals(0,0,calcImp.calculaInmpostoCompleto(cadContribuinte.pesquisaContribuinte("Rodrigo")));
	}
	
	
	/**
	 * BASE DE CALCULO ENTRE 12000 E 24000
	 * */
	
	@Test
	public void testCalculoImpostoCompleto11(){
		this.cadContribuinte.setContribuicaoOficial("Rodrigo", 20000.0);
		this.cadContribuinte.setRendimentos("Rodrigo", 40000.0);
		this.cadContribuinte.setIdade("Rodrigo",85);
		this.cadContribuinte.setNumDependentes("Rodrigo", 2);
		assertEquals(1110,00,calcImp.calculaInmpostoCompleto(cadContribuinte.pesquisaContribuinte("Rodrigo")));
	}
	
	
	/**
	 * BASE DE CALCULO MAIOR QUE 24000
	 * */
	
	@Test
	public void testCalculoImpostoCompleto12(){
		this.cadContribuinte.setContribuicaoOficial("Rodrigo", 32000.0);
		this.cadContribuinte.setRendimentos("Rodrigo", 850000.0);
		this.cadContribuinte.setIdade("Rodrigo",1);
		this.cadContribuinte.setNumDependentes("Rodrigo", 66);
		assertEquals(13449,25,calcImp.calculaInmpostoCompleto(cadContribuinte.pesquisaContribuinte("Rodrigo")));
	}
	
	//--------------------3 À 5 DEPENDENTES--------------------//
	
		/**
		 * BASE DE CALCULO MENOR QUE 12000
		 * */
		
		@Test
		public void testCalculoImpostoCompleto13(){
			this.cadContribuinte.setContribuicaoOficial("Rodrigo", 3500.0);
			this.cadContribuinte.setRendimentos("Rodrigo", 5000.0);
			this.cadContribuinte.setIdade("Rodrigo",65);
			this.cadContribuinte.setNumDependentes("Rodrigo", 4);
			assertEquals(0,0,calcImp.calculaInmpostoCompleto(cadContribuinte.pesquisaContribuinte("Rodrigo")));
		}
		
		
		/**
		 * BASE DE CALCULO ENTRE 12000 E 24000
		 * */
		
		@Test
		public void testCalculoImpostoCompleto14(){
			this.cadContribuinte.setContribuicaoOficial("Rodrigo", 20000.0);
			this.cadContribuinte.setRendimentos("Rodrigo", 40000.0);
			this.cadContribuinte.setIdade("Rodrigo",85);
			this.cadContribuinte.setNumDependentes("Rodrigo", 3);
			assertEquals(1065,00,calcImp.calculaInmpostoCompleto(cadContribuinte.pesquisaContribuinte("Rodrigo")));
		}
		
		
		/**
		 * BASE DE CALCULO MAIOR QUE 24000
		 * */
		
		@Test
		public void testCalculoImpostoCompleto15(){
			this.cadContribuinte.setContribuicaoOficial("Rodrigo", 32000.0);
			this.cadContribuinte.setRendimentos("Rodrigo", 850000.0);
			this.cadContribuinte.setIdade("Rodrigo",5);
			this.cadContribuinte.setNumDependentes("Rodrigo", 66);
			assertEquals(17938,25,calcImp.calculaInmpostoCompleto(cadContribuinte.pesquisaContribuinte("Rodrigo")));
		}
		
		//--------------------MAIS DE 5 DEPENDENTES--------------------//
		
		/**
		 * BASE DE CALCULO MENOR QUE 12000
		 * */
		
		@Test
		public void testCalculoImpostoCompleto16(){
			this.cadContribuinte.setContribuicaoOficial("Rodrigo", 3500.0);
			this.cadContribuinte.setRendimentos("Rodrigo", 5000.0);
			this.cadContribuinte.setIdade("Rodrigo",65);
			this.cadContribuinte.setNumDependentes("Rodrigo", 6);
			assertEquals(0,0,calcImp.calculaInmpostoCompleto(cadContribuinte.pesquisaContribuinte("Rodrigo")));
		}
		
		
		/**
		 * BASE DE CALCULO ENTRE 12000 E 24000
		 * */
		
		@Test
		public void testCalculoImpostoCompleto17(){
			this.cadContribuinte.setContribuicaoOficial("Rodrigo", 20000.0);
			this.cadContribuinte.setRendimentos("Rodrigo", 40000.0);
			this.cadContribuinte.setIdade("Rodrigo",85);
			this.cadContribuinte.setNumDependentes("Rodrigo", 7);
			assertEquals(1020,00,calcImp.calculaInmpostoCompleto(cadContribuinte.pesquisaContribuinte("Rodrigo")));
		}
		
		
		/**
		 * BASE DE CALCULO MAIOR QUE 24000
		 * */
		
		@Test
		public void testCalculoImpostoCompleto18(){
			this.cadContribuinte.setContribuicaoOficial("Rodrigo", 32000.0);
			this.cadContribuinte.setRendimentos("Rodrigo", 850000.0);
			this.cadContribuinte.setIdade("Rodrigo",8);
			this.cadContribuinte.setNumDependentes("Rodrigo", 66);
			assertEquals(12773,5,calcImp.calculaInmpostoCompleto(cadContribuinte.pesquisaContribuinte("Rodrigo")));	
		}
	
}
