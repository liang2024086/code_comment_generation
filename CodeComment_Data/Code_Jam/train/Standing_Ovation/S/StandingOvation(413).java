package methodEmbedding.Standing_Ovation.S.LYD1972;

import java.util.*;

/**
 * Write a description of class StandingOvation here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StandingOvation
{
    public static void main(String[] args) {
        System.out.println("\u000c");
        Problem problem = helper_functions.getContentsOfFile("A-small-attempt2.in.txt", 1, 1, 0);
        
        ArrayList<String> outputList = new ArrayList<String>();
        for(int a = 0; a < problem.cases.size(); a++) {
            String[] splitArray = problem.cases.get(a).get(0).split(" ");
            String shynessString = splitArray[1];
            
            int numPeopleStanding = shynessString.charAt(0) - 48;
            int numFriends = 0;
            
            for (int b = 1; b < shynessString.length(); b++) {
                int numPeopleAtShyLevel = shynessString.charAt(b) - 48;
                
                if (b > numPeopleStanding) {
                    numFriends += b - numPeopleStanding;
                    numPeopleStanding += b - numPeopleStanding;
                }
                numPeopleStanding += numPeopleAtShyLevel;
            }
            
            outputList.add(""+numFriends);
        }
        
        helper_functions.writeCasesToFile("practice-a.out", outputList);
    }
}
