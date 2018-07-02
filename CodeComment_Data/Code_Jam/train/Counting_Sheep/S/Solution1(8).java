package methodEmbedding.Counting_Sheep.S.LYD679;


import java.io.File;
import java.util.HashSet;
import java.util.Scanner;

public class Solution1 {
	
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		HashSet hs = new HashSet();
		for(int i=0;i<t;i++)
		{
			int n = sc.nextInt();
			if(n==0)
			{
				System.out.println("Case #"+(i+1)+": INSOMNIA");
				continue;
			}
			String s = String.valueOf(n);
			for(int k=0;k<s.length();k++)
				hs.add(s.charAt(k));
			
			int iter = 2;
			long last_num = 0;
			while(hs.size()!=10 && iter<=100)
			{
				long temp = n*iter;
				s = String.valueOf(temp);
				for(int j=0;j<s.length();j++)
					hs.add(s.charAt(j));
				last_num = temp;
				iter++;
			}
			if(hs.size() == 10)
			{
				System.out.println("Case #"+(i+1)+": "+last_num);
				
			}
			else
			{
				System.out.println("Case #"+(i+1)+": INSOMNIA");
			}
		hs.clear();
		}
	}
	
	
}
 
