package methodEmbedding.Speaking_in_Tongues.S.LYD727;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Scanner;

public class SpeakingInTongues {
	public static void main(String[] args) throws FileNotFoundException{
		
		//Building map
		HashMap<String,String> alphabet = new HashMap<String,String>();
		
		String  c1g = "ejp mysljylc kd kxveddknmc re jsicpdrysi";
		String  c2g = "rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd";
		String  c3g = "de kr kd eoya kw aej tysr re ujdr lkgc jv";
		
		String  c1s = "our language is impossible to understand";
		String  c2s = "there are twenty six factorial possibilities";
		String  c3s = "so it is okay if you want to just give up";
		
		alphabet.put("y", "a");
		alphabet.put("e", "o");
		alphabet.put("q", "z");

		// found also
		alphabet.put("z", "q");
	
		
		for (int i=0;i<c1s.length();i++){
			alphabet.put((c1g.charAt(i)+""), (c1s.charAt(i)+""));
		}
		
		for (int i=0;i<c2s.length();i++){
			alphabet.put((c2g.charAt(i)+""), (c2s.charAt(i)+""));
		}
		
		for (int i=0;i<c3s.length();i++){
			alphabet.put((c3g.charAt(i)+""), (c3s.charAt(i)+""));
		}
		/*		
		System.out.println(alphabet);
		System.out.println(alphabet.size());
		
		
		// used in finding missing
		
		String alfabetSt = "abcdefghijklmnopqrstuvwxyz";
		System.out.println(alfabetSt);
		System.out.println(alfabetSt.length());

		for (int i=0;i<alfabetSt.length();i++){
			if (alphabet.containsKey(alfabetSt.charAt(i)+""))
				System.out.println(alfabetSt.charAt(i)+" " + alphabet.get(alfabetSt.charAt(i)+""));
			else 
				System.out.println("Missing: " + alfabetSt.charAt(i)+"");
			
			if (!alphabet.containsValue(alfabetSt.charAt(i)+""))
				System.out.println("Missing map: " + alfabetSt.charAt(i)+"");
		} 
		
		
*/		
		Scanner in = new Scanner(new File("/Users/olvitole/Downloads/A-small-attempt1 (1).in"));
		int t = Integer.parseInt(in.nextLine());
		OutputStream outStr = new FileOutputStream("/Users/olvitole/Downloads/output.txt");
		PrintStream printOut = new PrintStream(outStr);
		for(int zz = 1; zz <= t;zz++){
			String input = in.nextLine().trim();
			String output = "";
			for (int i=0;i<input.length();i++){
				output = output + alphabet.get(input.charAt(i)+"");
			}
			//System.out.println("Case #"+ zz + ": " +  output);
			printOut.append("Case #"+ zz + ": " +  output +"\n");

		}

		System.setOut(printOut);
		
	}
	
}
