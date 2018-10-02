package methodEmbedding.Speaking_in_Tongues.S.LYD704;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeMap;


public class Main_Tongues {
	public static void main(String[] args)throws Exception {
		File _=new File("tongues.in");
		BufferedReader br=_.exists()? new BufferedReader(new FileReader(_)):new BufferedReader(new InputStreamReader(System.in));
		
		TreeMap<Character, Character> alphabet =new TreeMap<Character, Character>();
		alphabet.put('y', 'a');

		alphabet.put('q', 'z');
		alphabet.put('z', 'q');
		
		String str1=new String("ejp mysljylc kd kxveddknmc re jsicpdrysi rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd de kr kd eoya kw aej tysr re ujdr lkgc jv");
		
		String str2=new String("our language is impossible to understand there are twenty six factorial possibilities so it is okay if you want to just give up");
		Character c;
		for (int i = 0; i < str1.length(); i++) {
			if((c=str1.charAt(i))!=' ')
				if(!alphabet.containsKey(c))
					alphabet.put(c, str2.charAt(i));
		}
	
		
		int t=Integer.parseInt(br.readLine().trim());
		String str;
		for (int i = 1; i <= t; i++) {
			
			System.out.print("Case #"+i+": ");
			str=br.readLine().trim();
			for (int j = 0; j < str.length(); j++) {
				if(str.charAt(j)==' ')
					System.out.print(" ");
				else
					System.out.print(alphabet.get(str.charAt(j)));
				if(j==str.length()-1 && i!=t)
					System.out.println();
			}
			
		}
		


	}
}
