package negocio;

import java.util.ArrayList;

public class CadastroContribuinte {

	private ArrayList<Contribuinte> listaContribuinte;
	private static CadastroContribuinte cad = null;

    private CadastroContribuinte() {
        listaContribuinte = new ArrayList<>();
    }

    public static CadastroContribuinte getInstance() {
        if (cad == null) {
            cad = new CadastroContribuinte();
        }
        return cad;
    }

    public void cleanAll() {
        listaContribuinte.clear();
    }

    public void add(Contribuinte contribuinte) {
        listaContribuinte.add(contribuinte);
    }

	
}
