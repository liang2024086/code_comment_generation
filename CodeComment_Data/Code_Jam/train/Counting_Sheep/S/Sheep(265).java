package methodEmbedding.Counting_Sheep.S.LYD1375;

import java.util.*;
import java.io.*;
public class Sheep {
  public static void main(String[] args) throws Exception{
    // Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    BufferedReader in = new BufferedReader(new FileReader("A-small-attempt1.in"));
    BufferedWriter out = new BufferedWriter(new FileWriter("A-small-attempt1.out"));

    int t = Integer.parseInt(in.readLine());  // Scanner has functions to read ints, longs, strings, chars, etc.

    for (int i = 1; i <= t; ++i) {
    	String s = in.readLine();
    	double n = Double.parseDouble(s);
    	double k = 1;
    	int seen = 0;

    	if(n == 0)
    	{
    		out.write("Case #" + i + ": " + "INSOMNIA"+"\r\n");
    		continue;
    	}

    	HashMap<String, Integer> sheep = new HashMap<String, Integer>();

    	for(int j = 0; j < 10; j++)
    	{
    		sheep.put("" + j, 0);
    		// System.out.println(sheep.get(j+""));
    	}


    	while(seen < 10)
    	{
	    	boolean quit = false;
    		s = k * n + "";
    		// System.out.println(k);

    		for(int j = 0; j < s.length() && !quit; j++)
    		{
    			if(s.charAt(j) == '.'){
    				quit = true;
    				continue;
    			}

    			String num = s.charAt(j) + "";

    			if(sheep.get(num) == 0)
    			{
    				seen++;
    				sheep.put(num, 1);
    				// System.out.println(num);	
    			}
    		}
	    	k++;
    		
    	}
    	String f = s + "";
    	f = f.substring(0, f.indexOf("."));
    	out.write("Case #" + i + ": " + f);
    	out.write("\r\n");
    }
    in.close();
    out.close();
  }
}
