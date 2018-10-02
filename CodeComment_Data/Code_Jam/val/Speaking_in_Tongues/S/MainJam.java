package methodEmbedding.Speaking_in_Tongues.S.LYD311;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Hashtable;


public class MainJam {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader in = new BufferedReader(new FileReader("C:\\Jam\\A-small-attempt0.in"));
		File file = new File("C:\\Jam\\saida.txt");
		FileWriter print = new FileWriter(file);
		
		int i = Integer.parseInt(in.readLine());
		
		Hashtable<String, String> hash = new Hashtable<String, String>();
		
		hash.put("a", "y");
		hash.put("b", "h");
		hash.put("c", "e");
		hash.put("d", "s");
		hash.put("e", "o");
		hash.put("f", "c");
		hash.put("g", "v");
		hash.put("h", "x");
		hash.put("i", "d");
		hash.put("j", "u");
		hash.put("k", "i");
		hash.put("l", "g");
		hash.put("m", "l");
		hash.put("n", "b");
		hash.put("o", "k");
		hash.put("p", "r");
		//hash.put("q", "");
		hash.put("r", "t");
		hash.put("s", "n");
		hash.put("t", "w");
		hash.put("u", "j");
		hash.put("v", "p");
		hash.put("x", "m");
		hash.put("z", "q");
		hash.put("k", "i");
		hash.put("w", "f");
		hash.put("y", "a");
		hash.put(" ", " ");
		
		int k = i;
		
		while(i > 0){
			
			String string = in.readLine();
			
			ArrayList<String> list = new ArrayList<String>();
			
			String saida = "";
			for(int j = 0; j < string.length(); j++){
				
				saida += hash.get(string.subSequence(j, j+1));
			}
			
			print.write("Case #"+ (k - i + 1) +": "+saida+System.getProperty("line.separator"));
			
			i--;
		}
		print.close();

	}

}
