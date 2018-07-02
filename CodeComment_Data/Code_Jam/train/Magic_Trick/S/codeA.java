package methodEmbedding.Magic_Trick.S.LYD1035;

import java.util.*;

public class codeA{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int ca = 1; ca <= T; ca++){
			HashSet<Integer> hs = new HashSet<Integer>();
			ArrayList<Integer> ans = new ArrayList<Integer>();
			int ans1 = sc.nextInt();
			for(int i = 0; i < 4; i++){
				for(int j = 0; j < 4; j++){
					if(i == ans1-1) hs.add(sc.nextInt());
					else sc.nextInt();
				}
			}
			int ans2 = sc.nextInt();
			for(int i = 0; i < 4; i++){
				for(int j = 0; j < 4; j++){
					int n = sc.nextInt();
					if(i == ans2-1 && hs.contains(n)) 
						ans.add(n);
				}
			}

			System.out.print("Case #" + ca + ": ");
			if(ans.size() == 0) System.out.println("Volunteer cheated!");
			else if(ans.size() == 1) System.out.println(ans.get(0));
			else System.out.println("Bad magician!");
		}
	}
}
