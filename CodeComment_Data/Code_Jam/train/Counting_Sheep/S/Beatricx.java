package methodEmbedding.Counting_Sheep.S.LYD724;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Hashtable;

public class Beatricx {
	
	public static void main(String[] args) throws IOException
	{
		FileReader in = new FileReader("D:\\codejam\\A-small-practice.in");
	    BufferedReader br = new BufferedReader(in);
	    
	    FileWriter fw = new FileWriter("D:\\codejam\\output.txt");
	    PrintWriter p = new PrintWriter(fw);
	    
	    String line;
	    int numTestCases = Integer.parseInt(br.readLine());
	    for (int i = 0; i < numTestCases ; ++i)
	    {
	    	long num = Long.parseLong(br.readLine());
	    	boolean[] map = new boolean[]{true, true, true, true, true, true, true, true, true, true};
	    	if (num == 0)
	    	{
	    		p.append("Case #" + (i+1) + ": INSOMNIA" + "\n");
	    		continue;
	    	}
	    	
	    	int hitCount = 10;
	    	int counter = 1;
	    	long N = num;
	    	long lastNum = num;
	    	while(true)
	    	{	    		
	    		while (N != 0)
		    	{
	    			int index = (int) N % 10;
	    			N = N / 10;
	    			
		    		if (map[index])
		    		{
		    			map[index] = false;
		    			--hitCount;
		    		}
		    	}	    		
	    		
	    		if(hitCount <= 0)
	    		{
	    			p.append("Case #" + (i+1) + ": " + lastNum  + "\n");
	    			break;
	    		}
	    		
	    		++counter;
	    		lastNum = N = num * counter;	    		
	    	}
	    	
	    }
	    
	    br.close();
	    p.close();
	}	
}
