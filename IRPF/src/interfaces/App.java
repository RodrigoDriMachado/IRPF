package interfaces;


import java.util.Scanner;

import negocio.Contribuinte;
import negocio.Imposto;

public class App {

	private static Imposto imp;
	private static String nome;
	private static String cpf;
	private static int idade;
	private static int  numDependentes;
	private static Double contribuicaoOficial;
	private static Double totalRendimentos;
	private static Double imposto;

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
			
		 System.out.println("Informe a operacao desejada: ");
		 System.out.println("1 - Declaracao Simples ");
		 System.out.println("2 - Declaracao Completa ");

		 int operacao;
		 operacao = entrada.nextInt();
		 
		switch (operacao) {
		case 1:
			
			System.out.println("Informe um nome");
			nome = entrada.next();
			
			System.out.println("Informe seu cpf");
			cpf = entrada.next();
			
			System.out.println("Inform sua contribuicao oficial");
			contribuicaoOficial = entrada.nextDouble();
			
			System.out.println("Inform o total de seus rendimentos");
			totalRendimentos = entrada.nextDouble();
			
			Contribuinte contribuinte = new Contribuinte(nome, cpf, contribuicaoOficial, totalRendimentos);
			
			imp = new Imposto(contribuinte);
			imposto = imp.calculaImpostoSimplificado();
			
			System.out.println("O imposto a pagar é de: " + imposto);
			
			break;

		case 2:
			
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
			
			Contribuinte contribuinte2 = new Contribuinte(nome, cpf, contribuicaoOficial, totalRendimentos);
			
			imp = new Imposto(contribuinte2);
			imposto = imp.calculaImpostoCompleto();
			System.out.println("O imposto a pagar é de: " + imposto);
			
		default:
			break;
		}

	}
}
