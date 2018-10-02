package methodEmbedding.Revenge_of_the_Pancakes.S.LYD757;

import java.util.Scanner;

/**
 * 
 */

/**
 * @author Ativ
 *
 */
public class Main {
	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		
		for(int i=0;i<T;i++)
		{
			int cnt=0;
			String str = in.next();
			
			for(int j =0; j<str.length()-1;j++)
			{
				if(str.charAt(j)!=str.charAt(j+1))
					cnt++;
			}
			if(str.charAt(str.length()-1) == '-')
				cnt++;
			System.out.println("Case #" + (i+1) + ": " + cnt);
		}
		
	}
}
