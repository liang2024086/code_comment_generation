package methodEmbedding.Revenge_of_the_Pancakes.S.LYD454;

import java.util.*;
import java.io.*;
public class Main 
{	
  public static void main(String[] args) 
  {
    Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    int t = Integer.parseInt(in.nextLine());  // Scanner has functions to read ints, longs, strings, chars, etc.

    String pancakeSequence;
    int numberOfPancakes;
    int numberOfFlips = 0;
    
    for (int i = 1; i <= t; ++i)
    {
    	pancakeSequence = in.nextLine();

    	numberOfPancakes = pancakeSequence.length();
    	numberOfFlips = 0;
    	

    	while(true)
    	{
    		int firstpos = 0;
    		char first = pancakeSequence.charAt(firstpos);
    		
    		
    		if(first=='+')
    		{

    			int secondpos =  pancakeSequence.indexOf('-');
    			if(secondpos!=-1) 
    			{

    				
        			int thirdpos = pancakeSequence.indexOf('+', secondpos);
        			if(thirdpos != -1)
        			{
        				char[] chars = new char[thirdpos+1];
        				Arrays.fill(chars, '+');
        				String s = new String(chars);
        				
        				String lastPart = pancakeSequence.substring(thirdpos+1);
        				pancakeSequence = s + lastPart; 

        				
        			}
        			else
        			{
        				char[] chars = new char[pancakeSequence.length()];
        				Arrays.fill(chars, '+');
        				pancakeSequence = new String(chars);
        				
        			}
        			
        			numberOfFlips = numberOfFlips + 2;
    			}
    			else
    			{

    				break;
    			}
    			
  
    		}	
    		else //-ve
    		{	
    			int secondpos =  pancakeSequence.indexOf('+');
    			if(secondpos!=-1) 
    			{

        				char[] chars = new char[secondpos];
        				Arrays.fill(chars, '+');
        				String s = new String(chars);
        				
        				String lastPart = pancakeSequence.substring(secondpos);
        				
        				pancakeSequence = s + lastPart; 
        			
    			}
    			else
    			{
    				char[] chars = new char[pancakeSequence.length()];
    				Arrays.fill(chars, '+');
    				pancakeSequence = new String(chars);
    				
    			}
    			
    			
    			numberOfFlips = numberOfFlips + 1;
    			
    			
    		}
    	}
    	
    	System.out.println("Case #"+i+": "+numberOfFlips);
    	
    	
      
      
    }
    in.close();
  }
}
