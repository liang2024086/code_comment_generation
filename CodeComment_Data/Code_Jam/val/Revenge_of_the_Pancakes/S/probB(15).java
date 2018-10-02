package methodEmbedding.Revenge_of_the_Pancakes.S.LYD808;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class probB {
	public static void main(String [] args) throws NumberFormatException, IOException{
		BufferedReader in = new BufferedReader (new FileReader("B-small-attempt4.in"));
	    int numlines = Integer.parseInt(in.readLine());
	    File file = new File("output.txt");
	    BufferedWriter bw = new BufferedWriter(new FileWriter(file));
	   	for( int lines = 0 ; lines < numlines; lines++){
	   		bw.write("Case #"+ (lines+1) + ": ");
	   		System.out.print("Case #"+ (lines+1) + ": ");
	    	String stackstr = in.readLine();
	    	int length = stackstr.length() -1; 
	    	boolean [] stack = new boolean[length  + 1];

	    	for( int i = 0 ; i <= length ; i++){
	    		if(stackstr.charAt(i) == '+') 
	    			stack[i] = true;
	    	}
	    	boolean foundall = true;
	    	for( int i = 0 ; i <= length; i ++){
	    		if(stack[i] == false){
	    			foundall = false;
	    			break;
	    		}
	    	}
	    	if( foundall == true){
	    		bw.write("0\n");
	    		System.out.print("0\n");
	    		continue;
	    	}	    	
	    	int happybase = length;
	    	int pannum;
    		for(pannum = happybase; pannum !=0 ; pannum--){
    			if(stack[pannum] == false) break;
    		}
    		int flips = 1;
    		happybase= pannum;
	    	while(foundall == false){
	    		if(stack[0] == true && happybase == 0) {
	    			stack[0] = false;
	    			foundall = true;
	    			bw.write("" + flips + "\n");
	    			System.out.print("" + flips + "\n");
	    			continue;
	    			
	    		}
	    		if(stack[0] == true){
	    			int j = 0;
	    			while(stack[j] == true){
	    				stack[j] = false;
	    				j++;
	    			}
	    			flips++;
	    		}

	    		boolean pantemp;
	    		pannum = happybase;
	    		for( int i = 0; i <=pannum; i++){
	    			pantemp = stack[i];
	    			stack[i] = !stack[pannum];
	    			stack[pannum] = !pantemp;
	    			
	    			
	    			pannum--;
	    		}
	    		
	    		for( int i = happybase; i >= 0 ; i--){
	    			if(stack[i] == false){
	    				happybase = i;
	    				break;
	    			}
	    			if(i == 0 ) 
	    				happybase = 0;
	    		}
	    		if(happybase != 0){
	    			flips++;
	    			
	    		}
	    		else {
	    			foundall = true;
	    			bw.write("" + flips + "\n");
	    			System.out.print("" + flips + "\n");
	    		}
	    		
	    	}
	    }
	   	bw.close();
	}
}
