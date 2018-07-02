package methodEmbedding.Revenge_of_the_Pancakes.S.LYD721;

import java.util.Scanner;


public class GoogleCodeJam2 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner((System.in));
		int T  = in.nextInt();
		int count, strLen;
		String t;
		for(int i=1;i<=T;i++) {
			count = 1;
			t = in.next();
			strLen = t.length();
			
			for(int j=1;j<strLen;j++) {
				if(t.charAt(j)!=t.charAt(j-1))
					count+=1;
			}
			
			if(t.charAt(strLen-1)=='+')
				count-=1;
			
			System.out.println("Case #"+i+": "+count);
			
		}
		
		
		

	}

}
