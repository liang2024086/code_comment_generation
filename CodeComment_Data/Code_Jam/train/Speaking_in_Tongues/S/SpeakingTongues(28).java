package methodEmbedding.Speaking_in_Tongues.S.LYD1241;


import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.lang.StringBuffer;

public class SpeakingTongues {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		FileInputStream fstream;
		int i;
		int count;
		try {
			fstream = new FileInputStream("/home/rodrigo/Descargas/A-small-attempt0.in");
			DataInputStream in = new DataInputStream(fstream);
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			String strLine;
			
			count = Integer.parseInt(br.readLine());
			
			HashMap<String, String> hm1 = new HashMap();
			
			hm1.put("a","y");
			hm1.put("b","h");
			hm1.put("c","e");
			hm1.put("d","s");
			hm1.put("e","o");
			hm1.put("f","c");
			hm1.put("g","v");
			hm1.put("h","x");
			hm1.put("i","d");
			hm1.put("j","u");
			hm1.put("k","i");
			hm1.put("l","g");
			hm1.put("m","l");
			hm1.put("n","b");
			hm1.put("o","k");
			hm1.put("p","r");
			hm1.put("q","z");
			hm1.put("r","t");
			hm1.put("s","n");
			hm1.put("t","w");
			hm1.put("u","j");
			hm1.put("v","p");
			hm1.put("w","f");
			hm1.put("x","m");
			hm1.put("y","a");
			hm1.put("z","q");
			hm1.put(" "," ");
			
			
			FileWriter outFile = new FileWriter("/home/rodrigo/GoogleCodeJam/C-small.out");
            PrintWriter out = new PrintWriter(outFile);
			
			for (int z=1;z<=count;z++) {
				String linea = br.readLine();
				String lineakeypad = new String();
				
				
				char[] aCaracteres = linea.toCharArray();
				
				for (int y=0;y<aCaracteres.length;y++){
					  lineakeypad = new StringBuffer(lineakeypad).append(hm1.get(String.valueOf(aCaracteres[y]))).toString(); 
				}
				out.print("Case #"+z+": ");
				out.print(lineakeypad);
				out.println("");
				
			}
			
			out.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
