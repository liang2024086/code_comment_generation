package methodEmbedding.Magic_Trick.S.LYD146;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


public class codejamA {

	
	public static void main(String[] args) throws IOException {
     
		Scanner x = new Scanner(new File("A.txt"));
		PrintWriter out = new PrintWriter(new FileWriter("resA.txt"));
		   
		int t=x.nextInt();
		int count=1;
		while(t--!=0){
			int first=x.nextInt();
			int arr[]=new int [4];
			for(int i=0;i<4;i++){
				for(int j=0;j<4;j++){
					int m=x.nextInt();
					if(i==first-1){
						arr[j]=m;
					}					
				}
			}
	int second=x.nextInt();
	     int counter=0;
	     int numis=0;
	      for(int i=0;i<4;i++){
	    	  for(int j=0;j<4;j++){
	    	int m=x.nextInt();
	    	
	    	if(i==second-1){
	    		for(int s=0;s<4;s++){
	    	if(m==arr[s]){
	    		counter++;
	    		numis=m;
	    	}	
	    		}
	    		
	    	}	    		  
	    		  
	    	  }
	      }
			
		if(counter==1){
			out.println("Case #"+count+": "+numis);
		}	
		else if(counter==0){
			out.println("Case #"+count+": Volunteer cheated!");	
		}
		else{
			out.println("Case #"+count+": Bad magician!");
			
		}
			
		
		
			count++;
		}
		
		out.close();
		
	}

}
