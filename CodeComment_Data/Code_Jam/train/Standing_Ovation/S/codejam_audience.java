package methodEmbedding.Standing_Ovation.S.LYD1698;


import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class code1
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		int k=1;
		int count;
		while(k!=t+1){
			count=0;
			//int flag=0;
			int n=sc.nextInt();
			int s[]=new int[n+1];
			String q=sc.next();
			char c[]=q.toCharArray();
			for(int i=0;i<=n;i++){
				s[i]=c[i]-48;
				//System.out.print(s[i]);
			}
			int stand=s[0];
			for(int i=0;i<n;i++)
			{
				//flag+=s[i];
				if(stand<(i+1))
				{
					int diff=((i+1)-stand);
					count+=diff;		//no of people needed to stand(i+1)-no of people standing
					stand+=diff;
				}
				//else
				stand+=s[i+1];
			}
			
			System.out.println("Case #"+k+": "+count);
			k++;
		}
	}
}
