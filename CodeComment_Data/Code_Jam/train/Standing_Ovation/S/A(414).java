package methodEmbedding.Standing_Ovation.S.LYD1075;

import java.util.*;

public class A {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int T = s.nextInt();
		for (int t=0; t<T; t++) {
			int Smax = s.nextInt();
			String st = s.next();
			//System.out.println(Smax + st);
			int needed = 0;
			int cumsum = 0;
			for (int k=0; k<st.length(); k++) {
				int nok = Integer.parseInt(st.substring(k,k+1));
				//System.out.println(nok);
				if (k>cumsum) {
					int more = k-cumsum;
					needed += more; 
					cumsum += more + nok;
				} else {
					cumsum += nok;
				}
			}
			System.out.println("Case #"+(t+1)+": " + needed);
		}
	}
}
