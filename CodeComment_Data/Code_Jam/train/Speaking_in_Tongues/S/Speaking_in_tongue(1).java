package methodEmbedding.Speaking_in_Tongues.S.LYD1631;

import java.io.*;
import java.util.HashMap;

/**
 * 
 */

/**
 * @author ruzbeh
 * 
 */
public class Speaking_in_tongue {

	/**
	 * @param args
	 * @throws IOException
	 * @throws NumberFormatException
	 */
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws NumberFormatException,
			IOException {
		String learn = "ejp mysljylc kd kxveddknmc re jsicpdrysi rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd de kr kd eoya kw aej tysr re ujdr lkgc jv y e q z";
		String learnfrom = "our language is impossible to understand there are twenty six factorial possibilities so it is okay if you want to just give up a o z q";
		char[] ch_learn = learn.toCharArray();
		char[] ch_learnfrom = learnfrom.toCharArray();

		HashMap<String, String> m = new HashMap<String, String>();
		for (int i = 0; i < ch_learn.length; i++) {
			m.put(ch_learn[i] + "", ch_learnfrom[i] + "");
		}
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		FileInputStream inFile = new FileInputStream(new File("C:\\Users\\ruzbeh\\Desktop\\eclipse\\+\\gcj_speaking_in_tongue\\src\\in.in"));
		DataInputStream br = new DataInputStream(inFile);
		FileOutputStream outFile = new FileOutputStream(new File("out.in"));
		DataOutputStream out = new DataOutputStream(outFile);

		int T = Integer.parseInt(br.readLine());
		String res;

		for (int i = 0; i < T; i++) {
			String s = "";
			s = br.readLine();
			char[] ch_s = new char[s.length()];
			ch_s = s.toCharArray();
			res = "";
			for (int j = 0; j < s.length(); j++) {
				res = res + m.get(ch_s[j] + "");

			}
			out.writeBytes("Case #" + (i+1) + ": " + res);
			out.writeBytes("\n");

		}

	}

}
