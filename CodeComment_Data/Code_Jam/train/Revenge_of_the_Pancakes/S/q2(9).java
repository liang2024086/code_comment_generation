package methodEmbedding.Revenge_of_the_Pancakes.S.LYD1185;

import java.util.*;
public class q2{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for(int x=1;x<=t;x++){
			String s = in.next();
			int count = 0;
			for(int i=0;i<s.length()-1;i++){
				if(s.charAt(i)!=s.charAt(i+1)) count++;
			}
			if(s.charAt(s.length()-1) == '-') count++;
			System.out.println("Case #"+x+": "+count);
		}
	}
}
