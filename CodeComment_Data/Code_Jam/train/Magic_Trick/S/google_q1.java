package methodEmbedding.Magic_Trick.S.LYD1190;

import java.util.*;
public class google_q1 {

	public static void main(String args[])
	{
		Scanner sn=new Scanner(System.in);
		int Case=sn.nextInt();
		for(int l=0;l<Case;l++)
		{
		int arr1[][]=new int[4][4];
		int arr2[][]=new int[4][4];
		int row1=sn.nextInt();
		row1=row1-1;
		int counter=0,p=0;
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<4;j++)
			{
				arr1[i][j]=sn.nextInt();
			}
		}
		int row2=sn.nextInt();
		row2=row2-1;
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<4;j++)
			{
				arr2[i][j]=sn.nextInt();
			}
		}
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<4;j++)
			{
				if(arr1[row1][i]==arr2[row2][j])
				{
					counter++;
					p=arr1[row1][i];
				}
			}
		}
		System.out.print("Case #"+(l+1)+": ");
		if(counter==1 && p!=0)
		{
			System.out.println(p);
		}
		else if(counter==1 && p!=0)
		{
			System.out.println(p);
		}
		else if(counter>=1 && p!=0)
		{
			System.out.println("Bad magician!");
		}
		else if(counter==0 && p==0)
		{
			System.out.println("Volunteer cheated!");
		}
	}
	}
}

