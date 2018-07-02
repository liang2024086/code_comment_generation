package methodEmbedding.Speaking_in_Tongues.S.LYD1364;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;


public class Speaking_in_Tongues {

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		char a [] = {'f', 'g', 'd', 'e', 'b', 'c', 'a', 'n', 'o', 'l', 'm', 'j', 'k', 'h', 'i', 'w', 'v', 'u', 't', 's', 'r', 'q', 'p', 'z', 'y', 'x'};
		char b [] = {'c', 'v', 's', 'o', 'h', 'e', 'y', 'b', 'k', 'g', 'l', 'u', 'i', 'x', 'd', 'f', 'p', 'j', 'w', 'n', 't', 'z', 'r', 'q', 'a', 'm'};
		
		HashMap<Character, Character> h = new HashMap<Character, Character>();
		
		for (int i = 0; i < b.length; i++) 
			h.put(a[i], b[i]);
		Scanner s = new Scanner(new File("A-small-attempt0.in"));
		int t = Integer.parseInt(s.nextLine());
		for (int i = 1; i <=t; i++) {
			String res ="";
			char l[] = s.nextLine().toCharArray();
			for (int j = 0; j < l.length; j++) {
				if(l[j]!=' ')
					res = res+h.get(l[j]);
					else
						res = res+" ";	
			}
			
			System.out.println("Case #"+i+": "+res);
		}

	}

}
