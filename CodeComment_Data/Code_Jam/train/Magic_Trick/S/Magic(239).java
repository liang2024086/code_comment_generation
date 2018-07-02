package methodEmbedding.Magic_Trick.S.LYD1446;

import java.io.*;

class Magic
{
	public static void main(String args[])throws IOException
	{
		int a1, a2;
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int t= Integer.parseInt(br.readLine());
		int c=0;
		while(t-->0)
		{
			c++;
			a1 = Integer.parseInt(br.readLine());
			int arr[] = new int[4];
			int arr1[] = new int[4];
			for(int i=1; i<5; i++)
			{
				String R1[]=br.readLine().split(" ");
				if(i==a1)
					for(int j=0; j<4; j++)
						arr[j]=Integer.parseInt(R1[j]);
			}
			a2 = Integer.parseInt(br.readLine());
			for(int i=1; i<5; i++)
			{
				String R2[]=br.readLine().split(" ");
				if(i==a2)
					for(int j=0; j<4; j++)
						arr1[j]=Integer.parseInt(R2[j]);
			}
			int sol = 0 , ans = 0;
			for(int i=0; i<4; i++)
				for(int j=0; j<4; j++)
					if(arr[i]==arr1[j])
					{
						sol++;
						ans=arr[i];
					}
			System.out.print("Case #"+c+": ");
			if(sol==0)
				System.out.print("Volunteer cheated!");
			else if(sol==1)
				System.out.print(ans);
			else
				System.out.print("Bad magician!");
			System.out.println("");
			
		}
	}
}
