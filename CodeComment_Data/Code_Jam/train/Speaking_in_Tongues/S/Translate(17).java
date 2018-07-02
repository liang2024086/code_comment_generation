package methodEmbedding.Speaking_in_Tongues.S.LYD1202;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.nio.Buffer;

public class Translate {

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException {
		String[] s = { "ejp mysljylc kd kxveddknmc re jsicpdrysizq",
				"rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd",
				"de kr kd eoya kw aej tysr re ujdr lkgc jv" };
		String[] sol = { "our language is impossible to understandqz",
				"there are twenty six factorial possibilities",
				"so it is okay if you want to just give up" };
		char[] mapping = new char[26];
		// char[] mapping1 = new char[26];
		for (int i = 0; i < s.length; i++) {
			for (int j = 0; j < s[i].length(); j++) {
				// System.out.println(s[i].charAt(j)+" >> " + sol[i].charAt(j));
				if (((int) s[i].charAt(j)) != ((int) ' ')) {
					mapping[((int) s[i].charAt(j)) - 97] = sol[i].charAt(j);
					// mapping1[(int)sol[i].charAt(j)- 97 ] =
					// (char)((s[i].charAt(j)));
				}
			}
		}
		System.out.println();

		for (int i = 0; i < mapping.length; i++) {
			// System.out.println((char)(i+97)+" >> "+ mapping[i]);
		}
		/*
		 * System.out.println(); for (int i = 0; i < mapping1.length; i++) {
		 * System.out.println((char)(i+97)+" >> "+ mapping1[i]); }
		 */

		try {
			BufferedReader br = new BufferedReader(new FileReader("A-small-attempt1.in"));
			FileWriter fw = new FileWriter("output.txt");
			int t =Integer.parseInt(br.readLine());
			String[]input = new String[t];
			System.out.println(t);
			for (int i = 0; i < t; i++) {
				input[i]=br.readLine();
				System.out.println();
			}
			for (int i = 0; i < input.length; i++) {
				fw.write("Case #"+(i+1)+": ");
				for (int j = 0; j < input[i].length(); j++) {
					if(input[i].charAt(j)<='z' &&input[i].charAt(j)>='a' ){
					//	System.out.print(mapping[((int) s[i].charAt(j)) - 97]);
					fw.append(mapping[((int) input[i].charAt(j)) - 97]);
					}else{
						fw.append(input[i].charAt(j));
					}
				}
				fw.write("\n");
			}
			fw.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for (int i = 0; i < mapping.length; i++) {
			
		}
	}

}
