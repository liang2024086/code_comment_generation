package methodEmbedding.Speaking_in_Tongues.S.LYD1436;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;


public class q1 {
	public static void main(String[] args) throws Exception {
//		Map<String,String> cb = new HashMap<String,String>();
//		cb.put("y", "a");
//		cb.put("e", "o");
//		cb.put("q", "z");
		
		String p = "./src/";
		String ifile = p + "A-small-attempt0.in";
		String ofile = p + "A-small-attempt0.out";
		
		char a = 'a';
		int cbi[] = new int[26];
		cbi['q'-a] = 'z' - a;
	
		
		String sCode = new String("ejp mysljylc kd kxveddknmc re " +
				"jsicpdrysi rbcpc ypc rtcsra dkh wyfrepkym " +
				"veddknkmkrkcd de kr kd eoya kw aej tysr re " +
				"ujdr lkgc jv").replace(" ", "");
		
		String sMsg = new String("our language is impossible to understand " +
				"there are twenty six factorial possibilities " +
				"so it is okay if you want to just give up").replace(" ","");
		
//		System.out.println(sCode.length() + " " +  sMsg.length());
		
		int i = 0;
		while (i < sCode.length()) {	
			cbi[sCode.charAt(i) - a] = sMsg.charAt(i) - a;
			i++;
		}
		
		char cb[] = new char[26];
		
		int total = 0;
		int pos = 0;
		for (i = 0; i < 26; ++i) {
			total += cbi[i];
			
			if (cbi[i] == 0 && pos == 0 && i != 24) {
				pos = i;
			}
			
			cb[i] = (char)(a + cbi[i]);
		}
		
		cb[pos] = (char)(a + 25 * 13 - total);

		
//		for (i = 0; i < 26; ++i)
//			System.out.print(cb[i] + ",");
		
		
		BufferedReader in = new BufferedReader(new FileReader(ifile));
		StringBuilder os = new StringBuilder();
		
		String line = null;
		int ln = 0;
		
		in.readLine();
		
		while ((line = in.readLine()) != null) {
			os.append(String.format("Case #%d: ", ++ln));
			int j = 0;
			while (j < line.length()) {
				char c = line.charAt(j);
				
				if (c != ' ')
					os.append(cb[c-a]);
				else
					os.append(' ');
				j++;
			}
			os.append('\n');
		}
		
		in.close();
		
		
		Writer out = new BufferedWriter(new FileWriter(ofile));
		out.write(os.toString());
		out.close();
	}
	
	
	
	

}
