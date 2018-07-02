package methodEmbedding.Counting_Sheep.S.LYD528;

import java.util.Scanner;
import java.util.Arrays;

public class Insomnia
{
	public static void main(String args[])
	{
		int i,j,k,n=0;
		int t,temp;
		boolean isDone = false;
		Scanner in = new Scanner(System.in);
		n = Integer.parseInt(in.nextLine());

		int []a = new int[n];
		int []check = new int[10];

		for (i=0;i<n;i++)
		{
			a[i] = Integer.parseInt(in.nextLine());			
		}

		for (i=0;i<n;i++)
		{
			Arrays.fill(check,0);
			check[0] = -1;
			isDone = false;
			j = 1;
			if (a[i]==0)
			{
				System.out.println("Case #" + (i+1) + ": " + "INSOMNIA");
			}
			else
			{
				while (isDone != true)
				{
					t = j*a[i];
					while (t!=0)
					{
						temp = t%10;
						check[temp] = temp;
						t = t/10;
					}

					for (k=0;k<10;k++)
					{
						if (check[k]==k)
						{
							isDone = true;
						}
						else
						{
							j++;
							isDone = false;
							break;
						}
					}	
				}
				if (i<n-1)
				{
					System.out.println("Case #" + (i+1) + ": " + (a[i]*j));					
				}
				else
				{
					System.out.print("Case #" + (i+1) + ": " + (a[i]*j));				
				}
				
			}
		}

	}
}
