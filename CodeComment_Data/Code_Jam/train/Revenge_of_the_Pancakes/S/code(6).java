package methodEmbedding.Revenge_of_the_Pancakes.S.LYD1127;

import java.util.Scanner;
public class RevengePancakes {
	public static void main(String args[]){
		Scanner x = new Scanner(System.in);
		int T = x.nextInt();
		for(int i=0; i<T; i++){
			String S = x.next();
			int l = S.length(),c=0;
			char A[] = new char[l];
			A = S.toCharArray();
				for(int j=1;j<l;j++){
					if(A[j]!=A[j-1]&&A[j-1]=='-'){
						c +=2;
						while(j<l&&A[j]=='+')
						{j++;}
					}
				}
				if(A[0]=='-'){c--;}
				if(A[l-1]=='-'){c +=2;}
				System.out.println("Case #"+(i+1)+": "+c);
					
				}
			}
}
