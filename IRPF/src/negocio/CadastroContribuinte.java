package negocio;

import java.util.ArrayList;

public class CadastroContribuinte {

	private static Contribuinte contribuinte;
	private static ContribuinteDAO contribuinteDAO;
	private int idade;
	private String nome;
	private int numero_dependentes;
	private String cpf;

    public CadastroContribuinte() {
    	contribuinteDAO = new ContribuinteDAO();
    }
    
    public void cadastraContribuinte(String nome, String cpf){
    	this.contribuinte = new Contribuinte(nome, cpf);
    	contribuinteDAO.add(contribuinte);
    }
    
    public void removeContribuinte(String nome){
    	int aux;
    	aux = contribuinteDAO.pesquisaNodoCliente(nome);
    	if(aux!=0)
    	contribuinteDAO.removeContribuinte(aux);
    }
    
    public Contribuinte pesquisaContribuinte(String nome){
    	return contribuinteDAO.getContribuinte(nome);    	
    }
    
    public void setContribuicaoOficial(String nome, Double contribuicaoOf){
    	int aux;
    	aux = contribuinteDAO.pesquisaNodoCliente(nome);
    	if(aux!=0){
    		this.contribuinte = contribuinteDAO.getContribuinte(nome);
    	}
    	this.contribuinte.setContribuicao_oficial(contribuicaoOf);
    }
    
    public void setRendimentos(String nome, Double rendimentos){
    	int aux;
    	aux = contribuinteDAO.pesquisaNodoCliente(nome);
    	if(aux!=0){
    		this.contribuinte = contribuinteDAO.getContribuinte(nome);
    	}
    	this.contribuinte.setTotal_rendimentos(rendimentos);
    }
    
    public void setIdade(String nome, int idade){
    	int aux;
    	aux = contribuinteDAO.pesquisaNodoCliente(nome);
    	if(aux!=0){
    		this.contribuinte = contribuinteDAO.getContribuinte(nome);
    	}
    	this.contribuinte.setIdade(idade);
    }
    
    public void setNumDependentes(String nome, int numDependentes){
    	int aux;
    	aux = contribuinteDAO.pesquisaNodoCliente(nome);
    	if(aux!=0){
    		this.contribuinte = contribuinteDAO.getContribuinte(nome);
    	}
    	this.contribuinte.setNumero_dependentes(numDependentes);
    }

}
