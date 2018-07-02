package methodEmbedding.Counting_Sheep.S.LYD1347;

import java.util.*;
public class Counting_Sheep {
public static void main(String ar[])
{
	Scanner input=new Scanner(System.in);
	int t=input.nextInt();
	for (int i = 1; i <= t; i++)
	{
		int n;
		n=input.nextInt();
		System.out.print("Case #"+i+": ");
		if (n == 0)
		{
			System.out.println("INSOMNIA");
		}
		else
		{
		Boolean array[] = new Boolean[10];
		for(int k=0;k<10;k++)
			array[k]=false;
		int count = 0, j = 2;
		int temp= n;
		while(count < 10)
		{
			int x = n;
			while(x > 0)
			{
				int y = x%10;
				if(array[y]==false)
				{
					array[y] = true;
					count++;
					if(count==10)
						break;
				}
				x = x/10;				
			}
			if(count >= 10)
				break;
			n = j *temp;
			j++;
		}
		System.out.println(n);
	}
	}
	
}
}
