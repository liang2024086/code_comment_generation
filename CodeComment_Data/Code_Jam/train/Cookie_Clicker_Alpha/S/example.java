package methodEmbedding.Cookie_Clicker_Alpha.S.LYD565;

import java.io.*;
import java.util.*;
public class example{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s="";
		s=sc.nextLine();
		int t=Integer.parseInt(s);
		for(int i=1;i<=t;i++)
		{
			double f=0,c=0,x=0;
			s=sc.nextLine();//System.out.println(s);
			StringTokenizer st=new StringTokenizer(s);
			s=(st.nextToken());
			c=Double.parseDouble(s);
			s=(st.nextToken());
			f=Double.parseDouble(s);
			s=(st.nextToken());
			x=Double.parseDouble(s);
			double sum=x/2,sum1=0.0;
			int k=0;
			while(true)
			{
				sum1=sum;
				sum=0.0;
				for(int z=0;z<=k;z++)
					sum+=(c/(2+f*z));
				sum+=x/(2+f*(k+1));
				if(sum1<sum)break;
				k++;			
			}
			
			System.out.println("Case #"+i+": "+sum1);
		}
	}
}
