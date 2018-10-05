package methodEmbedding.Revenge_of_the_Pancakes.S.LYD1120;

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
	  
    Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    int T = in.nextInt();  // No of test cases
    in.nextLine();

    // Loop for each test case
    for (int t = 1; t <= T; t++)
    {
    	// Read the line
    	int flip = 0;
    	String line = in.nextLine();
    	if (line == "+")
    	{
    		flip = 0;
    	}
    	else if (line == "-")
    	{
    		flip = 1;
    	}
    	else
    	{
	    	char curC = line.charAt(0);
	    	for (int i = 1; i < line.length(); i++)
	    	{
	    		char c = line.charAt(i);
	    		if (curC != c)
	    		{
	    			flip++;
	    			curC = c;
	    		}
	    		
	    	}
    	}
    	if (line.charAt(line.length()-1) == '-')
    	{
    		flip++;
    	}
    	
    	System.out.println("Case #" + t + ": " + flip);
    }
    in.close();
  }
}
