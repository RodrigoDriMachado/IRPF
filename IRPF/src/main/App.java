package main;


import java.util.Scanner;

public class App {

	private static Imposto imp;
	private static String nome;
	private static String cpf;
	private static Double contribuicaoOficial;
	private static Double totalRendimentos;
	private static Double imposto;

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe seu Nome");
		nome = entrada.nextLine();
		System.out.println("Informe seu cpf");
		cpf = entrada.nextLine();
		System.out.println("Inform sua contribuicao oficial");
		contribuicaoOficial = entrada.nextDouble();
		System.out.println("Inform o total de seus rendimentos");
		totalRendimentos = entrada.nextDouble();
		
		Contribuinte contribuinte = new Contribuinte(nome, cpf, contribuicaoOficial, totalRendimentos);
		
		imp = new Imposto(contribuinte);
		imposto = imp.calculaImpostoSimplificado(contribuinte);
		System.out.println("O imposto a pagar é de: " + imposto);

	}
}
