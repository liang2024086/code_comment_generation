package methodEmbedding.Speaking_in_Tongues.S.LYD848;


import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.HashMap;

public class _Q_A {
	public static void main(String[] args) throws IOException {		
		BufferedReader br = new BufferedReader(new FileReader("A-small-attempt5.in"));
		PrintStream file = new PrintStream(new FileOutputStream("_Q_A_small_out.txt"));
				
		String s = "ejp mysljylc kd kxveddknmc re jsicpdrysi rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd de kr kd eoya kw aej tysr re ujdr lkgc jv";
		String p = "our language is impossible to understand there are twenty six factorial possibilities so it is okay if you want to just give up";

		HashMap<String, String> hm = new HashMap<String, String>();
		for (int i = 0; i < s.length(); ++i)
			hm.put(s.charAt(i)+"", p.charAt(i)+"");
		
		hm.put("z", "q");
		hm.put("q", "z");
		
		br.readLine();
		int i = 1;
    	String line;
    	while ((line=br.readLine())!=null) {  
    		// String[] tokens = line.trim().split("\\s+");
    		file.print("Case #" + i + ": ");
    		for (int j = 0; j < line.length(); ++j) {
    			String c = line.charAt(j)+"";
    			if (c != " ")
    				file.print(hm.get(c));
    			else
    				file.print(" ");
    		}
    		file.println();
    		++i;
    	}
	}	
}
