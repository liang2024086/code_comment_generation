package methodEmbedding.Magic_Trick.S.LYD245;

import java.io.*;
import java.util.*;

public class majic{
public static void main(String args[]){
	try {
		PrintStream output = new PrintStream( "out.txt" );
		Scanner input=new Scanner(new File("in.txt"));
		String line = input.nextLine();
		//int lines=0;
		int[][] cards1, cards2;
	
	//FileWriter outFile = new FileWriter("output.out");
        //PrintWriter out = new PrintWriter(outFile);
		int possible=0, first=0, second=0, index=0;
		//boolean one=false, two=false; //, start1=0, start2, k=0;
		String[] item;//, result;// = new String[1000];
		//boolean success=false, equal=false;
		int cases= Integer.parseInt(line);
		for (int c=1; c<=cases; c++){
			
			line = input.nextLine();
			first = Integer.parseInt(line);
			first--;
			cards1 = new int[4][4];
			for (int i=0; i< 4; i++)
			{
				//windows = new int[lines][2];
				line = input.nextLine();
				item = line.split(" ");
				cards1[i][0] = Integer.parseInt(item[0]);
				cards1[i][1] = Integer.parseInt(item[1]);
				cards1[i][2] = Integer.parseInt(item[2]);
				cards1[i][3] = Integer.parseInt(item[3]);
			}
			line = input.nextLine();
			second = Integer.parseInt(line);
			second--;
			cards2 = new int[4][4];
			for (int i=0; i< 4; i++)
			{
				//windows = new int[lines][2];
				line = input.nextLine();
				item = line.split(" ");
				cards2[i][0] = Integer.parseInt(item[0]);
				cards2[i][1] = Integer.parseInt(item[1]);
				cards2[i][2] = Integer.parseInt(item[2]);
				cards2[i][3] = Integer.parseInt(item[3]);
			}
			possible=0;
			for (int i=0; i< 4; i++)
			{
				for (int j=0; j< 4; j++)
					if (cards2[second][j]==cards1[first][i])
					{
						possible++;
						index=i;
					}	
				
				
			}
			//one=false;
			//two=false;
			//for (int i=0; i< lines-1; i++)
			//{
			//	for (int j=i+1; j< lines; j++)
			//	{
			//		if((windows[i][0]> windows[j][0])^(windows[i][1]> windows[j][1]))
			//			intersections++;
				
			//	}
			//}
			output.print( "Case #" + c + ":");
			//for(int i=item.length-1; i>=0; i--)
			if (possible==0)
			output.print(" Volunteer cheated!");
			else if (possible>1)
			output.print(" Bad magician!");
			else output.print(" " + cards1[first][index]);
			output.println();
			//}
		}//for        	
		output.close();
	//time  = Integer.parseInt(args[2])/2;        
           
 	           
                         
  	
 
         //line.close();

		
	}//try
      
	catch (FileNotFoundException e){
	
		// If another exception is generated, print a stack trace
  
         	 e.printStackTrace();
      
	}//catch
}//main
}//google
