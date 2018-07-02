package methodEmbedding.Speaking_in_Tongues.S.LYD273;

import java.io.*;
import java.lang.*;
import java.util.*;
class GCJ {
    public static void main(String[] args) {
		
		Map<String,String> d = new HashMap<String,String>();
		d.put("a","y");
		d.put("b","h");
		d.put("c","e");
		d.put("d","s");
		d.put("e","o");
		d.put("f","c");
		d.put("g","v");
		d.put("h","x");
		d.put("i","d");
		d.put("j","u");
		d.put("k","i");
		d.put("l","g");
		d.put("m","l");
		d.put("n","b");
		d.put("o","k");
		d.put("p","r");
		d.put("q","z");
		d.put("r","t");
		d.put("s","n");
		d.put("t","w");
		d.put("u","j");
		d.put("v","p");
		d.put("w","f");
		d.put("x","m");
		d.put("y","a");
		d.put("z","q");
		d.put(" "," ");
		
		try {
			PrintWriter out = new PrintWriter(new FileWriter("1.txt"));
			
			BufferedReader in = new BufferedReader(new FileReader("1.in")); 
			in.readLine();
			
			int counter = 1;
			while (in.ready()) { 
				String s = in.readLine();
				out.print("Case #" + Integer.toString(counter) + ": ");counter++;
				for(int i=0; i<s.length();i++) {
					out.print(d.get(Character.toString(s.charAt(i)))); // Display the string.
				}
				
				out.println();
			}

			in.close();
			out.close();
		
		} catch (IOException e) {
			System.err.println("Caught IOException: " + e.getMessage());
		}
    }
}

