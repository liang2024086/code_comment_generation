package methodEmbedding.Standing_Ovation.S.LYD714;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class standingOvation {
    
    public static void main(String[] args) {
        
        try (BufferedReader br = new BufferedReader(new FileReader("/home/gunjan/kishu/A-small-attempt2.in")))
        {
            BufferedWriter wr = new BufferedWriter(new FileWriter("/home/gunjan/kishu/StandingOvationOutput.in"));
            String testCases;
            int testCasesNumber, stringLength, numberOfFriends, sum;
            String currentString[];
            testCases = br.readLine();
            testCasesNumber = Integer.parseInt(testCases);
            for(int i=1; i <= testCasesNumber; i++) {
                sum = 0;
                numberOfFriends = 0;
                currentString = null;
                stringLength =0;
                testCases = br.readLine();
                currentString = testCases.split(" ");
                stringLength = Integer.parseInt(currentString[0]);
                for(int j=1; j<= stringLength; j++){
                    sum = sum + (int)(currentString[1].charAt(j-1))-48;
                    if(sum < j) {
                        numberOfFriends++;
                        sum++;
                    }
                }
                try {
                    wr.append("Case #" + i + ": "+ numberOfFriends);
                    wr.newLine();
                    wr.flush();
                } catch(IOException e) {
                    System.out.println(e);
                }
            }
 
        } catch (IOException e) {
            System.out.println(e);
        } 
    }
}

