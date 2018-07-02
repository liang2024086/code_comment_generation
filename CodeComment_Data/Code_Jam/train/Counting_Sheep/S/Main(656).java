package methodEmbedding.Counting_Sheep.S.LYD1117;

import java.util.*;
import java.io.*;
public class Main {
  public static void main(String[] args) {
	  
	  try {
		System.setIn(new FileInputStream("src/input.txt"));
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  
	int[] digits = new int[10];
	  
    Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    int T = in.nextInt();  // No of test cases
    long N;
    long newN;
    long outN;
    int digit;
    // Loop for each test case
    for (int i = 1; i <= T; i++)
    {
    	
    	N = in.nextInt();
    	if (N == 0)
    	{
    		System.out.println("Case #" + i + ": INSOMNIA");
    		continue;
    	}
    	// loop from 1 to < 10
    	int j = 1;
    	
    	numLoop:
    	while (true)
    	{
    		// generate new number
    		newN = outN = N * j;
    		j++;
    		
    		// modulo divide until < 10 while setting digit flags
    		while (newN > 0)
    		{
    			int sum = 0;
    			digit = (int) (newN % 10);
    			newN = newN / 10;
    			digits[digit] = 1;
    			
    			int count = 0; 
    			while (count < 10)
    			{
    				sum += digits[count];
    				count++;
    			}
    			if (sum == 10)
    			{
    				// all digits reached
    				System.out.println("Case #" + i + ": " + outN);
    				break numLoop;
    			}
    			
    		}
    		
    	}
    	digits = new int[10];
    }
    in.close();
  }
}
