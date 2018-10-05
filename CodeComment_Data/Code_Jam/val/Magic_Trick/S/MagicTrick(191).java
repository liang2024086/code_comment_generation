package methodEmbedding.Magic_Trick.S.LYD1565;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 
 * @author Bakshree
 * Java 1.7
 * @version 1.0
 *
 */
public class MagicTrick {


	public static void main(String[] args) throws IOException {
		int cases=0, row1=0, row2=0, eqCount = 0;//cases equivalent to T
		String[] arr = new String[4];

		String[][] arr1 = new String[4][4];
		String [][] arr2 = new String[4][4];

		BufferedReader reader = new BufferedReader(new FileReader(System.getProperty("user.dir")+"\\A-small-attempt0.in"));
		PrintWriter writer = new PrintWriter(System.getProperty("user.dir")+"\\output.txt", "UTF-8");

		String line = null;
		if ((line = reader.readLine()) != null) 
		{    System.out.println("test cases = "+line);
		cases = Integer.valueOf(line);
		}
		if(cases<1 || cases>100)
		{	
			writer.println("Value of T not within limits 1<=T<=100");
			System.exit(0);
		
		}
			
		for( int cas = 0; cas< cases; cas++)
		{
			eqCount = 0;
			if ((line = reader.readLine()) != null) 
			{   
				row1 = Integer.valueOf(line)-1;		   		
				System.out.println("row#1 = "+row1);
			}
			for(int j = 0; j<4; j++)
			{
				if ((line = reader.readLine()) != null) 
					arr[j] = line;	 
				System.out.println(line);
				arr1[j]= arr[j].split(" ");
			} 
			System.out.println();

			if ((line = reader.readLine()) != null) 
			{  
				row2 = Integer.valueOf(line)-1;		
				System.out.println("row#2 = "+row2);
			}
			for(int j = 0; j<4; j++)
			{
				if ((line = reader.readLine()) != null) 
					arr[j] = line;	 
				System.out.println(line);
				arr2[j]= arr[j].split(" ");
			} 
			if(row1<0 || row1>3 || row2<0 || row2>3)
			{
				System.out.print("Invalid Row!");
				writer.println("Value of row not within limits 1<=row<=4");
				System.exit(0);
			}
			else
			{
					//To make sure the indices match with array indices
				String s = null;
				for(int i = 0; i<4; i++)
				{
					for(int i2 = 0; i2<4; i2++)
					{
						int n1, n2;
						n1 = Integer.valueOf(arr1[row1][i]);
						n2 = Integer.valueOf(arr2[row2][i2]);
						if(n1==n2)
						{
							System.out.println("n1, n2 "+ n1 +" "+ n2);
							eqCount+=1;
							s = Integer.toString(n2);
						}
					}	
				}
				switch(eqCount)
				{
				case 0:
					System.out.println("Case #"+(cas+1)+": Volunteer cheated!");
					writer.println("Case #"+(cas+1)+": Volunteer cheated!");
					break;
				case 1:
					System.out.println("Case #"+(cas+1)+": "+s);
					writer.println("Case #"+(cas+1)+": "+s);
					break;
				default:
				System.out.println("Case #"+(cas+1)+": Bad magician!");
				writer.println("Case #"+(cas+1)+": Bad magician!");
				break;
				}
		}
	}
		writer.close();
}
}

