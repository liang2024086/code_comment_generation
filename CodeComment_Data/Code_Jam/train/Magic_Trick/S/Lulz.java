package methodEmbedding.Magic_Trick.S.LYD341;

import java.util.*;

public class Lulz {
	public static void main(String[] args) throws Exception {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		for(int t = 1; t <= T; t++) {
			int a = in.nextInt() - 1;
			TreeSet<Integer> vals = new TreeSet<Integer>();
			for(int i = 0; i < a; i++) {
				for(int j = 0; j < 4; j++) {
					in.nextInt();
				}
			}
			for(int i = 0; i < 4; i++) {
				vals.add(in.nextInt());
			}
			for(int i = a + 1; i < 4; i++) {
				for(int j = 0; j < 4; j++) {
					in.nextInt();
				}
			}
			a = in.nextInt() - 1;
			TreeSet<Integer> d = new TreeSet<Integer>();
			for(int i = 0; i < a; i++) {
				for(int j = 0; j < 4; j++) {
					in.nextInt();
				}
			}
			for(int i = 0; i < 4; i++) {
				int x = in.nextInt();
				if(vals.contains(x)) {

					d.add(x);	
				}
			}
			for(int i = a + 1; i < 4; i++) {
				for(int j = 0; j < 4; j++) {
					in.nextInt();
				}
			}
			System.out.print("Case #" + t + ": ");
			if(d.size() == 0) {
				System.out.println("Volunteer cheated!");
			} else if(d.size() > 1) {
				System.out.println("Bad magician!");
			} else {
				System.out.println(d.first());
			}
		}
	}
}
