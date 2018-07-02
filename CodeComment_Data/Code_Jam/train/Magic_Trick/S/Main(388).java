package methodEmbedding.Magic_Trick.S.LYD1058;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;




public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(new FileReader("A-small-attempt2.in"));
		PrintWriter wr=new PrintWriter(new FileWriter("A-small.out"));
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			wr.print("Case #"+(i+1)+": ");
			int ans=0;
			int p=0;
			int cards1[][]=new int[4][4];
			int cards2[][]=new int[4][4];
			int first=sc.nextInt();
			int row1[]=new int[4];
			int row2[]=new int[4];
			for(int j=0;j<4;j++)
			{
				for(int l=0;l<4;l++)
				{
					cards1[j][l]=sc.nextInt();
				}
			}
			int second=sc.nextInt();
			for(int j=0;j<4;j++)
			{
				for(int l=0;l<4;l++)
				{
					cards2[j][l]=sc.nextInt();
				}
			}
			row1=cards1[first-1];
			row2=cards2[second-1];
			for(int j=0;j<4;j++)
			{
				for(int l=0;l<4;l++)
				{
					if(row1[j]==row2[l])
					{
						ans++;
						p=row1[j];
					}
				}
			}
			if(ans==1)
			{
			wr.println(p);
			}
			if(ans==0)
			{
			wr.println("Volunteer cheated!");
			}
			if(ans>1)
			{
			wr.println("Bad magician!");
			}
			
		}
		wr.close();
	}
	
	

}
