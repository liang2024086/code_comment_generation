package methodEmbedding.Standing_Ovation.S.LYD890;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class StandingOvation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int noTests = in.nextInt();
        in.nextLine();
        
        for(int test=1; test<=noTests; test++) {
            String[] sLine = in.nextLine().split(" ");
            
            int sMax = Integer.parseInt(sLine[0]);
            
            int[] counts = new int[sMax+1];
            char[] countsString = sLine[1].toCharArray();
            
            for(int i=0; i<countsString.length; i++) {
                counts[i] = countsString[i] - '0';
            }
            
            //time to do actual solving
            int peopleStanding = 0;
            int extraPeople = 0;
            
            for(int i=0; i<counts.length; i++) {
                //add extra people if necessary
                if(peopleStanding < i) {
                    extraPeople += i - peopleStanding;
                    peopleStanding = i;
                }
                
                //calculate how many people stood up
                peopleStanding += counts[i];
            }
            
            //print out the output
            System.out.printf("Case #%d: %d%n", test, extraPeople);
        }
    }
}

