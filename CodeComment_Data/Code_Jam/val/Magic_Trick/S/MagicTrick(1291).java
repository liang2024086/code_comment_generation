package methodEmbedding.Magic_Trick.S.LYD2195;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class MagicTrick
{
	static final int row=4;
	static final int col=4;
	static int arr[][]=new int[row][col];
	static int temp[]=new int[row];

	public static void main(String args[])throws FileNotFoundException
	{
		FileInputStream fin=new FileInputStream("R:\\A-small-attempt0.in");
		FileOutputStream fout=new FileOutputStream("R:\\A-small.out");
		PrintStream ps=new PrintStream(fout);
		
		Scanner sc=new Scanner(fin);
		int t,i,j,choice,c,num=0,index=1;
		t=sc.nextInt();
		while(t!=0)
		{
			choice=sc.nextInt();
			for(i=0;i<row;i++)
			{
				for(j=0;j<col;j++)
					arr[i][j]=sc.nextInt();
			}
			for(i=0;i<col;i++)
				temp[i]=arr[choice-1][i];
			
			choice=sc.nextInt();
			for(i=0;i<row;i++)
			{
				for(j=0;j<col;j++)
					arr[i][j]=sc.nextInt();
			}
			
			c=0;
			for(i=0;i<row;i++)
			{
				for(j=0;j<col;j++)
				{
					if(arr[choice-1][j]==temp[i])
					{	
						c++;
						num=arr[choice-1][j];
					}
				}
			}
			if(c==0)
				ps.println("Case #"+index+": Volunteer cheated!");
			else if(c==1)
				ps.println("Case #"+index+": "+num);
			else
				ps.println("Case #"+index+": Bad magician!");
			
			t--;
			index++;
		}
	}
}
