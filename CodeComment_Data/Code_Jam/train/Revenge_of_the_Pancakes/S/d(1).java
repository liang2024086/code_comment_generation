package methodEmbedding.Revenge_of_the_Pancakes.S.LYD885;

import java.util.*;
import java.io.*;

public class d {
	public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        char c;        
        char before;
        int count = 0;
        int minuses = 0;
        int pluses = 0;
        
        boolean happy;
        String pancakes;
        
        for (int i = 0; i < cases; i++)
        {	
        	before = 'j';
        	count = 0;
        	pluses = 0;
        	minuses = 0;
        	happy = false;
        	pancakes = sc.next();
        	
        	//System.out.println(pancakes);
        	
        	for (int j = 0; j < pancakes.length(); j++)
        	{
        		c = pancakes.charAt(j);
        		
        		if (before != c)
        		{
        			if (c == '-')
        			{        			
        				minuses++;
        			}
        			else
        			{
        				pluses++;
        			}
        		}
        		
        		//System.out.println("STEP " + j);
        		//System.out.println("MINUSES: " + minuses + " PLUSES: " + pluses);
        		
        		before = c;
        		
        	}
        	
        	if (pancakes.charAt(pancakes.length()-1) == '+')
        	{
        		pluses--;
        	}
        	
        	count = pluses + minuses;
        	        	
        	System.out.println("Case #" + (i + 1) + ": " + count);
        }
        
	}
}
