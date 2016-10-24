package interfaces;

import java.util.Scanner;
import negocio.CadastroContribuinte;
import negocio.CalculaImposto;


public class App {

	private static String nome;
	private static String cpf;
	private static int idade;
	private static int  numDependentes;
	private static Double contribuicaoOficial;
	private static Double totalRendimentos;
	private static Double imposto;

	public static void main(String[] args) {
		
		CadastroContribuinte cadC = new CadastroContribuinte(); 
		Scanner entrada = new Scanner(System.in);
		
			
		 System.out.println("Informe a operacao desejada: ");
		 System.out.println("1 - Cadastrar Contribuinte");
		 System.out.println("2 - Declaracao Simples ");
		 System.out.println("3 - Declaracao Completa ");

		 int operacao;
		 operacao = entrada.nextInt();
		 
		switch (operacao) {
		case 1:
			
			
			
			System.out.println("Informe um nome");
			nome = entrada.next();
			
			System.out.println("Informe seu cpf");
			cpf = entrada.next();
			
			System.out.println("Inform sua idade");
			idade = entrada.nextInt();
			
			System.out.println("Inform o numero de dependetes");
			numDependentes = entrada.nextInt();
			
			System.out.println("Inform sua contribuicao oficial");
			contribuicaoOficial = entrada.nextDouble();
			
			System.out.println("Inform o total de seus rendimentos");
			totalRendimentos = entrada.nextDouble();
			
			cadC.cadastraContribuinte(nome, cpf, idade, numDependentes, contribuicaoOficial, totalRendimentos);
			
			break;

		case 2:
			
			System.out.println("Informe um nome");
			nome = entrada.next();
			CalculaImposto calcImp = new CalculaImposto(cadC.pesquisaContribuinte(nome));
			imposto = calcImp.calculaInmpostoSimples();			
			System.out.println("O imposto a pagar é de: " + imposto);
			
			
		case 3:
			
			System.out.println("Informe um nome");
			nome = entrada.next();
			calcImp = new CalculaImposto(cadC.pesquisaContribuinte(nome));
			imposto = calcImp.calculaInmpostoSimples();			
			System.out.println("O imposto a pagar é de: " + imposto);
			
		default:
			break;
		}

	}
}
