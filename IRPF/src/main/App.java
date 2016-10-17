package main;

import java.math.BigDecimal;
import java.util.Scanner;

public class App {

	private static Imposto imp;
	private static Scanner entrada;
	private String nome;
	private String cpf;
	private static Double imposto;

	public static void main(String[] args) {

		Contribuinte contribuinte = new Contribuinte("Rodrigo ", "02536982009");
		contribuinte.setContribuicao_oficial(35000.00);
		contribuinte.setTotal_rendimentos(55000.00);
		imp = new Imposto(contribuinte);
		imposto = imp.calculaImpostoSimplificado(contribuinte);

	}
}
