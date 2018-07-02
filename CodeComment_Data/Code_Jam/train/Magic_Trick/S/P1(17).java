package methodEmbedding.Magic_Trick.S.LYD1523;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class P1 {
	
	public static void main(String[] args) throws NumberFormatException, IOException
	{
		BufferedReader br = new BufferedReader(new FileReader("/home/ted/p1.in"));
	    try {
	        int iterations = Integer.parseInt(br.readLine());
	        int count = 1;
	        while(count<=iterations)
	        {
	        	int row = Integer.parseInt(br.readLine())-1;
	        	String[][] rowsS = new String[4][4];
	        	String[][] colsS = new String[4][4];
	        	for(int i = 0; i < 4; i++)
	        	{
	        		rowsS[i] = br.readLine().split(" ");
	        	}
	        	int col = Integer.parseInt(br.readLine())-1;
	        	for(int i = 0; i < 4; i++)
	        	{
	        		colsS[i] = br.readLine().split(" ");
	        	}
	        	
	        	int card = 0;
	        	for(int i = 0; i <4; i++)
	        	{
	        		for(int j = 0; j < 4; j++)
	        		{
	        			if (rowsS[row][i].equals(colsS[col][j]))
	        			{
	        				if (card == 0)
	        				{
	        					card = Integer.parseInt(rowsS[row][i]);
	        				}
	        				else
	        				{
	        					card = 78;
	        				}
	        			}
	        		}
	        	}
	        	
	        	System.out.print("Case #"+count+++": ");
	        	if (card == 0)
	        	{
	        		System.out.println("Volunteer cheated!");
	        	} else if (card > 17)
	        	{
	        		System.out.println("Bad magician!");
	        	} else
	        	{
	        		System.out.println(""+card);
	        	}
	        	
	        }

	    } finally {
	        br.close();
	    }
	}
}
