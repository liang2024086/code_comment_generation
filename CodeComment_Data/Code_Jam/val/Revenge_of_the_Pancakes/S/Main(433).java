package methodEmbedding.Revenge_of_the_Pancakes.S.LYD355;

import java.util.*;

public class Main {

	static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args) {
		int T = in.nextInt();
		int res = 0;
		String s;
		boolean vis[] = new boolean[100];
	
		for(int z = 1; z <= T; z++){
			s = in.next();
			res = 0;
			for(int i = 0; i < s.length(); i++){
				if(s.charAt(i) == '+')
					vis[i] = true;
				else
					vis[i] = false;
			}
			
			for(int i = s.length() - 1; i >= 0; i--){
				if(!vis[i]){
					res++;
					for(int j = 0; j < i; j++)
						vis[j] = !vis[j];
				}
			}
			
			System.out.println("Case #"+z+": "+res);
		}
		
		
	}
	
	
	
	
}
