package methodEmbedding.Standing_Ovation.S.LYD233;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class StandingOvation {

	public static void main(String[] args) {
		
		try{
			// Set up the input and output files
		    System.setIn(new FileInputStream("A-small-attempt0.in"));
		    System.setOut(new PrintStream(new FileOutputStream("A-small-attempt0.out")));
		    Scanner in = new Scanner(System.in);
		    //T test cases
		    int T = Integer.parseInt(in.nextLine());
		    for (int caseNumber = 1; caseNumber <= T; caseNumber++) {
		    	String line = in.nextLine();
		    	String[] split = line.split(" ", 2);
		    	int Smax = Integer.parseInt(split[0]);
		    	char[] arr = split[1].toCharArray();
		    	
		    	int standCounter = 0;
			    int addCounter = 0;
			    
			    for(int i=0; i<=Smax; i++){
		    		int current = Character.getNumericValue(arr[i]);
		    		if(i<=standCounter){
		    			standCounter += current;
		    		}else{
		    			addCounter += (i-standCounter);
		    			standCounter += (current + i - standCounter);
		    		}
		    	}
			    System.out.println("Case #" + caseNumber + ": " + addCounter);
		    }
		    in.close();
		}catch(Exception e){
			//do nothing
		}
		
		
		
	}

}
