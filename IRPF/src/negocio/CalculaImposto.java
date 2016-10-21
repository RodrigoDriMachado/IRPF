package negocio;

import java.util.ArrayList;

public class CalculaImposto {
	
	private static CalculaImposto calcImp = null;
	//private static int simples;
	
	
	 private CalculaImposto() {
	    //   this.simples = 1;
	    }
	
	 public static CalculaImposto getInstance() {
	        if (calcImp == null) {
	        	calcImp = new CalculaImposto();
	        }
	        return calcImp;
	    }

	
	
}
