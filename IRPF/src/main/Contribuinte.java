package main;

import java.math.BigDecimal;

public class Contribuinte {
	

	private int idade;
	private String nome;
	private int numero_dependentes;
	private String cpf;
	private BigDecimal contribuicao_oficial;
	private BigDecimal total_rendimentos;
	
	public Contribuinte(String nome, String cpf){
		this.nome = nome;
		this.cpf = cpf;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public int getNumero_dependentes() {
		return numero_dependentes;
	}

	public void setNumero_dependentes(int numero_dependentes) {
		this.numero_dependentes = numero_dependentes;
	}

	public String getCpf() {
		return cpf;
	}

	public BigDecimal getContribuicao_oficial() {
		return contribuicao_oficial;
	}

	public void setContribuicao_oficial(Double contribuicao_oficial) {
		this.contribuicao_oficial.valueOf(contribuicao_oficial);
	}

	public BigDecimal getTotal_rendimentos() {
		return total_rendimentos;
	}

	public void setTotal_rendimentos(Double total_rendimentos) {
		this.total_rendimentos.valueOf(total_rendimentos);
	}

}
