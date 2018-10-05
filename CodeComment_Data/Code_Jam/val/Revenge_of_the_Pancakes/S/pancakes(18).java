package methodEmbedding.Revenge_of_the_Pancakes.S.LYD183;

import java.util.*;

public class pancakes {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int loopCount = in.nextInt(); in.nextLine();
		
		for(int lc = 0; lc < loopCount; lc++){
			String stack = in.nextLine();
			int ans = 0;
			
			char curChar = 'x';
			for(int i = 0; i < stack.length(); i++)
				if(stack.charAt(i) != curChar){
					curChar = stack.charAt(i);
					ans++;
				}
			
			if(stack.charAt(stack.length() - 1) == '+')
				ans--;
			
			System.out.printf("Case #%d: %d%n", lc + 1, ans);
		}
	}
}
