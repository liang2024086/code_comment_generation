package methodEmbedding.Magic_Trick.S.LYD239;

import java.util.*;

public class a {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		for(int t=1; t<=T; t++) {
			int n = in.nextInt()-1;
			HashSet<Integer> set1 = new HashSet<Integer>(), set2 = new HashSet<Integer>();
			for(int i=0; i<4; i++)
				for(int j=0; j<4; j++)
					if(i == n) set1.add(in.nextInt());
					else in.nextInt();
			int m = in.nextInt()-1;
			for(int i=0; i<4; i++)
				for(int j=0; j<4; j++)
					if(i == m) set2.add(in.nextInt());
					else in.nextInt();
					
			set1.retainAll(set2);
			System.out.printf("Case #%d: ", t);
			int ans = 0;
			for(int x : set1) ans = x;
			if(set1.size() == 0) System.out.println("Volunteer cheated!");
			else if(set1.size() > 1) System.out.println("Bad magician!");
			else System.out.println(ans);
		}
	}
}
