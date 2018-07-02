package methodEmbedding.Cookie_Clicker_Alpha.S.LYD753;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;


public class Cookie_Clicker
{

	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new FileWriter("Cookie.out"));
        String line = br.readLine();
        int numTestCases = Integer.parseInt(line);
        double[] cfx = new double[3];
        double c = 0; 
        double f = 0;
        double x= 0;
         
        for (int i = 0; i < numTestCases; ++i)
        {
        	double timeSpendAlready = 0;
        	double currentTime = 0;
        	double afterBank = 0;
        	double pps = 2;
        	line = br.readLine();
        	String[] integers = line.split(" ");
    		for(int k = 0; k < 3; ++k)
        	{
    			cfx[k] = Double.parseDouble(integers[k]);
        	}
    		c = cfx[0];
    		f = cfx[1];
    		x = cfx[2];
    		while(true)
    		{
    			currentTime = timeSpendAlready + x/pps;
    			afterBank = timeSpendAlready + c/pps + (x/(pps + f));
    			if(afterBank < currentTime)
    			{
    				// Buy the bank
    				timeSpendAlready += c/pps;
    				pps += f; 
    			}
    			else
    			{
    				break;
    			}
    		}
    		writer.write("Case #"+(i+1) +": "+currentTime+"\n");
    		//System.out.println("Case #"+(i+1) +": "+currentTime+"\n");
        }
        br.close();
        writer.close();
	}

}
