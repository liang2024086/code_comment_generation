package methodEmbedding.Standing_Ovation.S.LYD90;

import java.util.Scanner;


public class StandingOvation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int T;
		try
		{
			Scanner sc = new Scanner(System.in);
			T=sc.nextInt();
			
			for(int i=1;i<=T;i++)
			{
				
				int ans=0;
				int sMax;
				sMax=sc.nextInt();
				int[] S = new int[sMax+3];
				String input=sc.nextLine();
				input=input.trim();
				int N=input.length();
				S[0]=input.charAt(0)-'0';
				for(int j=1;j<=sMax;j++)
				{
					if(S[j-1]<j)
					{
						ans+=(j-S[j-1]);
						S[j]=j+input.charAt(j)-'0';
					}
					else
						S[j]=S[j-1]+input.charAt(j)-'0';
				}
				
				System.out.println("Case #"+i+": "+ans);
			}
		}
		catch(Exception e)
		{
			
			e.printStackTrace();
		}

	}

}
