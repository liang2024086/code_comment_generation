package methodEmbedding.Revenge_of_the_Pancakes.S.LYD21;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class B {

    private static String CASE_SHARP = "Case #";
    private static String COLON = ": ";

    /**
     * Main method
     * 
     * @param args
     */
    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);

	// Read Number of Tests
	int t = Integer.valueOf(in.nextLine());

	// Por cada caso de test
	for (int i = 1; i <= t; ++i) {
	    // Preparamos el texto estandar de cada resultado
	    StringBuilder caseResult = new StringBuilder();
	    caseResult.append(CASE_SHARP).append(i).append(COLON);

	    // Obtenemos los pankakes del caso de prueba
	    String pankakes = in.nextLine();

	    if (!pankakes.contains("-")) {
		caseResult.append(0);
	    } else if (!pankakes.contains("+")) {
		caseResult.append(1);
	    } else {

		char[] trozos = pankakes.toCharArray();
		int cont = 0;
		List<String> lista = null;
		for (int j = 0; j < trozos.length; j++) {
		    String pankake = String.valueOf(trozos[j]);
		    if (lista == null) {
			lista = new ArrayList<String>();
			lista.add(pankake);
		    } else if (!lista.get(cont).equals(pankake)) {
			cont++;
			lista.add(pankake);
		    }
		}

		if (lista.get(lista.size() - 1).equals("+")) {
		    caseResult.append(lista.size() - 1);
		} else {
		    caseResult.append(lista.size());
		}
	    }

	    System.out.println(caseResult);
	}
	in.close();
    }
}
