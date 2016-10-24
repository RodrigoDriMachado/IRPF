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
    	this.contribuinteDAO = this.contribuinteDAO.getInstance();
    }
    
    public void cadastraContribuinte(String nome, String cpf,int idade,  int nrDepn, Double contrOf, Double rend){
    	this.contribuinte = new Contribuinte(nome, cpf, idade, nrDepn, contrOf, rend);
    	contribuinteDAO.add(contribuinte);
    }
    
    public void removeContribuinte(String nome){
    	int aux;
    	aux = contribuinteDAO.pesquisaNodoCliente(nome);
    	if(aux!=0)
    	contribuinteDAO.removeContribuinte(aux);
    }
    
    public void setContribuicaoOficial(String nome, Double contribuicaoOf){
    	int aux;
    	aux = contribuinteDAO.pesquisaNodoCliente(nome);
    	if(aux!=0){
    		this.contribuinte = contribuinteDAO.pesquisaContribuinte(nome);
    	}
    	this.contribuinte.setContribuicao_oficial(contribuicaoOf);
    }
    
    public void setRendimentos(String nome, Double rendimentos){
    	int aux;
    	aux = contribuinteDAO.pesquisaNodoCliente(nome);
    	if(aux!=0){
    		this.contribuinte = contribuinteDAO.pesquisaContribuinte(nome);
    	}
    	this.contribuinte.setTotal_rendimentos(rendimentos);
    }
    
    public Contribuinte pesquisaContribuinte(String nome){
    	return contribuinteDAO.pesquisaContribuinte(nome);    	
    }


}
