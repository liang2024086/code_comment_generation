package methodEmbedding.Magic_Trick.S.LYD2108;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
 
public class PrintStdIn{
 
    public static void main(String args[] ) throws Exception {
        /*
         * Read input from stdin and provide input before running
*/
    	BufferedReader br = new BufferedReader(new FileReader("F:\\Java\\Files\\test.in"));
    	String t = br.readLine();
        int tests = Integer.parseInt(t);
        for(int z=1;z<=tests;z++)
        {
        String P = br.readLine();
        int firstPos = Integer.parseInt(P);
        int[] firstposArray = new int[4];
        
        for(int i=1;i<=4;i++)
        {
        	String row = br.readLine();
        	if(i == firstPos)
        	{
        		String[] rowVal = row.split(" ");
        		for (int j=0;j<4;j++)
        		{
        			firstposArray[j] = Integer.parseInt(rowVal[j]);
        		}
        	}
        }
        String secP = br.readLine();
        int secondPos = Integer.parseInt(secP);
        int[] secondposArray = new int[4];
        
        for(int i=1;i<=4;i++)
        {
        	String row = br.readLine();
        	if(i == secondPos)
        	{
        		String[] rowVal = row.split(" ");
        		for (int j=0;j<4;j++)
        		{
        			secondposArray[j] = Integer.parseInt(rowVal[j]);
        		}
        	}
        }
        int sol = 0;
        int noOfSol = 0;
        for(int i=0;i<4;i++)
        {
        	for (int j=0;j<4;j++)
        	{
        		if(firstposArray[i]==secondposArray[j])
        		{
        			sol = firstposArray[i];
        			noOfSol++;
        		}
        	}
        }
        if(noOfSol == 1)
        	System.out.println("Case #"+z+": "+sol);
        else if (noOfSol == 0)
        	System.out.println("Case #"+z+": "+"Volunteer cheated!");
        else 
        	System.out.println("Case #"+z+": "+"Bad magician!");
    	} 
   }
}
