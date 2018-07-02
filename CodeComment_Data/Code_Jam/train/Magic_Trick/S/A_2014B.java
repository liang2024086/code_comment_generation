package methodEmbedding.Magic_Trick.S.LYD1849;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;


public class A_2014B {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		FileWriter f = new FileWriter(new File("outfile.txt"));
		File file = new File("A-small-attempt2.in");
		Scanner scanner = new Scanner(file);
		int j=1;
		int a[][]= new int[4][4];
		int b[][]= new int[4][4];
		int y = scanner.nextInt();
		while(scanner.hasNext())
		{
			f.write("Case #"+j+": ");
			int n = scanner.nextInt();
			for(int i = 0; i<4; i++)
			{
				for(int k = 0;k<4; k++)
				{
					a[i][k]=scanner.nextInt();
				}
			}
			int m = scanner.nextInt();
			
			for(int i = 0; i<4; i++)
			{
				for(int k = 0;k<4; k++)
				{
					b[i][k]=scanner.nextInt();
				}
			}
			
			int count =0;
			int val=0;
			for(int i = 0; i<4; i++)
			{
				for(int k = 0; k<4; k++)
				{
					
					if(a[n-1][k]==b[m-1][i])
					{
						count++;
						val = a[n-1][k];
					}
				}
			}
			
			if(count==0)
			{
				f.write("Volunteer cheated!");
			}
			
			if(count==1)
			{
				f.write(new Integer(val).toString());
			}
			
			if(count>1)
			{
				f.write("Bad magician!");
			}
			f.write("\n");
			j++;
		}
		f.close();
	}

}
