package methodEmbedding.Speaking_in_Tongues.S.LYD760;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;


public class Googleres {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		InputStreamReader converter = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(converter);
		HashMap<Character,Character> cambio = new HashMap<Character, Character>();
		cambio.put('a','y');
		cambio.put('b','h');
		cambio.put('c','e');
		cambio.put('d','s');
		cambio.put('e','o');
		cambio.put('f','c');
		cambio.put('g','v');
		cambio.put('h','x');
		cambio.put('i','d');
		cambio.put('j','u');
		cambio.put('k','i');
		cambio.put('l','g');
		cambio.put('m','l');
		cambio.put('n','b');
		cambio.put('o','k');
		cambio.put('p','r');
		cambio.put('q','z');
		cambio.put('r','t');
		cambio.put('s','n');
		cambio.put('t','w');
		cambio.put('u','j');
		cambio.put('v','p');
		cambio.put('w','f');
		cambio.put('x','m');
		cambio.put('y','a');
		cambio.put('z','q');
	    if (in == null) {
	      return;
	    }
	    String numTest = in.readLine();
	    int maxCases = Integer.valueOf(numTest);
	    Character replace;
	    for(int i =1;i<=maxCases;i++){
	    	String linea = in.readLine();
	    	char[] aLinea = linea.toCharArray();
	    	for(int j = 0; j< aLinea.length;j++){
	    		if((replace = cambio.get(aLinea[j]))!=null){
	    			aLinea[j] = replace;
	    		}

	    	}
	    	System.out.println("Case #"+i+": "+new String(aLinea));
	    }

	}

}
