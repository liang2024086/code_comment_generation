package methodEmbedding.Standing_Ovation.S.LYD1592;

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
        Problem problem = HelperFunctions.getContentsOfFile("A-small-attempt0.in", 1, 1, 0);
        
        ArrayList<String> outputList = new ArrayList<String>();
        for(int a = 0; a < problem.cases.size(); a++) {
            String[] splitCase = problem.cases.get(a).get(0).split(" ");
            String mainString = splitCase[1];
            
            int numberOfPeopleStanding = mainString.charAt(0) - 48;
            int numberOfFriends = 0;
            
            for(int b = 1; b < mainString.length(); b++) {
                int numberOfPeopleAtShynessLevel = mainString.charAt(b) - 48;
                
                if(b > numberOfPeopleStanding) {
                    numberOfFriends += b-numberOfPeopleStanding;
                    numberOfPeopleStanding += b-numberOfPeopleStanding;
                }
                numberOfPeopleStanding += numberOfPeopleAtShynessLevel;
            }
            
            outputList.add(""+numberOfFriends);
        }
        
        HelperFunctions.writeCasesToFile("practice-a.out", outputList);
   }
}
