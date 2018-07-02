package methodEmbedding.Standing_Ovation.S.LYD300;

import java.util.Scanner;
public class A {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=Integer.parseInt(sc.nextLine());
		for(int i=0;i<t;i++)
		{
			int au=0,f=0;
			int n=sc.nextInt();
			String s=sc.nextLine();
			s=s.substring(s.indexOf(' ')+1);
			for(int j=0;j<s.length();j++)
			{
				if(j>0)
				{
					if(au-j<0)
					{
						int x=(j-au);
						f+=x;
						au+=x;						
					}					
				}
				au+=(s.charAt(j)-'0');
			}
			System.out.println("Case #"+(i+1)+": "+f);
		}
	}
}
