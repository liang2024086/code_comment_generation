package methodEmbedding.Standing_Ovation.S.LYD1521;

import java.util.Scanner;


public class StandingOvation {
	
	public static void main(String []args)
	{
		int t,i;
		Scanner input = new Scanner(System.in);
		t=input.nextInt();
		for(i=0;i<t;i++)
		{
			int smax,j,sum,fr;
			smax=input.nextInt();
			int s[]=new int[smax+1];
			String ss;
			ss=input.nextLine();
		
			for(j=0;j<smax+1;j++)
			{
				String temp=ss.charAt(j+1)+"0";
				s[j]=(Integer.parseInt(temp))/10;
			}
			
			sum=0;
			fr=0;
			for(j=0;j<smax+1;j++)
			{
				if(sum<j)
				{
					fr+=1;
					sum+=1;
				}
				
				sum+=s[j];
				
			}
			
			System.out.println("Case #"+(i+1)+": "+fr);
		}
		
		input.close();
	}

}
