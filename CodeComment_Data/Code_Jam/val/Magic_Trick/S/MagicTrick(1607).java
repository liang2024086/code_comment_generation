package methodEmbedding.Magic_Trick.S.LYD19;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;


public class MagicTrick {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		File inputFile = new File("A-small-attempt0.in");
		int intTestCases = 0;
		int intFirstAnswer = 0;
		int intSecondAnswer = 0;
		int first[][];
		int second[][];
		
		ArrayList<Integer> listSecond;
		ArrayList<Integer> listFirst;
		ArrayList<Integer> foundElements;
		
		try {
			Scanner sc=new Scanner(inputFile);
			java.io.PrintStream ps = new java.io.PrintStream( "A-small-attempt0.out" );
			
			intTestCases = sc.nextInt();
			
			
			
			for(int i=0;i<intTestCases;i++)
			{
				first=new int[16][16];
				second=new int[16][16];
				
				listFirst= new ArrayList();
				listSecond = new ArrayList();
				foundElements = new ArrayList();
				
				intFirstAnswer = sc.nextInt();
				
				for(int k=0;k<4;k++)
				{
					for(int l=0;l<4;l++)
					{
						first[k][l]=sc.nextInt();
					}
				}								
				
				intSecondAnswer = sc.nextInt();
				
				for(int k=0;k<4;k++)
				{
					for(int l=0;l<4;l++)
					{
						second[k][l]=sc.nextInt();
					}
				}
				
				for(int k=0;k<4;k++)
				{
					listFirst.add(first[intFirstAnswer-1][k]);
				}
				
				for(int k=0;k<4;k++)
				{
					listSecond.add(second[intSecondAnswer-1][k]);
				}
				
				for(int k=0;k<4;k++)
				{
					if(listSecond.contains(listFirst.get(k)))
					{
						foundElements.add(listFirst.get(k));
					}
				}
				
				if(foundElements.size()==1)
				{
					ps.println("Case #" + (i+1) + ": "+ foundElements.get(0));					
				}
				else if(foundElements.size()==0)
				{
					ps.println("Case #" + (i+1) + ": Volunteer cheated!");
				}
				else
				{
					ps.println("Case #" + (i+1) + ": Bad magician!");
				}
			}
			
			ps.close();
			
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
