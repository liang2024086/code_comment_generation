package methodEmbedding.Magic_Trick.S.LYD568;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;


public class MagicTrick {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(new File("c://codejam//quali//magictrick//A-small-attempt0.in"));
		PrintWriter out = new PrintWriter(new File("c://codejam//quali//magictrick//out.txt"));
		int N = sc.nextInt();
		int[][] first = new int[4][4];
		int[][] second = new int[4][4];
		for(int i=1;i<=N;i++)
		{
			int frow = sc.nextInt()-1;
			for(int j=0;j<4;j++)
				for(int k=0;k<4;k++)
					first[j][k] = sc.nextInt();
			int srow = sc.nextInt()-1;
			for(int j=0;j<4;j++)
				for(int k=0;k<4;k++)
					second[j][k] = sc.nextInt();
			int count = 0;
			int number = 0;
			for(int j=0;j<4;j++)
			{
				int num = first[frow][j];
				for(int k=0;k<4;k++)
				{
					if(num == second[srow][k])
					{
						count++;
						number = num;
					}
				}
			}
			if(count == 0)
				out.println("Case #"+i+": Volunteer cheated!");
			if(count >1)
				out.println("Case #"+i+": Bad magician!");
			if(count==1)
				out.println("Case #"+i+": "+number);
			
			
		}
		out.close();
		
	}

}
