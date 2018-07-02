package methodEmbedding.Standing_Ovation.S.LYD1798;

import java.util.Scanner;


public class Case1 {
	public static void main(String Args[]){
		int T,i,j,c,r,p;
		char[] S;
		Scanner sca = new Scanner(System.in);
		T =  Integer.parseInt(sca.next());
		int[] ans =new int[100];
		for (i=0;i<T;i++){
			c = Integer.parseInt(sca.next());
			S = sca.next().toCharArray();			
			r=0;p=S[0]-'0';
			for (j=0;j<c;j++){
				if (p<=j){
					p++;
					r++;
				}
				if (j==c)
					break;
				p+=S[j+1]-'0';
			}
			ans[i]=r;
		}
		for (i=0;i<T;i++){
		System.out.println("Case #"+(i+1)+": "+ans[i]);
	}
}
}
