package methodEmbedding.Revenge_of_the_Pancakes.S.LYD974;

import java.util.Scanner;

public class RevengeofthePancakes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		for(int cn=1; cn<=T;cn++){
			String S=sc.next()+"+";
			int ans=0;
			int l=S.length();
			for(int i=0;i<l-1;i++){
				if(S.charAt(i)!=S.charAt(i+1))
					ans++;
			}
			System.out.println("Case #"+cn+": "+ans); 
		}
	}
}
