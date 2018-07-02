package methodEmbedding.Standing_Ovation.S.LYD544;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;


public class StandingOvation
{

	public static void main(String[] args) throws IOException
	{
	    BufferedReader br = new BufferedReader(new FileReader("E:\\A-small-attempt3.in"));
	    try {
	        
	        String line = br.readLine();
	        int tests = Integer.parseInt(line);
	        line = br.readLine();
	        int sMax;
	        String shynessString;
	        int count = 0;
	        int test = 1;
	        int personsStanding = 0;
	        while (line != null) {            
	            StringTokenizer st = new StringTokenizer(line);
	            if (st.hasMoreTokens()) {
	                sMax = Integer.parseInt(st.nextToken());
	            }  
	            
	            if (st.hasMoreTokens()) {
	            	int personShynessLevel=0;
	            	shynessString = st.nextToken();
		            for(char ch:shynessString.toCharArray() ){
		            	int personShyness = Integer.parseInt(Character.toString(ch));
		            	
		            	if (personShyness == 0 && personShynessLevel>= personsStanding ){
		            		++count;
		            		personsStanding++;
		            	} else {
		            		personsStanding+=personShyness;
		            	}
		            	personShynessLevel++;
		            }
	            }
	            System.out.println("Case #"+test+": "+count);

	            
	            
	            ++test;
	            count = 0;
	            personsStanding = 0;
	        	line = br.readLine();
	        }
	       
	    } finally {
	        br.close();
	    }

	}

}
