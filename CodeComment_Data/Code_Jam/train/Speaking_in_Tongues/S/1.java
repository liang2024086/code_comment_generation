package methodEmbedding.Speaking_in_Tongues.S.LYD295;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Learn1 {

	/**
	 * @param args
	 * @throws IOException
	 * @throws NumberFormatException
	 */
	public static void main(String[] args) throws NumberFormatException,
			IOException {
		// TODO Auto-generated method stub

		String s1 = "ejp mysljylc kd kxveddknmc re jsicpdrysi rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd de kr kd eoya kw aej tysr re ujdr lkgc jv";
		String s2 = "our language is impossible to understand there are twenty six factorial possibilities so it is okay if you want to just give up";
		char[] c1 = new char[500];
		char[] c2 = new char[500];
		c1 = s1.toCharArray();
		c2 = s2.toCharArray();
		Map<String, String> m = new TreeMap<String, String>();
		int i = 0;
		for (char c : c1) {
			if (c == ' ') {
				i++;
				continue;
			}
			s2.charAt(i);
			m.put(new String(new char[] { c }), new String(new char[] { s2
					.charAt(i) }));
			i++;
		}
		m.put("z", "q");


		FileInputStream fstream = new FileInputStream("q.txt");
		// Get the object of DataInputStream
		DataInputStream in = new DataInputStream(fstream);
		BufferedReader br = new BufferedReader(new InputStreamReader(in));
		String strLine;
		// Read File Line By Line
		int tc;
		String res="";
		tc = Integer.parseInt(br.readLine());
		for (int o = 0; o < tc; o++) {
			String line = br.readLine();
			char[] c3 = line.toCharArray();
			//String res = "";
			res = "";

			for(char c:c3){
				if(c == ' '){ res = res + " "; continue;}
				res = res + m.get(new String(new char[]{c}));
			}

			System.out.println("Case #" + (o+1)  +": " + res);
		}
		in.close();
	}

}
