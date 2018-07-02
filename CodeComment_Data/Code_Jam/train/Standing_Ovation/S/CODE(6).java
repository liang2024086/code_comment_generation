package methodEmbedding.Standing_Ovation.S.LYD850;

import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in=new Scanner(System.in);
	int t,sm,sum=0,c=0;
	String s;t=in.nextInt();
	for(int i=1;i<=t;i++)
	{
		sm=in.nextInt();s=in.next();sum=0;c=0;
	for(int j=0;j<=sm;j++)
	{
		if(sum>=sm)break;
		if(j==0){sum+=(s.charAt(j)-'0');}
		else if(j<=sum)
		{sum+=(s.charAt(j)-'0');}
		else
		{
			c+=1;sum+=(s.charAt(j)-'0')+1;
		}
	}
	System.out.println("Case #"+i+": "+c);
	}
}
}
