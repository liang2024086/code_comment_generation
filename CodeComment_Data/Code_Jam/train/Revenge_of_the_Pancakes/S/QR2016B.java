package methodEmbedding.Revenge_of_the_Pancakes.S.LYD169;


import java.util.*;
import java.io.*;

public class QR2016B {

	public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
		File file = new File("C:\\codejam\\B-small-attempt0.in");
	    
		PrintWriter writer = new PrintWriter("C:\\codejam\\B-small-attempt0.out", "UTF-8");
        Scanner input = new Scanner(file);
     
        int totalTest = input.nextInt();
        
        for (int test=0; test < totalTest; test++){
        	String pancakes = input.next();
        	boolean[] happy = new boolean[pancakes.length()];
        	for (int i=0;i<pancakes.length();i++){
        		if (pancakes.charAt(i) == '-'){
        			happy[i]=false;
        		}
        		if (pancakes.charAt(i) == '+'){
        			happy[i]=true;
        		}
        	}
        	int flips = 0;
        	boolean allhappy = true;
        	for (int i=0;i<pancakes.length();i++){
        		if (!happy[i]){allhappy = false;} 
        	}
        	while (!allhappy){
        		
        		boolean firstPancake = happy[0];
        		boolean flipTime = false;
        		int i=1;
        		while (!flipTime){
        			if (i>=pancakes.length() || happy[i] != firstPancake)
        			{
        					flipTime = true;
        			} else {
        				i++;
        			}
        		}
        		
        		for (int j=0;j<i;j++){
        			happy[j]=!firstPancake;
        		}
        		
        		flips+=1;
        		
        		allhappy = true;
            	for (int k=0;k<pancakes.length();k++){
            		if (!happy[k]){allhappy = false;} 
            	}
        	}
        	
			writer.printf("Case #%d: %d\n", test + 1, flips);
			System.out.printf("Case #%d: %d\n", test + 1, flips);
        }
        
        
        
        writer.close();
	}

}
