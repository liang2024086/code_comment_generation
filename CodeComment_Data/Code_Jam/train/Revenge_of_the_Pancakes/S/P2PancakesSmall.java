package methodEmbedding.Revenge_of_the_Pancakes.S.LYD365;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class P2PancakesSmall {

	public static void main(String[] args) throws IOException {
		
		BufferedWriter br = new BufferedWriter( new FileWriter("p2/p2-out.txt"));
	    Scanner in = new Scanner(new BufferedReader(new FileReader("p2/B-small-attempt0.in")));
	    int n = in.nextInt(); 
	    in.nextLine();
	    
	    for(int i=1; i <= n; i++){
	    	String pancakes = in.nextLine();
	    	pancakes = pancakes.trim();
	    	
	    	
	    	if("".equals(pancakes) || !pancakes.contains("-") ){
	    		br.write("Case #" + i +": 0\n");
	    		continue;
	    	}
	    	
	    	if(!pancakes.contains("+")){
	    		br.write("Case #" + i +": 1\n");
	    		continue;
	    	}
	    	
	    	
	    	int numberOfFlips = 0;
	    	char pancakeCurrentSide = '+';
	    	if ('-' == pancakes.charAt(pancakes.length()-1)){
	    		numberOfFlips++;
	    		pancakeCurrentSide='-';
	    	}
	    	
	    	for(int r=pancakes.length()-1; r>-1 ; r--){
	    		char rChar = pancakes.charAt(r);
	    		if(rChar != pancakeCurrentSide){
	    			numberOfFlips++;
	    			
	    			// switch the side
	    			if(pancakeCurrentSide == '-'){
	    				pancakeCurrentSide = '+';
	    			}else{
	    				pancakeCurrentSide = '-';
	    			}
	    		}
	    	}
	    	
	    	br.write("Case #" + i +": "+ numberOfFlips + "\n");
	    }
	    
	    in.close();
	    br.flush();
	    br.close();

	}

}
