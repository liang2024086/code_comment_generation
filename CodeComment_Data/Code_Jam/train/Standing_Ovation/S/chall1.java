package methodEmbedding.Standing_Ovation.S.LYD414;

import java.util.*;
import java.lang.*;
class chall1
{
public static void main(String args[])
{
int t;
int s[]=new int[100];
int p[][]=new int[100][100];
String s1=new String();
Scanner cin=new Scanner(System.in);
t=cin.nextInt();
for(int i=0;i<t;i++)
{
	s[i]=cin.nextInt();
	s1=cin.next();
	for(int j=0;j<=s[i];j++)
{
p[i][j]=Integer.parseInt(s1.substring(j,j+1));	
}
}

int sum=0,k=0;
for(int i=0;i<t;i++)
{sum=0;k=0;
	for(int j=0;j<=s[i];j++)
	{
		if(p[i][j]!=0)
		{	if(sum>=j)
			sum+=p[i][j];
			else
			{k+=j-sum;sum+=j-sum;j--;}}
	}
	System.out.println("Case #"+(i+1)+": "+k);
}
}
}
