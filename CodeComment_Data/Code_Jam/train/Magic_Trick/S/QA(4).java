package methodEmbedding.Magic_Trick.S.LYD1805;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;

public class QA {
	
	public static void main(String[] args) throws FileNotFoundException
	{
		Scanner sc = new Scanner(new File("A-small-attempt0.in"));
		int InputNumber = sc.nextInt();
		sc.nextLine();
		
		for(int index = 1; index <= InputNumber; index++)
		{
			int num_match = 0;
			int selectedNum = 0;	
			
			int firstLine = sc.nextInt();
			sc.nextLine();
			int []inputA = new int[4];
			
			for(int readindex=0; readindex<=3;readindex++)
			{
				if(readindex == (firstLine -1))
				{
					inputA[0]= sc.nextInt();
					inputA[1]= sc.nextInt();
					inputA[2]= sc.nextInt();
					inputA[3]= sc.nextInt();				
				}
				sc.nextLine();
			}
			//=======================================================
			int SecondLine = sc.nextInt();
			sc.nextLine();
			int[]inputB = new int[4];
			
			for(int readindex=0; readindex<=3;readindex++)
			{
				if(readindex == ( SecondLine -1))
				{
					inputB[0]= sc.nextInt();
					inputB[1]= sc.nextInt();
					inputB[2]= sc.nextInt();
					inputB[3]= sc.nextInt();				
				}
				sc.nextLine();
			}
			
			//=======================================================
			for(int x=0;x<4;x++)
			{
				for(int y=0;y<4;y++)
				{
					if(inputA[x] == inputB[y])
					{
						selectedNum = inputB[y];
						num_match++;
					}
				}
			}
			
			//System.out.println(inputA[0]+" "+inputA[1] +" "+inputA[2]+" "+inputA[3]);
			//System.out.println(inputB[0]+" "+inputB[1] +" "+inputB[2]+" "+inputB[3]);
			//=============================== =
			if(num_match == 0)
			{
				System.out.println("Case #" + index + ": Volunteer cheated!");
			}
			else if(num_match == 1)
			{
				System.out.println("Case #" + index + ": " + selectedNum);
			}
			else if(num_match > 1)
			{
				System.out.println("Case #" + index + ": Bad magician!");
			}
			
			
		}
	}

}
