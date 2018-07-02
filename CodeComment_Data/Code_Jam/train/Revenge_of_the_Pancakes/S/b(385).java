package methodEmbedding.Revenge_of_the_Pancakes.S.LYD752;

import java.util.*;
import java.io.*;

class b{
	static Scanner in = new Scanner(System.in);
	public static void main(String args[]) {
		int T = in.nextInt();
		for(int t=1;t<=T;t++) {
			String s = in.next();
			int n = s.length(),flips=0;
			for(int i=n-1;i>=0;i--) {
				if(s.charAt(i)=='+' && flips%2==1) {
					flips++;
				}else if(s.charAt(i)=='-' && flips%2==0) {
					flips++;
				}
			}
			System.out.println("Case #"+t+": "+flips);
		}
	}
}
