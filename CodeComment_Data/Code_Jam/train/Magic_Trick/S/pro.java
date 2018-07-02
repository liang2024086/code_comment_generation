package methodEmbedding.Magic_Trick.S.LYD1377;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class pro {

	public static void main(String args[]) throws FileNotFoundException
	{
		File f= new File("a.txt");
		Scanner sc=new Scanner(f);
		int N =sc.nextInt();
		for (int c=0;c<N;c++)
		{
			int num=c+1;
			int row1=sc.nextInt()-1;
		Integer[][] matrix1=new Integer[4][4];
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<4;j++)
			{
			matrix1[i][j]=sc.nextInt();	
			}
		}
		int row2=sc.nextInt()-1;
		Integer[][] matrix2=new Integer[4][4];
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<4;j++)
			{
				matrix2[i][j]=sc.nextInt();
			}
		}
		List<Integer> al=new ArrayList<Integer>();
		for(int i=0;i<4;i++)
		{
			al.add(matrix1[row1][i]);
		}
		int k=0;
		int value=0;
		for(int i=0;i<4;i++)
		{
		int	temp=matrix2[row2][i];
		if(al.indexOf(temp) != -1)
		{
			value=temp;
			k++;
		}
		}
		
		if(k==0)
		{
			System.out.println("Case #"+num+": "+"Volunteer cheated!");
		}
		else if(k==1)
		{
		System.out.println("Case #"+num+": "+value);	
		}
		else
		{
			System.out.println("Case #"+num+": "+"Bad Magician!");
		}
	}
		
	}
}

