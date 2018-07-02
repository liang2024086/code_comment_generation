package methodEmbedding.Speaking_in_Tongues.S.LYD522;

import java.util.*;

public class Solution {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		String N = in.nextLine();
		for(int zz = 1; zz <= T;zz++){
			N = in.nextLine();
			String NewN = "";
			for (int i= 0; i < N.length(); i++){

				switch (N.charAt(i)) {
					case 'a': NewN=NewN+'y'; break;
					case 'b': NewN=NewN+'h'; break;
					case 'c': NewN=NewN+'e'; break;
					case 'd': NewN=NewN+'s'; break;
					case 'e': NewN=NewN+'o'; break;
					case 'f': NewN=NewN+'c'; break;
					case 'g': NewN=NewN+'v'; break;
					case 'h': NewN=NewN+'x'; break;
					case 'i': NewN=NewN+'d'; break;
					case 'j': NewN=NewN+'u'; break;
					case 'k': NewN=NewN+'i'; break;
					case 'l': NewN=NewN+'g'; break;
					case 'm': NewN=NewN+'l'; break;
					case 'n': NewN=NewN+'b'; break;
					case 'o': NewN=NewN+'k'; break;
					case 'p': NewN=NewN+'r'; break;
					case 'q': NewN=NewN+'z'; break;
					case 'r': NewN=NewN+'t'; break;
					case 's': NewN=NewN+'n'; break;
					case 't': NewN=NewN+'w'; break;
					case 'u': NewN=NewN+'j'; break;
					case 'v': NewN=NewN+'p'; break;
					case 'w': NewN=NewN+'f'; break;
					case 'x': NewN=NewN+'m'; break;
					case 'y': NewN=NewN+'a'; break;
					case 'z': NewN=NewN+'q'; break;
					default: NewN=NewN+' ';
				}
				
			}	
			System.out.format("Case #%d: %s\n",zz, NewN);
		}
	}
}
