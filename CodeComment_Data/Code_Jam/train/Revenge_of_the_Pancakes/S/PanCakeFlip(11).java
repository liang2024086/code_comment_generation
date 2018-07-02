package methodEmbedding.Revenge_of_the_Pancakes.S.LYD680;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;


public class PanCakeFlip {
	public static void main(String[] args){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = 0;
        try {
			T = Integer.parseInt(br.readLine());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        for(int i=1;i<=T;i++){
        	String input = null;
        	try {
				input = br.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        	int index=0;
        	int pass = 0;
        	StringBuilder inputEdit = new StringBuilder(input);
        	while(true){
        		index = 0;
        		
        		boolean done = true;
        		for(int j=0;j<input.length();j++){
        			//System.out.println(inputEdit.charAt(j));
        			if(inputEdit.charAt(j) == '-'){
        				done = false;
        			}
        		}
        		if(done){
        			break;
        		}
        		
        		while(index <= input.length()-1 && inputEdit.charAt(index)!= '-'){
        			//Flipping all + to -
        			inputEdit.setCharAt(index, '-');
        			index++;
        		}
        		
        		while(index <= input.length()-1  && inputEdit.charAt(index)!= '+'){
        			inputEdit.setCharAt(index, '+');
        			index++;
        		}
        		pass++;
        	}
        	
        	System.out.println("Case #"+i+": "+pass);
        }
	}
}
