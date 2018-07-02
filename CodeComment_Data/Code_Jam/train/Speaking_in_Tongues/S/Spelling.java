package methodEmbedding.Speaking_in_Tongues.S.LYD215;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Hashtable;

public class Spelling {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//read the file
		String filename = "A-small-practice.in";
		
		//create the hashtable
		Hashtable<String, String> conversion = new Hashtable<String, String>();
		conversion.put("a", "y");
		conversion.put("b", "h");
		conversion.put("c", "e");
		conversion.put("d", "s");
		conversion.put("e", "o");
		conversion.put("f", "c");
		conversion.put("g", "v");
		conversion.put("h", "x");
		conversion.put("i", "d");
		conversion.put("j", "u");
		conversion.put("k", "i");
		conversion.put("l", "g");
		conversion.put("m", "l");
		conversion.put("n", "b");
		conversion.put("o", "k");
		conversion.put("p", "r");
		conversion.put("q", "z");
		conversion.put("r", "t");
		conversion.put("s", "n");
		conversion.put("t", "w");
		conversion.put("u", "j");
		conversion.put("v", "p");
		conversion.put("w", "f");
		conversion.put("x", "m");
		conversion.put("y", "a");
		conversion.put("z", "q");
		
		FileInputStream fstream = new FileInputStream(filename);

		DataInputStream in = new DataInputStream(fstream);
		BufferedReader br = new BufferedReader(new InputStreamReader(in));
  
		String strLine = br.readLine();
		int cases = Integer.parseInt(strLine);

	  
		for (int i=0; i < cases; i++){
			strLine = br.readLine(); 
			String newLine = "";
			for (int j=0; j < strLine.length(); j++){
				String c = Character.toString(strLine.charAt(j));
				
				if (c.equals(" ")) newLine = newLine.concat(c);
				else{
					//System.out.println("c is: " +c + " conve:" +conversion.get(c));
					newLine = newLine.concat(conversion.get(c));
				}
			}
			int k = i+1;
			System.out.println("Case #" + k + ": " + newLine);
		}

	}

}
