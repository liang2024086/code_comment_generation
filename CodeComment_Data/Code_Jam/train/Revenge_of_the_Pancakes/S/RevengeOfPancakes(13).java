package methodEmbedding.Revenge_of_the_Pancakes.S.LYD232;


import java.util.*;
 class RevengeOfPancakes {
	public static void main(String [] args){
		Scanner s= new Scanner(System.in);
		int t=s.nextInt();
		for(int i=1;i<=t;i++){
			String str= s.next();
			int n=str.length();
			int ans=0;
			if(str.charAt(n-1)=='-'){
				ans++;
			}
			for(int j=0;j<n-1;j++){
				if(str.charAt(j)!=str.charAt(j+1)){
					ans++;
				}
			}
			System.out.print("Case #");
			System.out.print(i);
			System.out.print(": ");
			System.out.print(ans);
			System.out.println();
		}
	}
}
