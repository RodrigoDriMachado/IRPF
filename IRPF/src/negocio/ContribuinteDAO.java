package negocio;

import java.util.ArrayList;

public class ContribuinteDAO {

	private ArrayList<Contribuinte> listaContribuinte;
	private static ContribuinteDAO cad = null;

	public ContribuinteDAO() {
		listaContribuinte = new ArrayList<>();
	}

	public static ContribuinteDAO getInstance() {
		if (cad == null) {
			cad = new ContribuinteDAO();
		}
		return cad;
	}

	public void cleanAll() {
		listaContribuinte.clear();
	}

	public void add(Contribuinte contribuinte) {
		
		listaContribuinte.add(contribuinte);
		
	}

	public void removeContribuinte(int index) {
		listaContribuinte.remove(index);
	}

	public int pesquisaNodoCliente(String nome) {
		int aux = 0;
		for (int i = 0; i < listaContribuinte.size(); i++) {
			if (listaContribuinte.get(i).getNome().equals(nome)) {
				aux = listaContribuinte.indexOf(listaContribuinte.get(i));
			}
		}
		return aux;
	}

	public Contribuinte getContribuinte(String nome) {
		Contribuinte aux = null;
		for (int i = 0; i < listaContribuinte.size(); i++) {
			if (listaContribuinte.get(i).getNome().equals(nome)) {
				aux = listaContribuinte.get(i);
			}
		}
		return aux;
	}
	
	
}
