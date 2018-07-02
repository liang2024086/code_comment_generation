package methodEmbedding.Speaking_in_Tongues.S.LYD1201;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;


public class main {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader m = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter ou = new PrintWriter("file.txt");
		int n = Integer.parseInt(m.readLine());
		String s1 = "ejp mysljylc kd kxveddknmc re jsicpdrysi"
			+"rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd"
			+"de kr kd eoya kw aej tysr re ujdr lkgc jvqz";
						
						String s2 = "our language is impossible to understand"
			+"there are twenty six factorial possibilities"
			+"so it is okay if you want to just give upzq";
		for (int i = 0; i < n; i++) {
			String s = m.readLine();
			int a = 97 ;
			String newss = "";
			for(int u = 0 ; u <s.length();u++){
//				char q = (char)a;
//				String ch = q+"";
//				String chn = ""+s2.charAt(s1.indexOf(ch)); 
//				s= s.replace(ch, chn);
//				a++;
				newss += ""+s2.charAt(s1.indexOf(s.charAt(u)));
			}
			System.out.print("Case #"+(i+1)+": "+newss);

			System.out.print("\n");
		}
	}

}
