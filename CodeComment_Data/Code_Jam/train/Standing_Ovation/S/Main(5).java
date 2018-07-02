package methodEmbedding.Standing_Ovation.S.LYD1386;


import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int z=n;
		while(n-- >0)
		{
			int count=0;
			int l=sc.nextInt();
			String s=sc.next();
			int temp=0;
			int i=0;
			do
			{
				
				if(i==0)
				{
					temp+=Integer.parseInt(s.substring(i, i+1));
				}
				else
				{
					int cur=Integer.parseInt(s.substring(i, i+1));
					if(cur!=0)
					if(i<=temp)
					{
						temp+=cur;
					}
					else
					{
						count+=i-temp;
						temp+=count+cur;
					}
				}
				i++;
			}while(i<=l);
			System.out.printf("Case #%d: %d\n",z-n,count);
			
		}

	}

}
