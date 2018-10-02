package methodEmbedding.Magic_Trick.S.LYD1094;

import java.util.ArrayList;
import java.util.Scanner;


public class MagicTrick {

	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> alF = new ArrayList<Integer>();
		ArrayList<Integer> alS = new ArrayList<Integer>();
		int n = sc.nextInt();
		
		for(int i=0;i<2*n;i++)
		{
			int h = sc.nextInt();
			sc.nextLine();
			for(int j=0;j<h-1;j++ )
			{
				sc.nextLine();
			}
			
			if(i%2==0)
			for(int k=0;k<4;k++)
				alF.add(sc.nextInt());
			else
				for(int k=0;k<4;k++)
					alS.add(sc.nextInt());
			
			for(int j=0;j<5-h;j++)
				sc.nextLine();
		}
		
		for(int i=0;i<n;i++)
		{
			int count =0;
			int test = i+1;
			int result = 0;
			for(int j=0;j<4;j++)
			{
				int f = alF.get(4*i+j);
			for(int k=0;k<4;k++)
				if(f==alS.get(4*i+k))
				{
					count++;
					result = f;
				}
			}
			
			if(count==0)
				System.out.println("Case #"+test+": Volunteer cheated!");
			else if(count==1)
				System.out.println("Case #"+test+": "+result);
			else
				System.out.println("Case #"+test+": Bad magician!");
		}
	}
}
