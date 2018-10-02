package methodEmbedding.Standing_Ovation.S.LYD1970;

import java.io.File;
import java.io.PrintStream;
import java.util.Scanner;

public class ProblemA {

	public static void main(String[] args) throws Exception 
	{
		Scanner aScanner=new Scanner(System.in);
		int testCases=Integer.parseInt(aScanner.next());
		PrintStream print=new PrintStream(new File("output.txt"));
		int inviteFriendsCount=0;
		if(testCases>=1 && testCases<=100 )
		{
			for(int i=1;i<=testCases;i++)
			{
				int Smax=Integer.parseInt(aScanner.next());
				String SmaxString=aScanner.next();
				int count[]=new int[Smax+1];
				int prev[]=new int[Smax+1];
				if(Smax>=0 && Smax<=1000)
				{
					char ch=SmaxString.charAt(Smax);
					if(SmaxString.charAt(Smax)!='0')
					{
						for(int j=0;j<Smax+1;j++)
						{
							count[j]=Character.getNumericValue(SmaxString.charAt(j));
							if(j!=0){
								for(int s=0;s<j;s++)
							   prev[j]=prev[j]+count[s];
							}
						}
					  for(int k=0;k<Smax+1;k++)	
					  {
						  if(prev[k]<k)
						  {
							  inviteFriendsCount=inviteFriendsCount+k-prev[k];
							  int add=k-prev[k];
							  for(int a=k;a<Smax+1;a++)
							  {
										 prev[a]=prev[a]+add;
							  }
						  }
					  }
					}
				}
				print.println("Case #"+i+": "+inviteFriendsCount);
				inviteFriendsCount=0;
			}
	 }
   }
}
