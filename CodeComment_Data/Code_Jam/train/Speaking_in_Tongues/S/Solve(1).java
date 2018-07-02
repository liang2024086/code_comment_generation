package methodEmbedding.Speaking_in_Tongues.S.LYD1489;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;



public class Solve {

	public static void main(String[] args) {
		String e = "ejp mysljylc kd kxveddknmc re jsicpdrysi rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd de kr kd eoya kw aej tysr re ujdr lkgc jv";
        String o = "our language is impossible to understand there are twenty six factorial possibilities so it is okay if you want to just give up";
		String line = null;
		Map map = new HashMap();
		for(int i=0; i<e.length(); i++) {
           char c = e.charAt(i);
           if (c == ' ') continue;
           map.put(c, o.charAt(i));
		}
		
		map.put('z', 'q');
		
		FileReader fr;
		FileWriter fw;
		try {
			File fi = new File("input.txt");
			fr = new FileReader(fi);
			BufferedReader br = new BufferedReader(fr);
			fw = new FileWriter("output.txt");
			BufferedWriter bw = new BufferedWriter(fw);
			boolean f = true;
			int tCount = Integer.MAX_VALUE;
			int c = 1;
			while((line = br.readLine()) != null && c <= tCount) {
				if(f) {
				 f = false;
				 tCount = Integer.parseInt(line);
				 continue;
				}
				String os = "Case #" + c + ":";
				for(int i=0; i<line.length(); i++)  {
				   if(line.charAt(i) == ' ') {
				      os += ' ';
				      continue;
				   }
				   os = os + map.get(line.charAt(i));
				}
				
				
				bw.write(os);
				bw.newLine();
				c++;
			}
			bw.flush();
			bw.close();
			br.close();
		} catch (FileNotFoundException eg) {
			// TODO Auto-generated catch block
			eg.printStackTrace();
		} catch (IOException ed) {
			// TODO Auto-generated catch block
			ed.printStackTrace();
		}
	}

}

