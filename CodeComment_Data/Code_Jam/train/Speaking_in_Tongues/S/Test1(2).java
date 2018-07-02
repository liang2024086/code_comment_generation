package methodEmbedding.Speaking_in_Tongues.S.LYD211;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Test1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * 
		 * Input
3
ejp mysljylc kd kxveddknmc re jsicpdrysi
rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd
de kr kd eoya kw aej tysr re ujdr lkgc jv


Output
Case #1: our language is impossible to understand
Case #2: there are twenty six factorial possibilities
Case #3: so it is okay if you want to just give up
		 */
		
		String[] blabla = {
				"ejp mysljylc kd kxveddknmc re jsicpdrysi",
				"rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd",
				"de kr kd eoya kw aej tysr re ujdr lkgc jv",
				"y qee"
		};
		
		String[] translate = {
				"our language is impossible to understand",
				"there are twenty six factorial possibilities",
				"so it is okay if you want to just give up",
				"a zoo"
		};
		
		Map <Character, Character> hash = new HashMap<Character, Character>();
		
		for (int i = 0; i<blabla.length; i++)
		{
			char[] charsG = new char[blabla[i].length()];
			blabla[i].getChars(0, blabla[i].length(), charsG, 0);
			
			char[] charsE = new char[translate[i].length()];
			translate[i].getChars(0, translate[i].length(), charsE, 0);
			
			for (int j = 0; j<charsG.length; j++)
				hash.put(charsG[j], charsE[j]);
		}
		
		hash.put('z', 'q');
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N;
		try {
			N = Integer.parseInt(br.readLine());
			System.out.println();
			for (int i =0; i<N; i++)
			{
				String o = br.readLine();
				String res = "";
				for (int j = 0; j<o.length(); j++)
					res += hash.get(o.charAt(j));
				System.out.println("Case #"+(i+1)+": "+res);
			}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
