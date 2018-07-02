package methodEmbedding.Speaking_in_Tongues.S.LYD1060;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Arrays;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class AlienLanguage {
	private static final Pattern SPACE = Pattern.compile(" ");
	
	public static void main(String[] args) {
		String S0 = "qzejp mysljylc kd kxveddknmc re jsicpdrysi";
		String S1 = "rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd";
		String S2 = "de kr kd eoya kw aej tysr re ujdr lkgc jv";
		String SS = S0 + S1 + S2;
		
		String T0 = "zqour language is impossible to understand";
		String T1 = "there are twenty six factorial possibilities";
		String T2 = "so it is okay if you want to just give up";
		String TT = T0 + T1 + T2;
		
		/*
		char[] cArray = SS.toCharArray();
		Arrays.sort(cArray);
	        for (char c : cArray)
	            System.out.print(c);
	        */

		try {
			BufferedReader input = new BufferedReader(new FileReader("A-small-attempt1.in"));
			BufferedWriter output = new BufferedWriter(new FileWriter("A-small-attempt1.out"));
			
			
			String line = input.readLine();
			int T = Integer.valueOf(line);
			
			for(int i=0; i<T; i++) {
			    output.write("Case #" + (i+1) + ": ");
			    line = input.readLine();
			    for(int j=0; j<line.length(); j++) {
				char c = line.charAt(j);
				int index = SS.indexOf(c);
				if(index>=0){
				    output.write(TT.charAt(index));
				} else {
				    output.write(' ');
				}
			    }
			    output.newLine();
			}			
			input.close();
			output.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
