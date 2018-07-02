package methodEmbedding.Speaking_in_Tongues.S.LYD829;

import java.util.*;
import java.io.*;

public class q1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		File file = new File("C:/Users/Raja/workspace/GCJ/src/in.txt");
		
		Map<String, String> m = new HashMap<String,String>();
		m.put("a", "y");
		m.put("b", "h");
		m.put("c", "e");
		m.put("d", "s");
		m.put("e", "o");
		m.put("f", "c");
		m.put("g", "v");
		m.put("h", "x");
		m.put("i", "d");
		m.put("j", "u");
		m.put("k", "i");
		m.put("l", "g");
		m.put("m", "l");
		m.put("n", "b");
		m.put("o", "k");
		m.put("p", "r");
		m.put("q", "z");
		m.put("r", "t");
		m.put("s", "n");
		m.put("t", "w");
		m.put("u", "j");
		m.put("v", "p");
		m.put("w", "f");
		m.put("x", "m");
		m.put("y", "a");
		m.put("z", "q");
		m.put(" ", " ");
		
		try{
			Scanner s = new Scanner(file);
			int num = Integer.parseInt(s.nextLine());
			String line = new String();
			for (int i = 0;i<num;i++){
				line = s.nextLine();
				System.out.print("Case #"+(i+1)+": ");
				for (int j = 0;j<line.length();j++){
					System.out.print(m.get(line.substring(j,j+1)));
				}
				System.out.println();
			}
		}
		catch (FileNotFoundException e){
			e.printStackTrace();
		}
		

	}

}
