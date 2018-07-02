package methodEmbedding.Standing_Ovation.S.LYD1076;

import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		Scanner S=new Scanner(System.in);
		int T,max,i,l,so,ans;
		String s;
		T=S.nextInt();
		for(int k=1;k<=T;k++)
		{
			
			ans=0;
			so=0;
			max=S.nextInt();
			s=S.next();
			l=s.length();
			for(i=0;i<l;i++)
			{
				int c=s.charAt(i)-48;
				if(i>so)
				{
					ans++;
					so++;
				}
				so=so+c;
				
			if(so>=max)
				break;
				
			}
			System.out.println("Case #"+k+": "+ans);
		}
	}
}
