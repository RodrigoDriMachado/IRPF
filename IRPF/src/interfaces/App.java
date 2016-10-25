package interfaces;

import java.util.Scanner;
import negocio.CadastroContribuinte;
import negocio.CalculaImposto;

public class App {

	private static String nome;
	private static String cpf;
	private static int idade;
	private static int numDependentes;
	private static Double contribuicaoOficial;
	private static Double totalRendimentos;
	private static Double imposto;

	public static void main(String[] args) {

		CadastroContribuinte cadContribuinte = new CadastroContribuinte();
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe a operacao desejada: ");
		System.out.println("1 - Cadastrar Contribuinte");
		System.out.println("2 - Declaracao Simples ");
		System.out.println("3 - Declaracao Completa ");

		int operacao;
		operacao = entrada.nextInt();

		while (operacao > 0 && operacao <= 3) {

			switch (operacao) {
			case 1:

				System.out.println("Informe seu nome");
				nome = entrada.next();

				System.out.println("Informe seu cpf");
				cpf = entrada.next();

				cadContribuinte.cadastraContribuinte(nome, cpf);

				System.out.println("");
				System.out.println("Digite a operacao que deseja efetuar: ");
				System.out.println("1 - Cadastrar Contribuinte");
				System.out.println("2 - Declaracao Simples ");
				System.out.println("3 - Declaracao Completa ");
				System.out.println("4 - Sair: ");

				operacao = entrada.nextInt();

				break;

			case 2:

				System.out.println("Informe seu nome");
				nome = entrada.next();
				
				System.out.println("Inform sua contribuicao oficial");
				contribuicaoOficial = entrada.nextDouble();

				System.out.println("Inform o total de seus rendimentos");
				totalRendimentos = entrada.nextDouble();
				
				cadContribuinte.pesquisaContribuinte(nome).setContribuicao_oficial(contribuicaoOficial);
				cadContribuinte.pesquisaContribuinte(nome).setTotal_rendimentos(totalRendimentos);
			
				CalculaImposto calcImp = new CalculaImposto();
				imposto = calcImp.calculaInmpostoSimples(cadContribuinte.pesquisaContribuinte(nome));
				System.out.println("O imposto a pagar é de: " + imposto);

				System.out.println("");
				System.out.println("Digite a operacao que deseja efetuar: ");
				System.out.println("1 - Cadastrar Contribuinte");
				System.out.println("2 - Declaracao Simples ");
				System.out.println("3 - Declaracao Completa ");
				System.out.println("4 - Sair: ");

				operacao = entrada.nextInt();

			case 3:

				System.out.println("Informe seu nome");
				nome = entrada.next();
				
				System.out.println("Inform sua idade");
				idade = entrada.nextInt();

				System.out.println("Inform o numero de dependetes");
				numDependentes = entrada.nextInt();
				
				System.out.println("Inform sua contribuicao oficial");
				contribuicaoOficial = entrada.nextDouble();

				System.out.println("Inform o total de seus rendimentos");
				totalRendimentos = entrada.nextDouble();
				
				cadContribuinte.pesquisaContribuinte(nome).setContribuicao_oficial(contribuicaoOficial);
				cadContribuinte.pesquisaContribuinte(nome).setTotal_rendimentos(totalRendimentos);
				cadContribuinte.pesquisaContribuinte(nome).setIdade(idade);
				cadContribuinte.pesquisaContribuinte(nome).setNumero_dependentes(numDependentes);
					
				calcImp = new CalculaImposto();
				imposto = calcImp.calculaInmpostoCompleto(cadContribuinte.pesquisaContribuinte(nome));
				System.out.println("O imposto a pagar é de: " + imposto);

				System.out.println("");
				System.out.println("Digite a operacao que deseja efetuar: ");
				System.out.println("1 - Cadastrar Contribuinte");
				System.out.println("2 - Declaracao Simples ");
				System.out.println("3 - Declaracao Completa ");
				System.out.println("4 - Sair: ");

				operacao = entrada.nextInt();

			default:
				break;
			}
		}

	}
}
