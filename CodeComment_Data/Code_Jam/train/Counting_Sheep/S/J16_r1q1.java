package methodEmbedding.Counting_Sheep.S.LYD347;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;


public class J16_r1q1 {
	
	   public static void main(String [] args) {
		    File infile = new File("C:\\Users\\iftikhar\\Downloads\\A-small-attempt0.in");
	 	    File outFile = new File("C:\\Users\\iftikhar\\Downloads\\A-small-attempt0.out");

	        try {
	 	    BufferedReader br = new BufferedReader(new FileReader(infile));
	 	    BufferedWriter bw = new BufferedWriter(new FileWriter(outFile));
	 	    int testCases = Integer.parseInt(br.readLine());
	 	    
	 	    for(int t=1;t<=testCases;t++){
	 	    	int N = Integer.parseInt(br.readLine()); 
	 	    	int O=N;
	 	    	if(N!=0){
	 	    				int d[]=new int[10];
			 	    		for(int i=0;i<=9;i++){
				 	    		d[i]=0;
				 	    	}
			 	    		boolean flag1=true;
			 	    		for(int l=1;l<=1000000&&flag1;l++){
			 	    			N=O*l;
				 	    		int number=N; 
					 	    	while (number > 0) {
					 	    	    if( d[(number%10)]==0 )d[(number%10)]=1;
					 	    	    number = number / 10;
					 	    	}
					 	    	flag1=false;
					 	    	for(int i=0;i<=9;i++){
					 	    		if(d[i]==0)flag1=true;
					 	    	}
					 	    	if(flag1==false)bw.write("Case #"+t+": "+N+"\n");
					 	    	
			 	    		}
				 	    	
		 	    }
		 	    else{
		 	    	bw.write("Case #"+t+": INSOMNIA\n"); 
		 	    }
	 	    	
	 	    	
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
