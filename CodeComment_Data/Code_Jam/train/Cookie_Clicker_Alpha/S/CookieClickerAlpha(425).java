package methodEmbedding.Cookie_Clicker_Alpha.S.LYD709;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CookieClickerAlpha {
	 static BufferedWriter writer;  
     static BufferedReader reader; 

	public static void main(String[] args) throws IOException {
	    File inFile = new File("C:\\Users\\Administrator\\Downloads\\B-small-attempt1.IN"); // input file  
        File outFile = new File("C:\\Users\\Administrator\\Downloads\\outputB1.out"); // outfile  
        FileWriter fwriter = new FileWriter(outFile);  
        writer = new BufferedWriter(fwriter);  
        FileReader freader = new FileReader(inFile);  
        reader = new BufferedReader(freader);  
        int numCases = Integer.parseInt(reader.readLine());  
        System.out.println("numcases = " + numCases);
        for(int i=0;i<numCases;i++)
        {
        	String line=reader.readLine();
        	String [] numbers=line.split(" ");
        	double C=Double.parseDouble(numbers[0]);
        	double F=Double.parseDouble(numbers[1]);
        	double X=Double.parseDouble(numbers[2]);
        	double time=0;

        	double cookies=2;
        	while(true)
        	{
        		
        		
        		if(X/cookies>(C/cookies+X/(cookies+F)))
        		{
        			time=time+C/cookies;
        			cookies=cookies+F;
        			
        		}
        		else
        		{
        			time=time+X/cookies;
        			writer.write("Case #"+(i+1)+": "+time);
          		    writer.newLine();
          		    break;
        		}
        	}
        		
        }
        
        
        writer.close();
	}

}
