package methodEmbedding.Standing_Ovation.S.LYD1244;

import java.util.ArrayList;

/**
 * Write a description of class StandingOvation here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StandingOvation
{
    static String filename = "A-small-attempt0.in.txt";
    static String outFileName = "StandingOvationResults.txt";
    public static void main(String [] args)
    {
        System.out.print("a\f");
        Problem prob = HelperFunctions.getContentsOfFile(filename, 1, 1, 0);
        
        ArrayList<String> answers = new ArrayList<String> ();
        
        for(int a = 0; a < prob.cases.size(); a++)
        {
            int friendsNeeded = 0;
            
            String [] splitCase = prob.cases.get(a).get(0).split(" ");
            String myCase = splitCase[1];
            
            int numStanding = myCase.charAt(0)-48;
            for(int b = 1; b < myCase.length(); b++)
            {
                char currentChar = myCase.charAt(b);
                int val = currentChar - 48;
                
                if(numStanding < b)
                {
                    friendsNeeded += (b - numStanding);
                    numStanding += (b - numStanding + val);
                }
                else
                {
                    numStanding += val;
                }
            }
            
            answers.add("" + friendsNeeded);
        }
        
        HelperFunctions.writeCasesToFile(outFileName, answers);
    }
}
