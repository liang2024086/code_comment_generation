package methodEmbedding.Magic_Trick.S.LYD1491;

import java.util.*;
import java.io.*;
public class A {
	public static void main(String args[])throws Exception
	{
		Scanner sc=new Scanner(new InputStreamReader(System.in));
		ArrayList<String> demo= new ArrayList <String>();
		int n,c=1,l1,l2,i,j,j2,m=0,E=0;
		n=sc.nextInt();
		int a1[][] =new int [4][4];
		int a2[][] =new int [4][4];
		String s;
		
		while(c<=n)
		{
			l1=sc.nextInt();//first set row
			for(i=0;i<4;i++)//first 16
			{
				for(j=0;j<4;j++)
					a1[i][j]=sc.nextInt();
			}
			
			l2=sc.nextInt();//second set row
			for(i=0;i<4;i++)//second 16
			{
				for(j=0;j<4;j++)
					a2[i][j]=sc.nextInt();
			}
		    outer:	for(m=0,j=0;j<4;j++)//accessing first row
			{
				for(j2=0;j2<4;j2++)//accessing second row
				{
					if(a1[l1-1][j]==a2[l2-1][j2])//if element matches
					{
						m++;
						E=a1[l1-1][j];
						if(m>1)
							break outer;
					}
				}
			}
			s="Case #"+c+": ";
			if(m==0)
			    s+="Volunteer cheated!";
			if(m>1)
				s+="Bad magician!";
			if(m==1)
				s+=E;
			demo.add(s);
			c++;
		
		}
		for(i=0;i<n;i++)
			System.out.println(demo.get(i));
		
	}

}
