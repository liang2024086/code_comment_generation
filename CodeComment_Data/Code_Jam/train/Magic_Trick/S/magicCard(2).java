package methodEmbedding.Magic_Trick.S.LYD574;

import java.util.*;
class magicCard
{
	public static void main (String[] args) 
		{
			Scanner sc=new Scanner(System.in);
			//System.out.println("Enter number of test cases");
			int n=sc.nextInt();
			
			//Integer[] arr = new Integer[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
			int magicMat[][]= new int [4][4];
			int caseCounter=1;
			while(n>0)
			{ 	
			//Collections.shuffle(Arrays.asList(arr));
			int c=0;
			//System.out.println("Enter the row of your element");
			int firstRow=sc.nextInt();
			//System.out.println("Enter matrix");
			for(int i=0;i<4;i++)
			{
				for(int j=0;j<4;j++)
				{
					magicMat[i][j]=sc.nextInt();
				}
			}
			/*for(int i=0;i<4;i++)
			{
				for(int j=0;j<4;j++)
				{
					System.out.print(magicMat[i][j] + "\t");
				}
				System.out.println();
			}*/
			int storeRowResult[]=new int[4];
			storeRowResult[0]=magicMat[firstRow-1][0];
			storeRowResult[1]=magicMat[firstRow-1][1];
			storeRowResult[2]=magicMat[firstRow-1][2];
			storeRowResult[3]=magicMat[firstRow-1][3];
			//System.out.println("Enter the row of your element");
			int secondRow=sc.nextInt();
			//System.out.println("Enter matrix");
			for(int i=0;i<4;i++)
			{
				for(int j=0;j<4;j++)
				{
					magicMat[i][j]=sc.nextInt();
				}
			}
			String res="";
			int t=0;
			for(int i=0;i<4;i++)
			{
				int checkNum=magicMat[secondRow-1][i];
				for(int j=0;j<4;j++)
				{
					if(checkNum==storeRowResult[j])
					{
						res=res+""+checkNum;
						t++;
					}	
				}
			}
			if(t>=2)
			{
				System.out.println("Case #"+caseCounter+":"+" Bad magician!");
				
			}
			else if(t==1)
			{
				System.out.println("Case #"+caseCounter+": "+res);
				
			}
			else
			{
				System.out.println("Case #"+caseCounter+":"+" Volunteer cheated!");
			}
			n--;
			caseCounter++;
			}
			
						
			
		}
}
