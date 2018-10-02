package methodEmbedding.Speaking_in_Tongues.S.LYD578;


import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SpeakingInTongues {
	static List<String> gesamtListe = new ArrayList<String>();
	
	public static void main(String[] args) {
		String path = "D://A-small-attempt0.in";
		String line;
		StringBuilder sb = new StringBuilder();
		HashMap<String, String> hm = new HashMap<String, String>();
		
	    try {
	       BufferedReader input = new BufferedReader(new InputStreamReader(new FileInputStream(path)));
	       while( (line = input.readLine()) !=null) {
	    	   gesamtListe.add(line);
	       }
	       
	       hm.put("y", "a");
	       hm.put("n", "b");
	       hm.put("f", "c");
	       hm.put("i", "d");
	       hm.put("c", "e");
	       hm.put("w", "f");
	       hm.put("l", "g");
	       hm.put("b", "h");
	       hm.put("k", "i");
	       hm.put("u", "j");
	       hm.put("o", "k");
	       hm.put("m", "l");
	       hm.put("x", "m");
	       hm.put("s", "n");
	       hm.put("e", "o");
	       hm.put("v", "p");
	       hm.put("z", "q");
	       hm.put("p", "r");
	       hm.put("d", "s");
	       hm.put("r", "t");
	       hm.put("j", "u");
	       hm.put("g", "v");
	       hm.put("t", "w");
	       hm.put("h", "x");
	       hm.put("a", "y");
	       hm.put("q", "z");
	       hm.put(" ", " ");
	       
	       int cases = Integer.parseInt(gesamtListe.get(0));
	       
	       for (int i = 1; i <= cases; i++) {
	    	   char[] charArray = gesamtListe.get(i).toCharArray();
		       
		       String tmpString = "";
		       
		       for(int j = 0; j<gesamtListe.get(i).length(); j++){
		    	   tmpString += hm.get(String.valueOf(charArray[j]));
		       }
		       
		       sb.append("Case #" + i + ": " + tmpString + "\n");
		       
		       
		       
	    	}
	       System.out.println(sb.toString());
	       
	    	} catch (FileNotFoundException e1) {
	       // die Datei existiert nicht
	       System.err.println("Datei nicht gefunden: ");
	    	} catch (IOException e2) {
	       // andere IOExceptions abfangen.
	       e2.printStackTrace();
    	}
    }
}
