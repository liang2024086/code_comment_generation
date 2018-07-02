package methodEmbedding.Speaking_in_Tongues.S.LYD1492;

import java.util.HashMap;
import java.util.Map;
import java.	util.Scanner;


public class Solution {
	
	public static void main(String[] args){
		Map<Character, Character> model =  new HashMap<Character, Character>();		
		Scanner s = new Scanner(System.in);
		String train = s.nextLine();
		String test  = s.nextLine();
		char[] c1 = train.toCharArray();
		char[] c2 = test.toCharArray();
		for (int i = 0; i < c1.length; i++)
		{
			//System.out.println((int)c1[i]+"	"+(int)c2[i]);
			model.put(c1[i], c2[i]);
		}
		
		model.put('a', 'y');
		model.put('z', 'q');
		model.put('e', 'o');
		model.put((char)113, 'z');
		
//		for (Character c : model.keySet())
//		{
//			System.out.println((int)c+"	"+(int)model.get(c));
//		}
		
		
		//System.out.println(model.keySet().size());
		
		int size = s.nextInt();
		s.nextLine();
		for (int i = 1; i <= size ; i++)
		{
			String sentence = s.nextLine();
			char[] chars = sentence.toCharArray();
			char[] newChars = new char[chars.length];
			
			for (int j = 0; j < chars.length; j++)
			{
				newChars[j] = model.get(chars[j]);
					
			}
			
			System.out.println("Case #"+i+": "+new String(newChars));
			
		
		}
		
	}

}
