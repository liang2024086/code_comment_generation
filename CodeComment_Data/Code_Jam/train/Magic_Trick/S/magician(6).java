package methodEmbedding.Magic_Trick.S.LYD1081;

import java.io.IOException;
import java.util.*;

public class magician {

	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		int tc=Sc.nextInt();
		int compteur=0;
				int pos=0;
		int k=0;
		for(k=0;k<tc;k++)
		{int[][] grid1= new int[4][4];
		int[][] grid2= new int[4][4];	
		int i,j;
		int row1=Sc.nextInt();
	
		for(i=0;i<4;i++)
			{for(j=0;j<4;j++)
				grid1[i][j]=Sc.nextInt();
			}
			
			int row2=Sc.nextInt();
			
			for(i=0;i<4;i++)
			{for(j=0;j<4;j++)
				grid2[i][j]=Sc.nextInt();
			}
		
i=0;j=0;
compteur=0;
pos=0;
	for(i=0;i<4;i++)
	{
	for(j=0;j<4;j++)
	{
		if ((grid2[row2-1][j])==(grid1[row1-1][i]))
	{
	compteur ++;
	pos=i;
	}
	
	}
	}
	if(compteur==1) System.out.println("Case #"+(k+1)+": "+grid1[row1-1][pos]);
	else if(compteur==0) System.out.println("Case #"+(k+1)+": Volunteer cheated!");
	else System.out.println("Case #"+(k+1)+": Bad magician!");
	

	}

		
	}
	
}
