package methodEmbedding.Magic_Trick.S.LYD716;

import java.io.*;
import java.util.*;
public class example{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s="",x="",y="";
		s=sc.nextLine();
		int t=Integer.parseInt(s);
		for(int i=1;i<=t;i++)
		{
			s=sc.nextLine();//System.out.println(s);
			int a=Integer.parseInt(s);
			for(int j=0;j<4;j++)
			{
				s=sc.nextLine();//System.out.println(s);
				if(j==(a-1)){x=s;}//System.out.println(x);}
			}
			s=sc.nextLine();
			a=Integer.parseInt(s);
			for(int j=0;j<4;j++)
			{
				s=sc.nextLine();//System.out.println(s);
				if(j==(a-1)){y=s;}//System.out.println(s);}
			}			
			StringTokenizer st=new StringTokenizer(x);
			int count=0;
			//System.out.println(x+"\n"+y);
			String ans="";
			for(int j=0;j<4;j++)
			{
				s=(st.nextToken());//System.out.println(s);
				StringTokenizer st1=new StringTokenizer(y);
			for(int k=0;k<4;k++)
				{String s1=st1.nextToken();
				if(s1.equals(s)){count++;ans=s1;}//System.out.println(ans);}
				}
			}
			if(count==1)
				System.out.println("Case #"+i+": "+ans);
			else if(count>1)
				System.out.println("Case #"+i+": Bad magician!");
			else System.out.println("Case #"+i+": Volunteer cheated!");
		}
	}
}
