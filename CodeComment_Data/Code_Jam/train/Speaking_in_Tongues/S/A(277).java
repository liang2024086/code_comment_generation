package methodEmbedding.Speaking_in_Tongues.S.LYD656;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class A {
	static Scanner s;
	static String GGR = "ejp mysljylc kd kxveddknmc re jsicpdrysi rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd de kr kd eoya kw aej tysr re ujdr lkgc jvqz";
	static String ANS = "our language is impossible to understand there are twenty six factorial possibilities so it is okay if you want to just give upzq";
	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		s = new Scanner(new File("a.txt"));
		int T = s.nextInt();s.nextLine();
		for(int a=1;a<=T;a++) {
			String st = s.nextLine();
			int len = st.length();
			String res = new String();
			for (int i=0; i<len; i++) {
				int idx=0;
				while (st.charAt(i)!=GGR.charAt(idx)) idx++;
				res += ANS.substring(idx,idx+1);
			}
			System.out.println("Case #"+a+": "+res);
		}
		s.close();
	}

}
