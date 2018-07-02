package methodEmbedding.Revenge_of_the_Pancakes.S.LYD725;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class test2 {
	
	
	

	public static void main(String[] args) {
		
		
		
		
		    Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		    int t = in.nextInt();
		    for (int i = 1; i <= t; i++) {
		    	
		    int j=0;
		    String a = in.next();
		    String[] spl = a.split("(?!^)");
		    int pos =0;
		    if(spl.length>1){
		    
		    while ( pos <spl.length-1) {
		    	if(spl[pos].equalsIgnoreCase("-")){
				    	if(pos-1>=0) {
				    		if (spl[pos-1].equalsIgnoreCase("+")) j=j+2;
				    		else j++;
				    	}
				    	else{
				    		if (pos==0) j++;
				    		}
			    while(spl[pos].equalsIgnoreCase("-")){
				    	  pos++;
				    	  if (pos==spl.length) break;
				    	}
		    }
		    else 
		    	pos++;		    	
		    }
		    if(pos>0){
			    if (spl[pos-1].equalsIgnoreCase("+")&& spl[pos].equalsIgnoreCase("-")) j=j+2;
	    		else if(pos<spl.length){
	    			if(spl[pos].equalsIgnoreCase("-"))
	    			j++;}
		    }
		    
		    }
		    else if(spl[pos].equalsIgnoreCase("-")) j++;
		    
		    
		    System.out.println("Case #" + i + ": " +j);
		    }
	}

}
