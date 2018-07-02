package methodEmbedding.Counting_Sheep.S.LYD711;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class probA {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
	    BufferedReader in = new BufferedReader (new FileReader("A-small-attempt1.in"));
	    int numlines = Integer.parseInt(in.readLine());
	    for( int i = 0; i < numlines ; i++){
	    	int N = Integer.parseInt(in.readLine());
	    	boolean[] foundarr = new boolean[10];
	    	boolean foundall = false;
	    	boolean diff = false;
	    	int mult = 1;
	    	int currn = N;
	    	boolean[] temp;
	    	System.out.print("Case #"+(i+1) +": " );
	    	while(foundall == false){
	    		String Nstring = Integer.toString(currn);
	    		temp = new boolean[10];
	    		for( int j = 0 ; j <Nstring.length(); j++){
	    			temp[j] = foundarr[j];
	    		}
	    		for(int j = 0 ; j <Nstring.length(); j++){
	    			foundarr[Nstring.charAt(j) -48] = true;
	    		}
	    		foundall = true;
	    		for( int j = 0; j < 10; j++){
	    			if(foundarr[j] == false){
	    				foundall = false;
	    				break;
	    			}
	    		}
	    		if(foundall == true){
	    			System.out.print("" + currn + "\n");
	    			break;
	    		}
	    		diff = false;
	    		for( int j = 0; j < 10; j++){
	    			if(foundarr[j ] != temp[j ]) diff= true;
	    			
	    		}
	    		if(diff == false){
	    			System.out.print("INSOMNIA\n");
	    			break;
	    		}
	    		else{
	    			mult++;
	    			currn = N * mult;
	    		}
	    	}
	    }

	}

}
