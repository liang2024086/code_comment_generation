package methodEmbedding.Counting_Sheep.S.LYD1179;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class CountingSheep 
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader ip = new BufferedReader(new InputStreamReader(System.in));
		
		int testCases = Integer.parseInt(ip.readLine());
		int n; 
		int temp;
		int j=1;
		int answer=0;
		HashSet<Integer> digits;
		for(int i=1; i<=testCases; i++)
		{
			j=1;
			digits = new HashSet<>();
			n = Integer.parseInt(ip.readLine());
			temp=n;
			if(n==0)
			{
				System.out.println("Case #" + i + ": " + "INSOMNIA");
				continue;
			}
			while(digits.size()!=10)
			{
				n = (j++)*temp;
				answer =n;
				while(n>0)
				{
					digits.add(n%10);
					n= n/10;
				}
				
			}
			System.out.println("Case #" + i + ": " +answer );
		}
	}

}
