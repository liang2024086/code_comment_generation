package methodEmbedding.Revenge_of_the_Pancakes.S.LYD1022;

import java.util.*;
public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t=in.nextInt();
		
		
		String []res=new String[t];
		
		for(int a0=0;a0<t;a0++){
			String s=in.next();
			int flip=0;
			for(int i=0;i<s.length()-1;i++){
				if(s.charAt(i)!=s.charAt(i+1))
					flip++;		
			}
			if(s.charAt(0)=='+'&&flip%2==1)
				flip++;
			if(s.charAt(0)=='-'&&flip%2==0)
				flip++;
			res[a0]="Case #"+(a0+1)+": "+flip;
		}
		for(int a0=0;a0<t;a0++){
			System.out.println(res[a0]);
		}
		
	}
}
