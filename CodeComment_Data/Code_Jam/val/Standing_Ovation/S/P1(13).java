package methodEmbedding.Standing_Ovation.S.LYD1166;

import java.io.*;

class P1
{
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		int index=1;
		while(t-->0)
		{
			int stand = 0,count=0;
			String number[] = (br.readLine()).split(" ");
			int level = Integer.parseInt(number[0]);
			int arr[] = new int[level+1];
			for(int i=0;i<=level;i++)
			{
				arr[i] = Integer.parseInt(String.valueOf((number[1].charAt(i))));
			}
			stand = arr[0];
			for(int i=1;i<=level;i++)
			{
				if(i>stand)
				{
					count++;
					stand++;
				}
				
					stand+=arr[i];
			}
			System.out.println("Case #" + index++ + ": " + count);
			
		}
	}
}
