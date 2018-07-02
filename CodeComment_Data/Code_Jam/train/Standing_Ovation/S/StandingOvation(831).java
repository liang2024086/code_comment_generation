package methodEmbedding.Standing_Ovation.S.LYD612;

import java.util.Scanner;


public class StandingOvation {

	public static void main(String[] args) {
		int T; Scanner scan = new Scanner(System.in);
		T=scan.nextInt();
		for(int i11=1;i11<=T;i11++){
			int n=scan.nextInt();String dir = scan.next();
			int cur=0,ans=0;
			for(int i=0;i<=n;i++){
				int temp = dir.charAt(i)-48;
				if(i>cur && temp!=0)
					{
						ans+=i-cur;
						cur=i;
					}
				cur+=temp;
				//System.out.println(cur + " "+ans);
			}
				
			System.out.printf("Case #%d: %d\n",i11,ans);
		}
	}

}
