package methodEmbedding.Magic_Trick.S.LYD1439;

import java.util.*;

public class AMagicTrick {
	private static int row;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int _i=1; _i<=T; _i++) {
			boolean vis[] = new boolean[17];
			Arrays.fill(vis, false);
			
			row = sc.nextInt();
			
			for(int i=1; i<=4; i++) {
				for(int j=1; j<=4; j++) {
					int x = sc.nextInt();
					if(i == row) vis[x] = true;
				}
			}
			
			row = sc.nextInt();
			
			int res = -1;
			boolean found = false, dup = false;
			
			for(int i=1; i<=4; i++) {
				for(int j=1; j<=4; j++) {
					int x = sc.nextInt();
					if(i == row) {
						if(vis[x]) {
							res = x;
							if(found) dup = true;
							found = true;
						}
					}
				}
			}
			
			if(found && dup) System.out.println("Case #" + _i + ": Bad magician!");
			else if(found) System.out.println("Case #" + _i + ": " + res);
			else System.out.println("Case #" + _i + ": Volunteer cheated!");
			
		}
	}

}
