package methodEmbedding.Magic_Trick.S.LYD789;

import java.util.Scanner;


public class MagicTrickTest {
	public static void main(String[] args) {
		int matrixOne[][] = new int[4][4] ;
		int matrixTwo[][] = new int[4][4] ;
		int secelctionOne ;
		int selectionTwo ;
		
		int i=0;
		int j=0;
		
		int count=0;
		int numberFound =0 ;
		
		int testCase ;
		
		Scanner sc = new Scanner(System.in);
		
		testCase=sc.nextInt();
		for(int z=1;z<=testCase;z++)
		{
				secelctionOne=sc.nextInt();
				for(i=0;i<4;i++)
					{
						for(j=0;j<4;j++)
						{
							matrixOne[i][j]=sc.nextInt();
						}
					}
						selectionTwo=sc.nextInt();
						for(i=0;i<4;i++)
						{
							for(j=0;j<4;j++)
							{
								matrixTwo[i][j]=sc.nextInt();
							}
						}
		
						for(i=0;i<4;i++)
						{
							for(j=0;j<4;j++)
							{
				
								if(matrixOne[secelctionOne-1][i] == matrixTwo[selectionTwo-1][j])
								{
									numberFound=matrixOne[secelctionOne-1][i];
									count++;
								}
							}
						}
		
						if(count ==0)
						{
							System.out.println("Case #"+z+": Volunteer cheated!");
						}
						else if(count == 1)
						{
							System.out.println("Case #"+z+": "+numberFound);
						}
						else if (count > 1)
						{
							System.out.println("Case #"+z+": Bad magician!");
						}
						count = 0 ;
		}

	}

}
