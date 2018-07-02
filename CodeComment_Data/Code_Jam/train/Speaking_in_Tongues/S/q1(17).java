package methodEmbedding.Speaking_in_Tongues.S.LYD1661;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

public class q1 {
	
	public static final String FILE_NAME = "A-small-attempt0.in";
	public static final String FILE_OUT_NAME = "output.txt";
	
	static HashMap<String, String> ANTI_GOOGLE = new HashMap<String, String>();
	static{
		ANTI_GOOGLE.put(" ", " ");
		ANTI_GOOGLE.put("a", "y");
		ANTI_GOOGLE.put("b", "h");
		ANTI_GOOGLE.put("c", "e");
		ANTI_GOOGLE.put("d", "s");
		ANTI_GOOGLE.put("e", "o");
		ANTI_GOOGLE.put("f", "c");
		ANTI_GOOGLE.put("g", "v");
		ANTI_GOOGLE.put("h", "x");
		ANTI_GOOGLE.put("i", "d");
		ANTI_GOOGLE.put("j", "u");
		ANTI_GOOGLE.put("k", "i");
		ANTI_GOOGLE.put("l", "g");
		ANTI_GOOGLE.put("m", "l");
		ANTI_GOOGLE.put("n", "b");
		ANTI_GOOGLE.put("o", "k");
		ANTI_GOOGLE.put("p", "r");
		ANTI_GOOGLE.put("q", "z");
		ANTI_GOOGLE.put("r", "t");
		ANTI_GOOGLE.put("s", "n");
		ANTI_GOOGLE.put("t", "w");
		ANTI_GOOGLE.put("u", "j");
		ANTI_GOOGLE.put("v", "p");
		ANTI_GOOGLE.put("w", "f");
		ANTI_GOOGLE.put("x", "m");
		ANTI_GOOGLE.put("y", "a");
		ANTI_GOOGLE.put("z", "q");
	}
	/*
ejp mysljylc kd kxveddknmc re jsicpdrysi
rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd
de kr kd eoya kw aej tysr re ujdr lkgc jv

our language is impossible to understand
there are twenty six factorial possibilities
so it is okay if you want to just give up
	 */

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FileReader reader;
		FileWriter writer;
		try {
			reader = new FileReader(FILE_NAME);
			writer = new FileWriter(FILE_OUT_NAME);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			return;
		} catch(IOException e){
			e.printStackTrace();
			return;
		}
		
		BufferedReader r = new BufferedReader(reader);
		BufferedWriter w = new BufferedWriter(writer);
		
		String entriesString;
		int entries;
		try {
			entriesString = r.readLine();
			entries = Integer.parseInt(entriesString);
		} catch (IOException e) {
			e.printStackTrace();
			return;
		}
		
		for(int i=0; i<entries; i++){

			String curLine;
			try {
				curLine = r.readLine();

				w.write("Case #"+(i+1)+": ");
				for(int j=0; j<curLine.length(); j++){
					char curChar = curLine.charAt(j);
					System.out.println("idx "+j+" "+curChar);
					String curCharString = Character.toString(curChar);
					String decipherdChar = ANTI_GOOGLE.get(curCharString);
					if(decipherdChar == null){
						System.out.println("Not found "+curCharString);
					}
					w.write(decipherdChar);
				}
				w.newLine();
				w.flush();
				
			} catch (IOException e) {
				e.printStackTrace();
				return;
			}
		}
		
		try{
			r.close();
		} catch(IOException e){
			e.printStackTrace();
			return;
		} finally{
			try{
				w.close();
			} catch(IOException e){
				e.printStackTrace();
				return;
			}
		}
		

	}

}
