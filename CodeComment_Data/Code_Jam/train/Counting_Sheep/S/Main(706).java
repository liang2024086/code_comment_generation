package methodEmbedding.Counting_Sheep.S.LYD1264;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {

	public static void main(String [] args) throws FileNotFoundException
	{

		Scanner sc = new Scanner(new File("A-small-attempt1.in"));
		//grap total as
		int total = Integer.parseInt(sc.nextLine());
		for(int i = 0; i < total; i++)
		{
			boolean [] res = new boolean[10];
			Arrays.fill(res, false);
			
			
			//grap next number
			int k = Integer.parseInt(sc.nextLine());
			
			if(k == 0)
			{
				System.out.println("case #" + (i+1) + ": INSOMNIA");
				continue;
			}
			
			int test = 0;
			int j = 0;
			while(!(res[0] && res[1] && res[2] && res[3] && res[4] && res[5] && res[6] && res[7] && res[8] && res[9]))
			{
				j++;
				test = k * j;
				
				while(test != 0)
				{
					res[test%10] = true;
					test = test/10;
				}
			}
			
			System.out.println("case #" + (i+1) + ": " + k*j);
			
		}
	}
}
