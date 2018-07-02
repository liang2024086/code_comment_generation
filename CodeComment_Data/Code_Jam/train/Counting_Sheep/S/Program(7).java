package methodEmbedding.Counting_Sheep.S.LYD1176;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import help.CJHelper;



public class Program {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

        BufferedReader in = new BufferedReader(new FileReader(new File("IO/qualRound/a.in")));
        BufferedWriter out = new BufferedWriter(new FileWriter(new File("IO/qualRound/a.txt")));
        System.out.println("File open successful!");
        
        final int T = Integer.parseInt(in.readLine());
        
       for(int i = 0; i < T; i++)
       {
    	
    	final int N = Integer.parseInt(in.readLine());
        int result = 0;
        String nS = Integer.toString(N);   
    	ArrayList<Integer> digits = new ArrayList<Integer>();
        for(int j = 0; j < 10; j++) digits.add(j);

      
        
        if(N == 0) {
        	out.write(CJHelper.outCase(i+1, "INSOMNIA\n"));
        	continue;
        }
        
        try
    	   {
        	int counter = 1;
    	   do{
    		  
    	   	
    	   
        	for(int j = 0; j < nS.length(); j++)
        	{
        		int dig = Integer.parseInt(Character.toString(nS.charAt(j)));
        				
        		for(int p = 0; p < digits.size(); p++)
        		{
        			if(dig == digits.get(p)){
        				digits.remove(p);
        				break;
        			}
        		}
        		
        	}
        	
        	if(digits.size() > 0) result = N * (counter);
        	
        	counter++;
        	nS = Integer.toString(result);
    	   
    	   }while(digits.size() > 0);
        	
    	   out.write(CJHelper.outCase(i+1, Integer.toString(result)) + "\n");
    	   
    	   }catch(Exception e)
    	   {
    		   out.write(CJHelper.outCase(i+1, "INSOMNIA\n"));
    	   }
        	
       }
        
        //Last
        in.close();
        out.close();
	}
	
	

}
