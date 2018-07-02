package methodEmbedding.Magic_Trick.S.LYD475;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class A {

	/**
	 * @param args
	 */
	public static Scanner in;
	public static PrintStream out;
	
	public static void main(String[] args) throws FileNotFoundException 
	{
		in = new Scanner(new File("D:/Balaji/My Workspace/Practice/src/gc2014/A-small-attempt0.in"));
		out = new PrintStream(new File("D:/Balaji/My Workspace/Practice/src/out.txt"));
		int a, b;
		int [][]arr1 = //{ {1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16} };
		new int[4][4];
		int [][]arr2 = //{ {1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16} };
				new int[4][4];
		int cases = in.nextInt();
		int count = 0, num=0;

		for(int loop = 1 ; loop<=cases;loop++)
		{
			count=0;
			num=0;
			a = in.nextInt();
			for(int i=0;i<4;i++)
				for(int j=0;j<4;j++)
					arr1[i][j] = in.nextInt();
			b = in.nextInt();
			for(int i=0;i<4;i++)
				for(int j=0;j<4;j++)
					arr2[i][j] = in.nextInt();
			a = a-1;
			b = b-1;
			for(int i=0;i<arr1[a].length;i++)
			{
				for(int j=0;j<arr2[b].length;j++)
				{
					if(arr1[a][i] == arr2[b][j])
					{
						System.out.println( arr1[a][i] + " matches " + arr2[b][j]);
						count++;
						num = arr1[a][i];
					}
					
				}
			}
			
			if(count > 1)
			{
				out.println("Case #" + loop + ": Bad magician!");
				System.out.println("Case #" + loop + ": Bad magician!");
			}
			else if (count == 0)
			{
				out.println("Case #" + loop + ": Volunteer cheated!");
				System.out.println("Case #" + loop + ": Volunteer cheated!");
			}
			else if (count == 1)
			{
				out.println("Case #" + loop + ": "+num);
				System.out.println("Case #" + loop + ": "+num);
			}
		}		
		
	}

}
