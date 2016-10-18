package negocio;


public class Contribuinte {
	

	private int idade;
	private String nome;
	private int numero_dependentes;
	private String cpf;
	private Double contribuicao_oficial;
	private Double total_rendimentos;
	
	public Contribuinte(String nome, String cpf, Double contribuicaoOficial, Double totalRendimentos){
		this.nome = nome;
		this.cpf = cpf;
		this.contribuicao_oficial = contribuicaoOficial;
		this.total_rendimentos = totalRendimentos;
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

	public Double getContribuicao_oficial() {
		return contribuicao_oficial;
	}

	public void setContribuicao_oficial(Double contribuicao_oficial) {
		this.contribuicao_oficial = contribuicao_oficial;
	}

	public Double getTotal_rendimentos() {
		return total_rendimentos;
	}

	public void setTotal_rendimentos(Double total_rendimentos) {
		this.total_rendimentos = total_rendimentos;
	}

}
