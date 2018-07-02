package methodEmbedding.Counting_Sheep.S.LYD590;




/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.*;
import java.util.*;

import Solutions.IOTemplate;

/**
 *
 * @author Stephen Bush, Workiva Inc. (HyperText/COIN)
 */
public class Solution_ extends IOTemplate {
    
	// Date:	4/8/2016
	// Sample Output:	COMPLETE
	// Small Dataset:	INCOMPLETE
	// Large Dataset:	INCOMPLETE

	static final int DEBUG = 0;
	static final int[] TEST_CASES = {
//			
	};
	
	public Solution_(int DB, int[] TC) { super(DB,TC);}
    public static void main(String[] args){

    	String path = "2016_GCJ/Qualification_Problem_A/";
    	new Solution_(DEBUG, TEST_CASES);
//    	String inputFile = path+"input.in";
    	String inputFile = path+"input_small.in";
    	//String inputFile = path+"input_large.in";
        String outputFile = path+"output.out";
        
        // Set up the reader/writer
        try { in = new Scanner(new File(inputFile)); } 
        catch(FileNotFoundException ex){
            System.out.println("Unable to open file "+inputFile);
            return;
        }
        try { out = new PrintWriter(new File(outputFile)); } 
        catch(FileNotFoundException ex){
            System.out.println("Unable to open file "+outputFile);
            return;
        }
            
        int cases = nextInt();
        for ( int i = 0; i < cases; i++ ) {
        	// Consume test-case data!
            int N = nextInt(); // the number Bleatrix has chosen
            
            // This line should come after the input consumption, but before heavy calculations
        	if (shouldSkipTestCase(i+1)) continue; if ( DEBUG >= 1 ) System.out.println("Case #"+(i+1));

        	// CALCULATIONS/Processing of the test case goes here!
        	boolean[] digits = new boolean[10];
        	for ( int i2 = 0; i2 < 10; i2++ ) digits[i2] = false;
        	int iterations = 0;
        	int current = N;
        	boolean cont;
        	int temp, tempDigit;
        	int MAX_ITERATIONS = 100;
        	do {
        		temp = current;
        		while ( temp > 0 ) {
        			tempDigit = temp % 10;
        			digits[tempDigit] = true;
        			temp = (temp-tempDigit)/10;
        		}
        		
        		cont = false;
        		for ( int i2 = 0; i2 < 10; i2++ )
        			if ( digits[i2] == false ) cont = true;
        		if (!cont) break;
        		iterations++;
        		current += N;
        	} while (cont && iterations < MAX_ITERATIONS);
        	
        	
        	
        	// -CALCULATIONS

        	// Output
        	out.println("Case #"+(i+1)+": "+(iterations == MAX_ITERATIONS ? "INSOMNIA" : current));
            out.flush();
        }
        
        out.close();
    }
    
/*
     .----------------------------------------.
     |        GENERAL HELPER FUNCTIONS        |
     :----------------------------------------:
     |  - Time Functions                      |
     |    - String (24-hour Standard) <-> Int |
     |      - timeToInt(String)               |
     |      - intToTime(int)                  |
     |  - Text Formatting                     |
     |    - Text Padding                      |
     |      - getPadding(int)                 |
     |      - getPadding(int,String)          |
     |    - Text/number reversal functions    |
     |      - reverse(int)                    |
     |      - reverse(String)                 |
     |    - Palindrome functions              |
     |      - isPalindrome(long)              |
     |      - isPalindrome(String)            |
     |  - Testing & Controls                  |
     |    - shouldSkipTestCase(int)           |
     |    - nextInt()                         |
     |    - nextIntArray()                    |
     |    - nextString()                      |
     |    - nextSplitString()                 |
     |    - nextSplitString(String)           |
     |  - LCM Function                        |
     '----------------------------------------'
*/
}
