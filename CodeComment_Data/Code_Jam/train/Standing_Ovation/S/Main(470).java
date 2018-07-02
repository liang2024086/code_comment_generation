package methodEmbedding.Standing_Ovation.S.LYD1758;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int cas = in.nextInt();		
		for(int i=1; i<=cas; i++) {
			
			int len = in.nextInt();
			
			String s = in.next();
			int num = Integer.parseInt(new StringBuffer(s).reverse().toString());
			
			int pplNeeded = 0, currentppl = 0;
			
			for(int j=1; j<=len; j++) {
				int a = num % 10;
				num = num/10;
				currentppl += a;
				if(currentppl < j) {
					int needed = j - currentppl;
					pplNeeded += needed;
					currentppl += needed;
				}
			}
			
			
			System.out.printf("Case #%d: ",i);
			System.out.println(pplNeeded);
		}
		in.close();
	}
	
	
}
