package methodEmbedding.Standing_Ovation.S.LYD1761;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class r1q1 {
	   public static void main(String [] args) {
		    File infile = new File("C:\\Users\\iftikhar\\Downloads\\A-small-attempt0.in");
	 	    File outFile = new File("C:\\Users\\iftikhar\\Downloads\\A-small-attempt0.out");

	        try {
	 	    BufferedReader br = new BufferedReader(new FileReader(infile));
	 	    BufferedWriter bw = new BufferedWriter(new FileWriter(outFile));
	 	    int testCases = Integer.parseInt(br.readLine());
	 	    
	 	    for(int t=1;t<=testCases;t++){
	 	    	
	 	    	String line=br.readLine();
	 	    	String[] splited1 = line.split(" ");
	 	    	int ans =Integer.parseInt(splited1[0]);
	 	    	int stand=Integer.parseInt(splited1[1].charAt(0)+"");
	 	    	int req=0;
	 	    	for(int i=1;i<=ans;i++)
	 	    	{	
	 	    		int y=Integer.parseInt(splited1[1].charAt(i)+"");
	 	    		if(y==0)continue;
	 	    		else if(stand<i) {
	 	    			req+=i-stand;
	 	    			stand+=i-stand;
	 	    			stand+=y;
	 	    		}
	 	    		else stand+=y;
	 	    	}
	 	    
	 	    	bw.write("Case #"+t+": "+req+"\n");
	 	    	
	 	    }
	 	    br.close();
	 	    bw.close();        
	        }
	        catch(FileNotFoundException ex) {
	            System.out.println(
	                "Unable to open file");                
	        }
	        catch(IOException ex) {
	            System.out.println(
	                "Error reading file");                   
	        }
	    }

}
