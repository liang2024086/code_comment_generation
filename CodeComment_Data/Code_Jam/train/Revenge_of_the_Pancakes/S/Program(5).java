package methodEmbedding.Revenge_of_the_Pancakes.S.LYD165;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import help.CJHelper;

public class Program {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

        BufferedReader in = new BufferedReader(new FileReader(new File("IO/qualRound/b.in")));
        BufferedWriter out = new BufferedWriter(new FileWriter(new File("IO/qualRound/b.txt")));
        System.out.println("File open successful!");
        
       final int T = Integer.parseInt(in.readLine());
        
        
      for(int i = 0; i < T; i++)
       {
        	String pancakes = in.readLine();
        	boolean happy = false;
        	int flips = 0;
        	
        	while(happy == false)
        	{
        	for(int j = (pancakes.length()-1); j > -1; j--)
        	{
        		String newArrangement = "";
        		
        		if(pancakes.charAt(j) == '-')
        		{
        			flips++;
        			for(int p = 0; p <= j; p++)
        			{
        				if(pancakes.charAt(p) == '+') newArrangement += "-";
        				else newArrangement += "+";
        			}
        			
        			for(int p = j+1; p < pancakes.length(); p++)
        			{
        				if(pancakes.charAt(p) == '+') newArrangement += "+";
        				else newArrangement += "-";
        			}
        			
        			pancakes = newArrangement;
        			break;
        		}
        		
        		if(j == 0 && pancakes.charAt(j) == '+')
        		{
        			happy = true;
        		}
        	}
     
        	}
        	
        	out.write(CJHelper.outCase(i+1, Integer.toString(flips)));
        	
        	
       }
        
        //Last
        in.close();
        out.close();
	}
}
