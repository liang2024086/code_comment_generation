package methodEmbedding.Counting_Sheep.S.LYD367;

import java.util.*;
import java.io.*;
public class Main {
  public static void main(String[] args) throws IOException {
	  File file = new File("C:\\Users\\mwarczok\\Downloads\\A-small-attempt0.in");
	    File outFile = new File("C:\\Users\\mwarczok\\Downloads\\output.out");
	    BufferedReader br = new BufferedReader(new FileReader(file));
	    BufferedWriter bw = new BufferedWriter(new FileWriter(outFile));
	    int testCases = Integer.parseInt(br.readLine());
	    for(int t=1;t<=testCases;t++){
	    	String N = br.readLine();
	    	if (N.equals("0"))
	    		bw.write("Case #" + t +": INSOMNIA" + "\n");
	    	else
	    	{
		    	String digits = "";
		    	String n = N;
	    		while (digits.length() < 10){
			    	for (int i = 0; i < 10; i++)
			    	{
			    		String s = Integer.toString(i);
			    		if (n.contains(s) && !digits.contains(s))
			    			digits += s;
			    	}
			    	if (digits.length() < 10)
			    		n = ((Long)(Long.parseLong(N)+Long.parseLong(n))).toString();
		    	}
	    		bw.write("Case #" + t +": " + n + "\n");
	    	}
	    }
	    br.close();
	    bw.close();
  }
}
