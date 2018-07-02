package methodEmbedding.Speaking_in_Tongues.S.LYD1439;

import java.util.HashMap;
import java.util.Scanner;


public class Googlese 
{
	
	public static void main(String[] args) 
	{
		Scanner mark = new Scanner( System.in );

		HashMap<Character,Character> mono = new HashMap<Character,Character>();
		
		String alph = "abcdefghijklmnopqrstuvwxyz ";
		String goog = "ynficwlbkuomxsevzpdrjgthaq ";
		
		for (int i = 0; i < 27; i++) {
			
			mono.put(goog.charAt(i), alph.charAt(i));
			
		}
		
		int T = mark.nextInt();
		
		mark.nextLine();

		for (int i = 0; i < T; i++) 
		{
			
			StringBuilder gin = new StringBuilder( mark.nextLine() );
			
			for (int j = 0; j < gin.length(); j++)				
			{
				gin.setCharAt(j, mono.get(gin.charAt(j)));
			
			}
			
			System.out.printf("Case #%d: %s\n",i+1,gin);
			
			
		}
		
	}

}
