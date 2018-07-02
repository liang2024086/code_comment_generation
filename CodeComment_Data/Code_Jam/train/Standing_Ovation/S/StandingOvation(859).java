package methodEmbedding.Standing_Ovation.S.LYD287;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * StandingOvation
 */
public class StandingOvation {
	
	/**
	 * @throws IOException */
    public static void main(String[] args ) throws IOException{
    
    	BufferedReader reader = new BufferedReader(new FileReader(new File(args[0])));  
    	
    	int nTestCases = Integer.valueOf(reader.readLine());
    	for (int i = 1; i <= nTestCases; i++) {
    		String[] data = reader.readLine().trim().split(" ");
    		
    		int cFriends = 0;
    		int sum = 0;
    		for (int c = 0; c != data[1].length(); c++) {
    			// System.out.println(c + ", sum="+sum);
    			int cShyness = Integer.valueOf(data[1].substring(c, c + 1));
    			if ((c > 0) && (sum < c)) {
					cFriends += (c - sum); 
					sum = c;    				
    			}
    			sum += cShyness;
    		}
    		
    		System.out.println("Case #" + i + ": " + String.valueOf(cFriends));
    	}
    	
        reader.close();
    }
    
}
