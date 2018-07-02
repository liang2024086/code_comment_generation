package methodEmbedding.Speaking_in_Tongues.S.LYD1009;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;


public class Googlerese {
	
	public static void main (String[] args) throws FileNotFoundException, IOException  {
		HashMap<String, String> translate= new HashMap<String, String>();
		translate.put("a", "y");
		translate.put("b", "h");
		translate.put("c", "e");
		translate.put("d", "s");
		translate.put("e", "o");
		translate.put("f", "c");
		translate.put("g", "v");
		translate.put("h", "x");
		translate.put("i", "d");
		translate.put("j", "u");
		translate.put("k", "i");
		translate.put("l", "g");
		translate.put("m", "l");
		translate.put("n", "b");
		translate.put("o", "k");
		translate.put("p", "r");
		translate.put("q", "z");
		translate.put("r", "t");
		translate.put("s", "n");
		translate.put("t", "w");
		translate.put("u", "j");
		translate.put("v", "p");
		translate.put("w", "f");
		translate.put("x", "m");
		translate.put("y", "a");
		translate.put("z", "q");
		translate.put(" ", " ");
		
		int t = 0;
		FileInputStream fstream = new FileInputStream(new File(args[0]));
		DataInputStream in = new DataInputStream(fstream);
		BufferedReader br = new BufferedReader(new InputStreamReader(in));
		String line = br.readLine();
		t = Integer.parseInt(line);
		System.out.println(t);
		String output;
		FileWriter fw = new FileWriter(new File("A-small-attempt0.out"));
		for(int i = 0; i < t; i++) {
			line = br.readLine();
			System.out.println(line);
			output = "Case #" + (i + 1) + ": ";
			for(int j = 0; j < line.length(); j++){
				System.out.println(translate.get(line.substring(j,j+1)));
				output = output.concat(translate.get(line.substring(j,j+1)));
			}
			output = output.concat("\n");
			fw.write(output);
		}
		fw.flush();
	}

}
