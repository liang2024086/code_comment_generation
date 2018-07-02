package methodEmbedding.Standing_Ovation.S.LYD329;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class StandingOvation {
	public static void main(String[] args) {
	    try {
	        int result = 0;
	         
	    	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	        int testCases = Integer.parseInt(in.readLine());
	        
	        for (int i = 1, length = testCases; i <= length; i++) {
	            String test = in.readLine();
	            String[] line1 = test.split(" ");
	            
	            int positions = Integer.parseInt(line1[0]);
	            
	            int numOfAudienceMembers = Integer.parseInt(line1[1].charAt(0)+"");
	            int currentPeopleStanding = numOfAudienceMembers;
	            
	            for (int shyness = 1; shyness <= positions; shyness++) {
	                
	                numOfAudienceMembers = Integer.parseInt(line1[1].charAt(shyness)+"");
	                
	                if (currentPeopleStanding >= shyness) {
	                    currentPeopleStanding += numOfAudienceMembers;
	                } else {
	                    result += shyness - currentPeopleStanding;
	                    currentPeopleStanding += shyness - currentPeopleStanding + numOfAudienceMembers;
	               }
	            }
	            
	            System.out.println("Case #" + i + ": " + result);
	            result = 0;
	        }
	    }
	    catch (IOException e) {}
	}
}
