package methodEmbedding.Revenge_of_the_Pancakes.S.LYD43;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;


public class J16_r1q2 {
	
	   public static void main(String [] args) {
		    File infile = new File("C:\\Users\\iftikhar\\Downloads\\B-small-attempt1.in");
	 	    File outFile = new File("C:\\Users\\iftikhar\\Downloads\\B-small-attempt1.out");

	        try {
	 	    BufferedReader br = new BufferedReader(new FileReader(infile));
	 	    BufferedWriter bw = new BufferedWriter(new FileWriter(outFile));
	 	    int testCases = Integer.parseInt(br.readLine());
	 	    
	 	    for(int t=1;t<=testCases;t++){
	 	    	String line=br.readLine();
	 	    	int count=0;
	 	    	char[] nline=line.toCharArray();
	 	    	for(int i=nline.length-1;i>=0;)
	 	    	{
	 	    		if(nline[i]=='+'){i--;}
	 	    		else{
	 	    			if(nline[0]=='+'){
	 	    				for(int h=0;h<=i;h++){
		 	    				if(nline[h]=='+')nline[h]='-';
		 	    				else break;
	 	    				}
	 	    				count++;
	 	    			}
	 	    			char[] tarry= new char[i+1];
	 	    			for(int j=0;j<=i;j++)
	 	    			{
	 	    				if(nline[j]=='+')tarry[i-j]='-';
	 	    				if(nline[j]=='-')tarry[i-j]='+';
	 	    			}
	 	    			for(int j=0;j<=i;j++)
	 	    			{
	 	    				nline[j]=tarry[j];
	 	    			}
	 	    			count++;
	 	    		}
	 	    		//bw.write("Case #"+t+": "+new String(nline)+"\n");
	 	    	}
				bw.write("Case #"+t+": "+count+"\n");
	 	    	
	 	    	
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
