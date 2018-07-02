package methodEmbedding.Speaking_in_Tongues.S.LYD63;

import java.util.*;

public class A {
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		in.nextLine();
		Hashtable langtolang = new Hashtable(); 
		for(int a = 1; a <= T;a++){
			String lang1= in.nextLine();
			String lang2= in.nextLine();
			
			for(int b = 0; b < lang1.length();b++)
				if (! langtolang.containsKey(lang1.charAt(b)) ){ langtolang.put(lang1.charAt(b), lang2.charAt(b)); }
		}
		//System.out.format("%s\n",langtolang.toString());
		T = in.nextInt();
		in.nextLine();
		for(int a = 1; a <= T;a++){
			String lang1= in.nextLine();
			String lang2= "";
			
			for(int b = 0; b < lang1.length();b++)
				lang2 +=langtolang.get(lang1.charAt(b));
			System.out.format("Case #%d: %s\n", a, lang2);
		}
	}
}
