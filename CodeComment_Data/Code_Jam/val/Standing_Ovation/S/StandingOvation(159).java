package methodEmbedding.Standing_Ovation.S.LYD357;

import java.util.*;

public class StandingOvation {

	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		for(int zz = 1; zz <= T;zz++){
			int N = in.nextInt();
			int surplus = 0;
			int need = 0;
			String input = in.next();
			for(int i = 0; i <= N;i++){

				int people = input.charAt(i) - 48;
				if (people >= 1) {
					surplus += (people -1);			
				} else {
					if (surplus> 0) {
						surplus--;
					} else {
						need--;
					}				
				}
			}
			if (need < 0) {
				System.out.format("Case #%d: %d\n", zz, -need);
			} else {
				System.out.format("Case #%d: %d\n", zz, 0);
			}
			
		}
	}
}
