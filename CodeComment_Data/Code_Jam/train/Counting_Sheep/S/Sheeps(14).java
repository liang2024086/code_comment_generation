package methodEmbedding.Counting_Sheep.S.LYD725;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.Scanner;


public class Sheeps {
	public static void main(String [] args)
	{		
		
		// Input
		
		File file = new File("sheeps/small.txt");
		
		long[] problem = null;
		int size = 0;

	    try {

	        Scanner sc = new Scanner(file);

	        size = sc.nextInt();
	        
	        problem = new long[size];
	        
	        for (int i=0; i<size; i++) {
	        	problem[i] = sc.nextLong();
	            System.out.println(problem[i]);
	        }
	        sc.close();
	    } 
	    catch (FileNotFoundException e) {
	        e.printStackTrace();
	    }
	    
	    
	    
	    // Main
	  
	    long[] sol = new long[size];
	    
        for (int i=0; i<size; i++) {
        	if(problem[i]==0) {
        		sol[i] = -1;
        	}
        	else {
    			long N = problem[i];
    			long m = 1;
    			int count = 0;
    			long num = N*m;
    			Boolean[] isOk = new Boolean[10];
    			Arrays.fill(isOk, Boolean.FALSE);
    			
    			System.out.println("#### Looking for solution for " + N + " ####");
    			
        		while(count != 10) {
        			num = N*m;
        			System.out.print("num=" + num);
        			String digits = Long.toString(num);
        			for(int j=0; j<digits.length(); j++) {
        				int digit = Character.getNumericValue(digits.charAt(j));
        				if(!isOk[digit]) {
        					isOk[digit] = true;
        					count++;
        					System.out.println(" | " + digit + " not seen, count=" + count);
        				}
        			}
        			System.out.println("");
        			m++;
        		}
        		sol[i] = num;
        		
        	}
        }
        
        
        
        
        // Output
        
        PrintWriter writer = null;
		try {
			writer = new PrintWriter("sol.txt", "UTF-8");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        for (int i=0; i<size; i++) {
        	if(sol[i]==-1) {
        		writer.println("Case #" + (i+1) + ": " + "INSOMNIA");
	        	long index = i+1;
	        	System.out.println("Case #" + index + ": " + "INSOMNIA");
        	}
        	else {
	        	writer.println("Case #" + (i+1) + ": " + sol[i]);
	        	long index = i+1;
	        	System.out.println("Case #" + index + ": " + sol[i]);
        	}
        }
        writer.close();
        
	}
}
