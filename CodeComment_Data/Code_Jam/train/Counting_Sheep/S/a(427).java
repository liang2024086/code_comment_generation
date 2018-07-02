package methodEmbedding.Counting_Sheep.S.LYD458;

import java.util.*;
import java.io.*;

class a{
	static Scanner in = new Scanner(System.in);
	public static void main(String args[]) {
		int T = in.nextInt();
		for(int t=1;t<=T;t++) {
			int n=in.nextInt();
			if(n==0) {
				System.out.println("Case #"+t+": INSOMNIA");
			}else {
				int m=1,q=n;
				Set<Integer> s = new HashSet<Integer>();
				while(n%10==0){ n/=10;s.add(0);	}
				while(s.size()<10) {
					long  j= (long)m*(long)n;
					while(j>0) {
						s.add((int)(j%10));
						j/=10;
					}
					if(s.size()>=10) break;
					m++;
				}
				System.out.println("Case #"+t+": "+(long)m*(long)q);
			}
		}
	}
}
