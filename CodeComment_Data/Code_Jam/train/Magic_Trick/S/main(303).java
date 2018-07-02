package methodEmbedding.Magic_Trick.S.LYD1273;


import java.util.Scanner;

public class main {

	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		int testCase,firstRow,secondRow;
		int[] firstCards=new int[16];
		int[] secondCards=new int[16];
		int[] response=new int[100];
		
		testCase = in.nextInt();
		for(int i=0;i<testCase;i++)
		{
			firstRow = in.nextInt();
			for(int j=0;j<16;j++)
			{
				firstCards[j]=in.nextInt();
			}
						
			secondRow = in.nextInt();
			for(int j=0;j<16;j++)
			{
				secondCards[j]=in.nextInt();
			}
			
			response[i] = Table.compare(firstCards, secondCards, firstRow, secondRow);	
		}
		
		for(int i=0;i<testCase;i++)
		{
			System.out.print("Case #"+(i+1));
			switch (response[i]) {
			case -1:
				System.out.println(" Bad magician!");
				break;
			case -2:
				System.out.println(" Volunteer cheated!");
				break;

			default:
				System.out.println(" "+response[i]);
				break;
			}
		}
	}
}
